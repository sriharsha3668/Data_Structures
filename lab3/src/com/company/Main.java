package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(size % 2 == 0){
            System.out.println(size/2 - 1);
        }else{
            System.out.println(size/2);
        }
        for(int i = 0; i < size -1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
