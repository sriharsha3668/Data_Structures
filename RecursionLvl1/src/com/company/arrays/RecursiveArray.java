package com.company.arrays;

public class RecursiveArray {
    public static void main(String[] args) {
        System.out.println(IsSorted(new int[]{5,8,4,10,12}, 0));

    }
    static boolean IsSorted(int[] arr,int index){
        if(index == arr.length - 1){
            return true;
        }
        boolean Istrue = arr[index] < arr[index + 1];
        return Istrue && IsSorted(arr,index+1);
    }
}
