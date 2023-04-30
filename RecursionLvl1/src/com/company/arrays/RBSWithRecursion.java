package com.company.arrays;

public class RBSWithRecursion {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 7;
        System.out.println(RBS(arr,2,0,arr.length-1));

    }
    static int RBS(int[] arr,int target,int start,int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] >= arr[start]){
            if(target >= arr[start] && arr[mid] >= target){
                return RBS(arr,target,start,mid - 1);
            }
            else{
                return RBS(arr,target,mid + 1,end);
            }
        }
        else{
            if(target <= arr[end] && arr[mid] <= target) {
                return RBS(arr, target, mid + 1, end);
            }
            else{
                return RBS(arr,target,start,mid - 1);
            }
        }
    }
}
