package com.company;

import java.util.Scanner;

public class Min_Distance {
    public static void main(String[] args) {
        int x1,x2,x3;
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        x3 = sc.nextInt();
        a = min(x1,x2,x3);
        c = max(x1,x2,x3);
       int sum = c-a;
        System.out.println(sum);

    }
    static int max(int x1,int x2,int x3){
        int c;
        if(x1 > x2){
            if(x1 > x3){
                c = x1;
            }else{
                c = x3;
            }
        }else{
            if(x2 > x3){
                c = x2;
            }else{
                c = x3;
            }
        }
        return c;
    }
    static int min(int x1,int x2,int x3){
        int a;
        if(x1 < x2){
            if(x1 < x3){
                a = x1;
            }else{
                a = x3;
            }
        }else{
            if(x2 < x3){
                a = x2;
            }else{
                a = x3;
            }
        }
        return a;
    }
}
