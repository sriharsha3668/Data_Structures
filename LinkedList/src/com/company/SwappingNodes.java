package com.company;

public class SwappingNodes {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node push(Node head,int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return head;
        }

        public static void swap(int x,int y){
            if(head == null || x == y){
                return;
            }
            Node cur1,cur2;
            cur1 = head;
            cur2 = head;
            Node prev1 = null,prev2 = null;

            while(cur1 != null && cur1.data != x){
                prev1 = cur1;
                cur1 = cur1.next;
            }

            while(cur2 != null  && cur2.data != y){
                prev2 = cur2;
                cur2 = cur2.next;
            }

            if(cur1 == null || cur2 == null){
                return;
            }

            if(prev1 != null){
                prev1.next = cur2;
            }else{
                head = cur2;
            }

            if(prev2 != null){
                prev2.next = cur1;
            }else{
                head = cur1;
            }

            Node temp = cur1.next;
            cur1.next = cur2.next;
            cur2.next = temp;



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
    public static void main(String[] args) {
        SwappingNodes ll = new SwappingNodes();
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
        ll.print();
        ll.swap(3,8);
        ll.print();
    }
}
