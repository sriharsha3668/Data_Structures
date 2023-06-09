package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] val = {60,100,120};
        int[] weight = {10,20,30};
        int W = 50;
        double[][] ratios = new double[val.length][3];
        for(int i = 0; i < val.length; i++){
            ratios[i][0] = i;
            ratios[i][1] = val[i]/(double)weight[i];
        }
        Arrays.sort(ratios, Comparator.comparingDouble(o -> o[1]));
        int capacity = W;
        int V = 0;

        for(int j = ratios.length - 1; j >= 0; j--){
            int idx = (int) ratios[j][0];
            if(capacity >= weight[idx]){
                V += val[idx];
                capacity -= weight[idx];
            }else{
                V += ratios[j][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("Maximum Value of the result is : " + V);

    }
}
