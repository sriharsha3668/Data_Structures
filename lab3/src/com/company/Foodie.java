package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Foodie {
    public static void main(String[] args) {
        int stalls;
        int capacity;
        Scanner sc = new Scanner(System.in);
        stalls = sc.nextInt();
        capacity = sc.nextInt();
        int[] row = new int[stalls];
        for(int i = 0; i < stalls; i++){
            row[i] = sc.nextInt();
        }
        int b = 0;
        int highest = 0;
        int count = 0;
        int a = 0;
        for(;a < stalls;a++){
            highest += row[a];
            if(highest > capacity){
                if(count < (a-b)){
                    count = a - b;
                }
                highest -= row[b++];
            }
        }
        if(count < a-b){
            count = a-b;
        }
        System.out.println(count);

    }
}
