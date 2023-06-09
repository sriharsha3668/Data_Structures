package com.company;

public class CircularQueue {
    static int[] arr;
    static int size;
    static int rear;
    static int front;
    public CircularQueue(int n){
        size = n;
        arr = new int[size];
        rear = -1;
        front = -1 ;
    }
    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    public static boolean isFull(){
        return (rear+1) % size == front;
    }

    public static void add(int data){
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int result = arr[front];
        if(front == rear){
            front = rear = -1;
        }else{
            front = (front + 1) % size;
        }

        return result;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
