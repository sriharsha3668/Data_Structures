package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Sequence {
    public static void binary(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        int i = 0;
        while(i < n){
            String s = q.peek();
            q.add(s + "0");
            q.add(s + "1");
            System.out.print(s + " ");
            q.remove();
            i++;
        }


    }
    public static void main(String[] args) {
        int N = 10;
        binary(N);
    }
}
