package com.company;

public class OddEvenList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node push(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static void print(){
        if(head == null)
            return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void oddEvenLL(){
        if(head == null){
            return;
        }
        Node temp = head;
        Node Even = null;
        Node Odd = null;
        Node temp1 = null;
        Node temp2 = null;
        while(temp != null){
           if(temp.data % 2 == 0){
               if(Even == null){
                   Even = temp;
                   temp1 = temp;
               }else{
                   temp1.next = temp;
                   temp1 = temp1.next;
               }
           }else{
               if(Odd == null){
                   Odd = temp;
                   temp2 = temp;
               }else{
                   temp2.next = temp;
                   temp2 = temp2.next;
               }
           }
           temp = temp.next;
        }

        temp1.next = Odd;
        temp2.next = null;

        if(Even != null){
            head = Even;
        }else{
            head = Odd;
        }

    }
    public static void main(String[] args) {
        OddEvenList ll = new OddEvenList();
        head = push(head,7);
        head = push(head,12);
        head = push(head,10);
        head = push(head,5);
        head = push(head,4);
        head = push(head,1);
        head = push(head,3);
        ll.print();
        ll.oddEvenLL();
        ll.print();

    }
}
