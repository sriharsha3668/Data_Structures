package com.company;

import java.util.Stack;

public class Queue_Stacks {
    public static class Queue_twoStacks{
        static Stack<Integer>s1 = new Stack<>();
        static Stack<Integer>s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            s2.push(s1.pop());

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

        }

        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("The Queue is Empty");
                return -1;
            }
            int result = s1.peek();
            s1.pop();
            return result;
        }

        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("The Queue is Empty");
                return -1;
            }
            return s1.peek();
        }

    }

    public static void main(String[] args) {
        Queue_twoStacks q_twoStacks = new Queue_twoStacks();
        q_twoStacks.add(1);
        q_twoStacks.add(2);
        q_twoStacks.add(3);
        q_twoStacks.add(4);

        while(!q_twoStacks.isEmpty()){
            System.out.println(q_twoStacks.peek());
            q_twoStacks.remove();
        }

    }
}
