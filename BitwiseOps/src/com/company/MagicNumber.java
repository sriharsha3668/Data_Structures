package com.company;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(nthMagic(6));
    }
    static int nthMagic(int n){
        int num;
        int product = 5;
        int sum = 0;
        while(n > 0){
            num = n & 1;
            sum = sum + product*num;
            product*=5;
            n = n>>1;
        }
        return sum;
    }
}
