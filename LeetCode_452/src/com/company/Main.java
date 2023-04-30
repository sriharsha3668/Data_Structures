package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] points = new int[5][5];
        int size = points.length;

        Arrays.sort(points, (a, b) -> Integer.compare(a[0],b[0]));

        int l = points[0][0];
        int r = points[0][1];
        int count = 1;
        for(int i = 1; i < size; i++){
            if(points[i][0] > r ){
                l = points[i][0];
                r = points[i][1];
                count++;
            }else{
                l = Math.max(points[i][0],l);
                r = Math.min(points[i][1],r);
            }
        }
        System.out.println(count);
    }
}
