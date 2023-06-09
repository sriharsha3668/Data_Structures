package com.company;

import java.util.Arrays;

public class lexicographicallySmallestString {
    public static String getSmallestString(int n, int k) {
        char[] arr = new char[n];
        Arrays.fill(arr,'a');
        k = k - n;

        while(k > 0){
            arr[n-1] += Math.min(k,25);
            k = k - Math.min(k,25);
            n--;
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        int N = 3;
        int K = 27;
        System.out.println(getSmallestString(N,K));
    }
}
