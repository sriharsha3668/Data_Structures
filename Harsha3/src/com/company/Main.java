package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int[] nums = {99,83,76,56,25,12,10,8,-3,-8,-77};
        int ans = BinarySearch(arr,-18);
//        System.out.println(ans);
        int sol = OrderAgnosticBSearch(arr,22);
        int key = OrderAgnosticBSearch(nums,-77);
        System.out.println(Arrays.toString(new int[]{sol,key}));

    }
    static int BinarySearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
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
        return -1;
    }

    static int OrderAgnosticBSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] > target){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }

            else{
                    if(arr[mid] < target){
                        end = mid-1;
                    }
                    else {
                        start = mid+1;
                    }

            }

        }
        return -1;

    }
}
