package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumChainCount {
    public static void main(String[] args) {
        int[][] pairs = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int maxCount = 1;
        int lastEnd = pairs[0][1];
        for(int i = 1; i < pairs.length; i++){
            if(pairs[i][0] > lastEnd){
                maxCount++;
                lastEnd = pairs[i][1];
            }
        }
        System.out.print("The maximum length of Chain is: " + maxCount);
    }
}
