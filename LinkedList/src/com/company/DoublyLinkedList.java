package com.company;

public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
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
        head.prev = newNode;
        head = newNode;
    }

    public static void insertAtLast(int data){
        Node newNode = new Node(data);
        size++;
        if(tail == null){
            head = tail = newNode;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static int removeAtFirst(){
        if(head == null){
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public static int removeAtLast(){
        if(tail == null){
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    public static void print(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();


    }

    public static void reverseDLL(){
        Node cur,prev,next;
        cur = head;
        prev = null;
        next = head;


        while(cur != null){
            next = cur.next;
            cur.next = prev;
            cur.prev = next;
            prev = cur;
            cur = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtStart(5);
        dll.insertAtLast(6);
        dll.insertAtLast(4);
        dll.insertAtLast(3);
        dll.insertAtStart(2);
        dll.print();
        dll.removeAtFirst();
        dll.print();
        dll.removeAtLast();
        dll.print();
        dll.reverseDLL();
        dll.print();
        System.out.println(dll.size);

    }
}
