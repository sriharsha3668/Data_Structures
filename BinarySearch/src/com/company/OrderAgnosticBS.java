package com.company;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] nums = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int[] nums1 = {89,45,22,18,16,15,4,3,2,0,-4,-12,-18};
        int target = -4;
        int ans = BinarySearchAgnostics(nums1,target);
        System.out.println(ans);

    }
    static int BinarySearchAgnostics(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
        int mid = (start+end)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(isAsc){
            if(arr[mid] > target){
                end = mid-1;
            }
            else
                start = mid+1;
        }
        else{
            if(arr[mid] > target){
                start = mid+1;
            }
            else
                end = mid-1;
           }
        }
        return -1;
    }
}
