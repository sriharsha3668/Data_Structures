package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Triangle2(4,0);
        int[] arr = {5,4,4,1,3,6};
//        BubbleSort(arr,arr.length-1,0);
        SelectionSort(arr,arr.length,0,0);
//        BubbleSort1(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void Triangle1(int row,int col){
        if(row == 0){
            return;
        }
        if(col == row){
            System.out.println();
            Triangle1(row-1,0);
        }
        if(col < row){
            System.out.print("*" + " ");
            Triangle1(row,col+1);
        }

    }
    static void Triangle2(int row,int col){
       if(row == 0){
           return;
       }
       if(row == col){
           Triangle2(row-1,0);
           System.out.println("");
       }
       else{
           Triangle2(row,col+1);
           System.out.print("*" + " ");
       }
    }
    static void BubbleSort(int[] arr,int r,int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            BubbleSort(arr,r,c+1);
        }

        else
            BubbleSort(arr,r-1,0);

    }

    static void SelectionSort(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                SelectionSort(arr,r,c+1,c);
            }else{
                SelectionSort(arr,r,c+1,max);
            }
        }
        else{
            int temp = arr[r-1];
            arr[r-1] = arr[max];
            arr[max] = temp;
            SelectionSort(arr,r-1,0,0);
        }
    }
    static void BubbleSort1(int[] arr,int r,int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c + 1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;

            }
            BubbleSort1(arr,r,c+1);
        }
        else{
            BubbleSort1(arr,r-1,0);
        }
    }
}
