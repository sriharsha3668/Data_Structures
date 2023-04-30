package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Arrays are illustrated
//
//        int[] ros;
//        ros = new int[5];
//        System.out.println(ros[0]);
//
////        null is a literal
//        // primitives are stored in the Stack and non-primitives are stored in the Heap Memory
//        String[] names = new String[4];
//        System.out.println(names[0]);
//
//        Scanner in = new Scanner(System.in);

//        int[] arr = new int [5];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }
////        for(int j : arr){
////            System.out.print(j + " ");
////        }
//        System.out.println(Arrays.toString(arr));

//        String[] str = new String[4];
//        for(int i = 0; i < str.length; i++){
//           str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));

//        int[][] nums = new int[3][2];
//
//        for(int row = 0; row < nums.length; row++){
//            for(int col = 0; col < nums[row].length; col++){
//                nums[row][col] = in.nextInt();
//            }
//        }

//        for(int row = 0; row < nums.length; row++){
//            for(int col = 0; col < nums[row].length; col++){
//                System.out.print(nums[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for(int[] a : nums){
//            for(int b : a){
//                System.out.print(b + " ");
//            }
//            System.out.println();
//
//        }
//        for(int[] a : nums){
//            System.out.println(Arrays.toString(a));
//        }

//        ArrayList<Integer> AL = new ArrayList<>(10);
//        AL.add(10);
//        AL.add(20);
//        AL.add(30);
//        AL.add(40);
//        AL.add(50);
//
//        for (int i = 0; i < 5; i++)
//        System.out.println(AL.get(i));
//        AL.remove(2);
//        System.out.println(AL);

//        ArrayList<ArrayList<Integer>> AL2 = new ArrayList<>();
//
//        for(int i = 0; i < 3; i++){
//            AL2.add(new ArrayList<>());
//        }
//
//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                AL2.get(i).add(in.nextInt());
//            }
//        }
//        System.out.println(AL2);

        int[] arr = {1,45,63,18,92,56};
        System.out.println(Arrays.toString(arr));
//        swap(arr,1,3);
//        System.out.println(Arrays.toString(arr));
//        max(arr);
        System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] arr, int index1, int index2){
       int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int max(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static int maxRange(int[] arr,int start,int end){
        int max = arr[0];
        for(int i = start; i <= end;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}


