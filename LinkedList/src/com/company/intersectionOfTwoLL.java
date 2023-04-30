package com.company;

import java.util.LinkedList;

public class intersectionOfTwoLL {
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

    public static Node getIntersection(Node head1,Node head2){
       while(head2 != null){
           Node temp = head1;
           while(temp != null){
               if(temp == head2){
                   return temp;
               }
               temp = temp.next;
           }
           head2 = head2.next;
       }
       return null;
    }
    public static void main(String[] args) {
        intersectionOfTwoLL ll = new intersectionOfTwoLL();
        Node head1,head2;
        head1 = new Node(1);
        head2 = new Node(4);

        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(6);
        head2.next = new Node(5);
        head2.next.next = head1.next.next.next;

        Node newNode = new Node(7);
        head1.next.next.next.next = newNode;
        head2.next.next.next = newNode;

        Node intersectionPoint = getIntersection(head1,head2);
        if(intersectionPoint == null){
            System.out.println("No common Node in between");
        }else{
            System.out.println("intersectionPoint : " + intersectionPoint.data);
        }


    }
}
