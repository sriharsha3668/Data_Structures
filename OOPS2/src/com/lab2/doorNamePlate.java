package com.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class doorNamePlate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2,s3;
        s1 = sc.next();
        s2 = sc.next();
        s3 = sc.next();
        if(same(s1,s2,s3)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
    static boolean same(String s1,String s2,String s3){
       String s4;
        int[] count = new int[26];
        s4 = s1 + s2;
        if(s3.length() > s4.length()){
            return false;
        }
        for(char i : s3.toCharArray()){
            count[i - 'A']++;
        }
        for(char j : s4.toCharArray()){
            if(count[j - 'A'] == 0){
                return false;
            }
                count[j - 'A']--;
        }
        return true;
    }
}
