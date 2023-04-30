package com.company;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        boolean prime = IsPrime(in.nextInt());
//        System.out.println(prime);
//        boolean ams = isAmstrong(in.nextInt());
//        System.out.println(ams);
        System.out.println("3-Digit Amstrong Numbers are: ");
        for(int i = 100; i <= 1000; i++){
            if(isAmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean IsPrime(int n){
        if(n <= 1) {
            return false;
        }
        int k = 0;
        for(int i = 1; i <= n/2; i++){
            if(n%i == 0){
                k++;
            }
        }
        if(k == 1){
            return true;
        }
        else
            return false;
    }

    static boolean isAmstrong(int n){
        int a = n;
        int rem,sum = 0;
        while(n > 0){
            rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        if(sum == a){
            return true;
        }
        else
            return false;
    }
}
