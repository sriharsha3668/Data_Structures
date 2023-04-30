package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_CombinationsSum4 {
    public static void main(String[] args) {

        int[] arr = {4,2,1};
        Arrays.sort(arr);
        System.out.println(count(arr,4,""));
    }
    static ArrayList<String> count(int[] nums, int target, String p){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int counter = 0;
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i < nums.length && nums[i] <= target; i++){
            ans.addAll(count(nums,target-nums[i],p+nums[i]));
        }
        return ans;
    }
}
