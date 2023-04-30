package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {3, 5 , 8 , 1 , 2};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int BubbleSort(int[] arr){
       for(int i = 0; i < arr.length; i++){
           for(int j = 1; j <= arr.length-i-1; j++){
               if(arr[j] < arr[j-1]){
                   Swap(arr[j],arr[j-1]);
               }
           }

       }
    }
    static int Swap(int a,int b){
        int temp = a;
         a = b;
         b = a;
    }
}
