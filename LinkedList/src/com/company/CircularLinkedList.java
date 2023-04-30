package com.company;

public class CircularLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void insertAtStart(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = newNode;

    }

    public static int removeAtFirst(){
        if(head == null){
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            head = tail = null;
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        tail.next = head;
        return val;
    }

    public static void insertAtEnd(int data){
        Node newNode = new Node(data);
        size++;

        if(tail == null){
            tail = head = newNode;
            size++;
        }

        tail.next = newNode;
        tail = newNode;
        newNode.next = head;
    }

    public static int removeAtLast(){
        if(tail == null){
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            head = tail = null;
            return Integer.MIN_VALUE;
        }

        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = head;
        tail = temp;
        size--;
        return val;
    }
    public static void print(){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        Node temp = head.next;
        while(temp != head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtStart(5);
        cll.insertAtStart(4);
        cll.insertAtStart(3);
        cll.insertAtStart(2);
        cll.insertAtStart(1);
        cll.print();
        cll.insertAtEnd(6);
        cll.insertAtEnd(7);
        cll.print();
        cll.removeAtFirst();
        cll.print();
        cll.removeAtFirst();
        cll.print();
        cll.removeAtLast();
        cll.print();
        cll.removeAtLast();
        cll.print();


    }
}
