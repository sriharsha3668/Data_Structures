package com.company;

public class MaxElement {
    public static void main(String[] args) {
        int[] nums = {1,53,645,1087,54};
        System.out.println(Max(nums,1,2));

    }
    static int Max(int[] arr,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        if(start > end){
            return -1;
        }
        int max = arr[start];
        for(int i = start; i <= end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
