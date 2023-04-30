package com.company;

public class ExponentialArray {
    public static void main(String[] args) {
        int[] nums = {1,5,9,14,25,43,54,65,71,86,99,110,121,175};
        int target = 71;
        System.out.println(search(nums,target));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            int newstart = end + 1;
            end = end + (end - start + 1)*2;
            start = newstart;
        }
        return BSearch(arr,target,start,end);
    }
    static int BSearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else
                return mid;
        }
        return -1;
    }
}
