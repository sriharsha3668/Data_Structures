package com.company;

public class MinArr {
    public static void main(String[] args) {
        int[] nums = {1,25,48,175,-1,95,24};
        System.out.println(minval(nums));

    }
    static int minval(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
