package com.company;


public class Approach {
    public static void main(String[] args) {
        int[][] points =  {{10,16},{7,12},{2,8},{1,6}};
        int swapped;

        for(int j = 0; j < points.length-1; j++){
            swapped = 0;
            for(int i = 1; i < points.length; i++){
                if (points[i][0] < points[i - 1][0]) {
                    int[] temp = points[i];
                    points[i] = points[i - 1];
                    points[i - 1] = temp;
                    swapped = 1;
                }
            }
            if(swapped == 0){
                break;
            }
        }

        for(int i = 0; i < points.length; i++){
            for (int j = 0; j < points[0].length; j++){
                System.out.print(points[i][j] + " ");
            }
            System.out.println();
        }
    }

}
