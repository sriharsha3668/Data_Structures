package com.company;

public class Recursion1toN {
    public static void main(String[] args) {
//        rec1toN(1,5);
//        RevNto1(5);
        Nto1And1toN(5);
    }
    static void rec1toN(int i,int n){
        if (i == n){
            System.out.print(i + " ");
            return;
        }
        System.out.print(i + " ");
         rec1toN(i+1,n);

    }
    // Optimized way of printing 1 to N
    static void RevNto1(int n){
        if(n == 0){
            return;
        }
        RevNto1(n-1);
        System.out.print(n + " ");
    }
    static void Nto1And1toN(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        Nto1And1toN(n-1);
        System.out.print(n + " ");

    }
}
