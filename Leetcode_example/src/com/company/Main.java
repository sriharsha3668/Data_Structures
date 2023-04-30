package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {4,6,7,7};
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        helper(nums,0,list,result);
        System.out.println(result);
    }
    static void helper(int[] nums, int index, List<Integer> list, Set<List<Integer>> result){
        if(index == nums.length){
            if(list.size() >= 2){
                result.add(new ArrayList<>(list));
            }

            return;
        }

        if(list.isEmpty() || list.get(list.size() - 1) <= nums[index]){
            list.add(nums[index]);
            helper(nums,index+1,list,result);
            list.remove(list.size()-1);
        }
        helper(nums,index+1,list,result);
    }
}
