package com.company;

import java.util.Arrays;

public class parameter {
    public static void main(String[] args) {
        int[] nums = {1,52,83,45,32};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
