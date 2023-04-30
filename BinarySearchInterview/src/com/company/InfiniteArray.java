package com.company;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,10,12,14,15,23,54,78,143,175,199,405,883,1054,1487,2803,2999};
        int target = 143;
        System.out.println(search(arr,15));



    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            int newstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newstart;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid +1;
            }
            else
                return mid;
        }
        return -1;
    }

}
