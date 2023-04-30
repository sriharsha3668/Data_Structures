package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(5);
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        System.out.println(list);

        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
