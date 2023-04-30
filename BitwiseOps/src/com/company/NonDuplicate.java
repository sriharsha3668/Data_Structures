package com.company;

public class NonDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,7,4};
        System.out.println(NonDupElement(arr));
    }
    static int NonDupElement(int[] arr){
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            num ^= arr[i];
        }
        return num;
    }
}
