package com.company;
import java.util.*;
public class MultiDimArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for(int i = 0; i < 3; i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
         // Enhanced for loop

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
