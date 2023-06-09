package com.company;

public class queuesUsingArrays {
    public static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        public Queue(int n){
            size = n;
            arr = new int[size];
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if(rear == size - 1){
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;

            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
