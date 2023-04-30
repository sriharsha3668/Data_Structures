package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {2,0};
        System.out.println(Arrays.toString(SelectionSort(nums)));

    }
    static int[] SelectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int max = Max(arr,0,arr.length-i-1);
            swap(arr,max,arr.length-i-1);
        }
        return arr;
    }
    static int Max(int[] arr,int start,int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
