package com.company;

public class KsortedLL {
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
    public static void print(Node node){

        Node temp = node;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        return;
    }

    public static Node merge(Node a,Node b){
        if(a == null && b == null){
            return null;
        }
        if(a == null){
            return b;
        }else if(b == null){
            return a;
        }
        Node result;
        if(a.data >= b.data){
            result = b;
            result.next = merge(a,b.next);
        }else{
            result = a;
            result.next = merge(a.next,b);
        }

        return result;
    }

    public static Node kSorted(Node arr[],int last){
        while(last != 0){
            int i = 0;
            int j = last;
            while(i < j){
                arr[i] = merge(arr[i],arr[j]);
                i++;
                j--;
                if(i >= j){
                    last = j;
                }
            }
        }
        return arr[0];
    }
    public static void main(String[] args) {
        KsortedLL ll = new KsortedLL();
        int k = 4;
        int n = 3;
        Node[] arr = new Node[k];

        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        Node head = kSorted(arr,k-1);
        print(head);
    }

}
