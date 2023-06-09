package com.company;

import java.util.ArrayList;

public class MaximumStringPartitions {
    public static int balancedPartition(String str){
        int X = 0;
        int r = 0;
        int l = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'L'){
                l++;
            }else{
                r++;
            }

            if(l == r){
                X++;
            }
        }
        return X;

    }
    public static void main(String[] args) {
        String str = "LLRRRLLRRL";
        System.out.println(balancedPartition(str));
    }
}
