package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = BSearch(nums,target);
        System.out.println(ans);
    }
    static int BSearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else
                start = mid+1;
        }
        return -1;
    }
}
