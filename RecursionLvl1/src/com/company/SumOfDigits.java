package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(Sumofdigits(12345));

    }
    static int Sumofdigits(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + Sumofdigits(n/10);
    }
}
