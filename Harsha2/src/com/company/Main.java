package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] nums = {23,45,1,2,-3,19,-2,11};
//        System.out.println(minelement(nums));

//        int index = LinearSearch(nums,-3);
//        System.out.println(index);

//        String name = "Harsha";
//        char letter = 'r';
//        System.out.println(SearchChar(name,letter));
//        System.out.println(Arrays.toString(name.toCharArray()));
        int[][] arr1 = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int key = 56;
        int[] ans = Search2D(arr1,key);
        System.out.println(Arrays.toString(ans));



    }
    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static boolean SearchChar(String names, char target){
        if(names.length() == 0){
            return false;
        }
        for(int i = 0; i < names.length(); i++){
            if(target == names.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static int minelement(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    static int[] Search2D(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(target == arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
