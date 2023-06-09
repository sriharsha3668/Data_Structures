package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseList {
    public static void reverse(int[] arr, int k){
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for(int a = 0; a < arr.length; a++){
            q.add(arr[a]);
        }
        int i = 0;
        int j = 0;
        while(i < k){
            s.push(q.remove());
            i++;
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        while(j < q.size() - k){
            q.add(q.remove());
            j++;
        }
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int k = 7;
        reverse(arr,k);


    }
}
