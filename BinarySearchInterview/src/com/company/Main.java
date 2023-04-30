package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {2,3,6,7,14,16,18};
        int target = 1;
        System.out.println(BSCeiling(nums,target));
        System.out.println(BSFloor(nums,target));
    }
    static int BSCeiling(int[] arr, int target){
        // We need to find the least number which is bigger than our target element
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else
               return arr[mid];
        }
        return arr[start];
    }
    static int BSFloor(int[] arr, int target){
        if(target < arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else
                return arr[mid];
        }
        return arr[end];
    }
}
