package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_Queues {
    public static class Queue{
        static Deque<Integer> d = new LinkedList<>();
        public static void add(int data){
            d.addLast(data);
        }
        public static int remove(){
            if(d.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int result = d.getFirst();
            d.removeFirst();
            return result;
        }

        public static int peek(){
            if(d.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return d.getFirst();

        }

        public static boolean isEmpty() {
            return d.isEmpty();
        }
    }
    public static void main(String[] args) {
         Queue q = new Queue();
         q.add(1);
         q.add(2);
         q.add(3);
         while(!q.isEmpty()){
             System.out.print(q.peek() + " ");
             q.remove();
         }

    }
}
