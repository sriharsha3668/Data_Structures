package com.company;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases;
        testcases = sc.nextInt();
        int n;
        int hcf;

        for(int i = 0; i < testcases; i++){
            n = sc.nextInt();
            if(n%2 != 0){
                System.out.println((n-1)/2);
            }else{
                System.out.println(n/2);
            }
        }
    }

}
