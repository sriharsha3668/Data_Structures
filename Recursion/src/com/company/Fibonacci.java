package com.company;

public class Fibonacci {
    public static void main(String[] args) {
//        int ans = fibonacciNo(4);
//        System.out.println(ans);
        for(int i = 0; i < 11; i++){
            System.out.println(FiboNo(i));
        }
    }
    static int FiboNo(int n){
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2) , n) + Math.pow(((1 - Math.sqrt(5)) / 2) , n))/ Math.sqrt(5));
    }
    static int fibonacciNo(int n){
        if(n == 0 || n == 1){
            return n;
        }
            return fibonacciNo(n-1) + fibonacciNo(n-2);
    }
}

