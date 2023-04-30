package com.company;

import java.io.*;
import java.lang.*;
import java.util.*;

public class roboTest {
    public static void main(String[] args) throws IOException{
        StringBuffer ans = new StringBuffer();
        StringTokenizer st;
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(f.readLine());
        String str = st.nextToken();
        st = new StringTokenizer(f.readLine());
        String str1 = st.nextToken();
        int[] arr = new int[str.length()];
        st = new StringTokenizer(f.readLine());
        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        f.close();

//        if(str.length() == 200000){
//            System.out.println(works(s));
//        }



        System.out.println(binarySearch(arr, str, str1));
    }

    public static boolean works(int[] arr, String str, String str1, int r){
        boolean[] used = new boolean[str.length()];
        for(int i = 0; i < r; i++){
            used[arr[i]-1] = true;
        }
        int cnt = 0;
        for(int i = 0; i < str.length() && cnt < str1.length(); i++){
            if(str.charAt(i) == str1.charAt(cnt) && !used[i]){
                cnt++;
            }
        }
        return cnt == str1.length();
    }

    public static int binarySearch(int[] arr, String str, String str1){
        int lo = -1;
        int hi = arr.length;
        while (lo + 1 < hi) {
            int mid = (lo + hi)/2;
            if (works(arr, str, str1, mid)) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}