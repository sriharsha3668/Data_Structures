package com.company;

public class DeleteNodes {
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

    public static Node push(Node head,int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
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
        return;
    }

    public static void Deletion(int m, int n){
        Node temp = head;
        while(temp != null){
            for(int i = 1; i < m && temp != null; i++){
                temp = temp.next;
            }
            Node iter = temp.next;
            for(int j = 1; j <= n && iter != null; j++){
                iter = iter.next;
            }
            temp.next = iter;
            temp = iter;
        }

    }
    public static void main(String[] args) {
        DeleteNodes ll = new DeleteNodes();
        head = push(head,10);
        head = push(head,9);
        head = push(head,8);
        head = push(head,7);
        head = push(head,6);
        head = push(head,5);
        head = push(head,4);
        head = push(head,3);
        head = push(head,2);
        head = push(head,1);
        Deletion(3,2);
        ll.print();
    }
}
