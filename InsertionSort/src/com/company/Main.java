package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {3,8,1 };
        System.out.println(Arrays.toString(InsertionSort(nums)));
    }
    static int[] InsertionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                    break;
            }
        }
        return arr;

    }

}
