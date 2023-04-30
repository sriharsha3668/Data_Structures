package com.company;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int n = 7;
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans* base;
            }
            base *= base;
            n = n >> 1;
        }
        System.out.println(ans);

    }
}
