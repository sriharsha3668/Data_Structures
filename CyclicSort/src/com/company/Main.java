package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {3, 4, 1, 5, 2};
        CyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void CyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
           int correct = arr[i] - 1;
           if(arr[i] != arr[correct]){
               swap(arr,i,correct);
           }
            else
              i++;
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
