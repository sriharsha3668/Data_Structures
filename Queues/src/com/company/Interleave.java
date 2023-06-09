package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Interleave {
    public static Queue<Integer> interleave(Queue<Integer> q){
        int half = q.size()/2;
        Queue<Integer> qhalf = new LinkedList<>();
        for(int i = 0; i < half; i++){
            qhalf.add(q.remove());
        }
        while(!qhalf.isEmpty()){
            q.add(qhalf.remove());
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= 10; i++){
            q.add(i);
        }
        Queue<Integer> qnew = interleave(q);
        while(!qnew.isEmpty()){
            System.out.print(qnew.peek() + " ");
            qnew.remove();
        }
    }
}
