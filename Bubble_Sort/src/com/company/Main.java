package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {3, 5, 8, 1, 2};
        BubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int[] BubbleSort(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j <= arr.length-i-1; j++){
                if(arr[j] < arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   swapped = true;
                }
            }
            if(swapped == false){
                break;
            }


        }
        return arr;
    }

}
