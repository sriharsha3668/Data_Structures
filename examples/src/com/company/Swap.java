package com.company;

import java.util.Arrays;
import java.util.*;

public class Swap {
    public static void main(String[] args) {
//        int[] nums = {1,52,47,89,33};
//        System.out.println(Arrays.toString(nums));
//        swap(nums,2,3);
//        System.out.println(Arrays.toString(nums));
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        reverse(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void reverse(int[] arr){
       int start = 0;
       int end = arr.length - 1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
