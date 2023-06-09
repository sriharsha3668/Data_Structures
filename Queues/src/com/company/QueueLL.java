package com.company;

public class QueueLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;

    public static class Queue{

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
           if(head == null){
               head = tail = newNode;
           }
           tail.next = newNode;
           tail = newNode;


        }

        public static int remove(){
           if(isEmpty()){
               System.out.println("The Queue is Empty");
               return -1;
           }
           int result = head.data;
           if(head == tail){
               head = tail = null;
           }else{
               head = head.next;
           }
           return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Queue qll = new Queue();
        qll.add(1);
        qll.add(2);
        qll.add(3);

        while(!qll.isEmpty()){
            System.out.println(qll.peek());
            qll.remove();
        }
    }
}
