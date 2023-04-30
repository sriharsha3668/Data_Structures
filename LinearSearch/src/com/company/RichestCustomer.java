package com.company;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,1,6},
                {3,3,7}
        };
        System.out.print("The Richest Customer is having a wealth of :");
        System.out.println(MaxWealth(arr));

    }
    static int MaxWealth(int[][] accounts){
        int sum;
        int max = Integer.MIN_VALUE;
        for(int[] val: accounts){
            sum = 0;
            for(int i : val){
                sum = sum+i;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
