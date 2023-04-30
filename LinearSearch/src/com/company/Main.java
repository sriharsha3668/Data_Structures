package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,45,54,63,84,75,157,175,1000};
        int target  = 84;
        System.out.println(linearSearch(nums,target));

    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
