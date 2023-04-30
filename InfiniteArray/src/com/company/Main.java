package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1,3,5,9,10,12,16,18,24,55,166,189,278,345,378,399,400,455,465,498,555,589,687,698,711,754,781,786,1000};
        System.out.println(answer(nums,345));
    }
    static int answer(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = start;
            start = end + 1;
            end = start + (start - temp)*2;
        }
        return InfiniteBSearch(arr,target,start,end);
    }
    static int InfiniteBSearch(int[] arr, int target,int start,int end){
        while(start <= end){
            int mid = (start) + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
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
