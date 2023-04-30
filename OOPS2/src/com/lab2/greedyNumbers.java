package com.lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class greedyNumbers {
    public static void main(String[] args) {
        int testcases;
        Scanner sc = new Scanner(System.in);
        testcases = sc.nextInt();
        for(int i = 0; i < testcases; i++){
            int num = sc.nextInt();
            if (num == 2) {
                System.out.println("2");
                System.out.println(1 + " " + 2);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                int h = 0;
                System.out.println("2");
                for(int j = 1; j <= num; j++){
                    list.add(j);
                }
                while(list.size() > 1){
                    int x = list.get(list.size()-1);
                    int y = list.get(list.size()-2);
                    int dup = ceiling(x,y);
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                    list.add(dup);
                    System.out.println(x + " " + y);
                }

            }



        }
    }
    static int ceiling(int x,int y){
        if((x+y) % 2 == 0){
            return (x+y)/2;
        }
        return (x+y)/2 + 1;
    }
}
