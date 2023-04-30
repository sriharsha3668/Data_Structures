package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Search2DArrays {
    public static void main(String[] args) {
        int [][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target Element");
        int target = in.nextInt();
        int[] pos = search2D(arr,target);
        System.out.println(Arrays.toString(pos));
        System.out.println(max(arr));

    }
    static int[] search2D(int[][] nums, int target){
        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int [][] nums){
        int max = Integer.MIN_VALUE;
        for(int[] val : nums){
            for(int element : val){
                if(element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
