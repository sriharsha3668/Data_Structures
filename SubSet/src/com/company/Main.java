package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {4,5,6,7};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> a : ans){
            System.out.print(a + " ");
        }
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        

        for(int ans : arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(ans);
                outer.add(internal);
            }

        }
        return outer;


    }
    static List<List<Integer>> subsetDuplicate(int[] arr){
        // We need to sort the array first inorder to make sure that the duplicates are together
        Arrays.sort(arr);
       List<List<Integer>> outer = new ArrayList<>();
       outer.add(new ArrayList<>());

       int start = 0;
       int end = 0;
       for(int i = 0; i < arr.length; i++){
           start = 0;
           if(i > 0  && arr[i] == arr[i-1]){
               start = end + 1;
           }
           end = outer.size() - 1;
           int n = outer.size();
           for(int j = start; j < n; j++){
               List<Integer> internal = new ArrayList<>(outer.get(j));
               internal.add(arr[i]);
               outer.add(internal);
           }
       }

       return outer;
    }
}
