package com.company;

import java.util.Set;

public class RightMostSetBit{
    public static void main(String[] args) {
        System.out.println(SetBit(10));
    }
    static int SetBit(int num){
        int count = 0;
        while(num > 0){

            if((num & 1) != 1){
                count++;
            }
           else
              num = num >> 1;
        }
        int a = (int) Math.pow(2,count);
        return a;
    }
}
