package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Nto1(5);
    }
    static void Nto1(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        Nto1(n-1);
    }
}
