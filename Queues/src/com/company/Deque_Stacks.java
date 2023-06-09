package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_Stacks {
    public static class Stack{
        static Deque<Integer> d = new LinkedList<>();
        public static void push(int data){
            d.addLast(data);
        }
        public static int pop(){
            if(d.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int result = d.getLast();
            d.removeLast();
            return result;
        }

        public static int peek(){
            if(d.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return d.getLast();

        }

        public static boolean isEmpty() {
            return d.isEmpty();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
