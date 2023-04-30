package com.company;

import java.util.Arrays;

public class Comparator {
    public static void main(String[] args) {
        int[][] arr = {{7,8},{5,6},{3,4},{1,2}};
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
