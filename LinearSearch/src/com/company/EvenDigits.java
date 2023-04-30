package com.company;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {15,648,75,86,123,254,1764};
        System.out.println("The Number of Even Digited Numbers are: ");
        System.out.println(EvenNo(arr));

    }
    static int Digits2(int n){
        if(n < 0){
            n = n * -1;
        }
        return (int)Math.log10(n) + 1;
    }
    static int EvenNo(int[] arr){
        int count = 0;
        for(int i : arr){
            if(isEven(digits(i))){
                count++;
            }
        }
        return count;
    }
    static boolean isEven(int count){
        if(count%2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            n = n*-1;
        }
        int count = 0;
        while(n > 0){
            n = n/10;
            count++;
        }
        return count;
    }
}
