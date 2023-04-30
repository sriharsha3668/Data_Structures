package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {2,3,5,9,14,16,18};
        int ans1 = ceiling(arr,20);
        int ans2 = Floor(arr,1);
        System.out.println(Arrays.toString(new int[]{ans1,ans2}));

    }
    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
       if(target > arr[end]){
           return -1;
       }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else
                return mid;
        }
        return arr[start];
    }
    static int Floor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        if(target < arr[start]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else
                return mid;
        }
        return arr[end];
    }
}
