package com.company;

public class CountNoOfZeros {
    public static void main(String[] args) {
        System.out.println(Zeros(301045000));

    }

    static int Zeros(int n){
        int count = 0;
        return helper(n,count);
    }
    static int helper(int n,int count){
        if(n == 0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper(n/10,count + 1);
        }
        return helper(n/10,count);
    }

}
