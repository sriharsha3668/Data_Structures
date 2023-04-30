package com.lab2;

import java.util.Scanner;

public class replaceLetter {
    public static void main(String[] args) {
        int testcases;
        Scanner sc = new Scanner(System.in);
        testcases = sc.nextInt();
        for(int i = 0; i < testcases; i++){
            int books  = sc.nextInt();
            int[] arr = new int[books];
            for(int j = 0; j < books; j++){
                arr[j] = sc.nextInt();
            }


            int count = 0;
            int x = 0;
            int y = books - 1;
            int forward = arr[x];
            int backward = arr[y];
            while(x < y){
                if(forward == backward){
                    count = books - y + x + 1;
                    x++;
                    y--;
                    forward += arr[x];
                    backward += arr[y];
                }else if(forward < backward){
                    x++;
                    forward += arr[x];

                }else{
                    y--;
                    backward += arr[y];
                }

            }
            System.out.println(count);

        }
    }
}
