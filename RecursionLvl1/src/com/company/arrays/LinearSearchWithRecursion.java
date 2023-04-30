package com.company.arrays;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int target = 0;
        int[] arr = {1,2,3,4,0};
//        System.out.println(LinearSearch(arr,target,0));
//        System.out.println(FindIndex(arr,target,0));
//        System.out.println(FindIndexFromLast(arr,target,arr.length-1));
//        FindAllIndices(arr,target,0);
//        System.out.println(list);
//        System.out.println(FindIndices(arr,target,0,new ArrayList<>()));
        System.out.println(FindIndices2(arr,target,0));
    }
    static boolean LinearSearch(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
//        return (arr[index] == target) || LinearSearch(arr,target,index+1);
        if(arr[index] == target){
            return true;
        }
        else
            return LinearSearch(arr,target,index+1);
    }
    static int FindIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return FindIndex(arr,target,index+1);
        }

    }
    static int FindIndexFromLast(int[] arr,int target,int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return FindIndexFromLast(arr,target,index-1);
        }
    }
     static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndices(int[] arr, int target, int index){
       if(index == arr.length){
           return;
       }
       if(arr[index] == target){
           list.add(index);
       }
           FindAllIndices(arr,target,index+1);
    }
    static ArrayList<Integer> FindIndices(int[] arr,int target,int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return FindIndices(arr,target,index+1,list);
    }
    static ArrayList<Integer> FindIndices2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        // The following operation is bound to only this funtion call
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = FindIndices2(arr,target,index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
