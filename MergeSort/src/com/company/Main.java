package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {5,4,3,2,1};
        mergesortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    static void mergesortInPlace(int[] arr,int s,int e){
        if(e-s == 1){
            return;
        }
        int mid = (s+e)/2;

        mergesortInPlace(arr,s,mid);
        mergesortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }
    static void mergeInPlace(int[] arr,int s,int mid,int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;
        while(i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0; l < mix.length; l++){
            arr[s+l] = mix[l];
        }

    }
}
