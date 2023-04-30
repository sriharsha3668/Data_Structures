package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        helper(nums,0,list,result);
        return new ArrayList(result);
    }
    void helper(int[] nums,int index,List<Integer> list,Set<List<Integer>> result){
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
