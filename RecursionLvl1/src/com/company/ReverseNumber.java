package com.company;

public class ReverseNumber {

    public static void main(String[] args) {
//        System.out.println(ReverseANo(1824));
        System.out.println(ReverseANo(12548));
        System.out.println(IsPalindrome(1234321));

    }
   static int sum = 0;
    static int ReverseANo(int n){
        if(n == 0){
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return ReverseANo(n/10);
    }
    static int Reverse2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    static int helper(int n, int digits) {
        if(n == 0){
            return 0;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits - 1)) + helper(n/10,digits - 1);
    }
    static boolean IsPalindrome(int n){
        return (n == Reverse2(n));
    }
}
