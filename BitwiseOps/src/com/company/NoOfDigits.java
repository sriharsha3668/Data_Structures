package com.company;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 345647;
        int b = 10;
        int noOfdigits = (int)((Math.log(n))/(Math.log(b)) + 1);
        System.out.println(noOfdigits);
    }
}
