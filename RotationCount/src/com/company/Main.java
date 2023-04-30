package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {13,14,17,18,2,8,3,6};
        int peak = FindPeak(arr);
        int rotations = peak + 1;
        System.out.println("Number of Rotations : " + rotations);
    }
  static int FindPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] > arr[mid]){
                end = mid - 1;
            }
            else
                start = mid +1;
        }
        return -1;
    }
    static int BinarySearch(int[] arr,int target, int start, int end){
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] > target){
                end = mid -1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else
                return mid;
        }
        return -1;
    }
}
