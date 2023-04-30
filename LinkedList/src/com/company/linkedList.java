package com.company;

public class linkedList {
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
    public static int size;

    public void insertFirst(int data){

//        create a Node
        Node newNode = new Node(data);
        size++;
//        If there is no node initially
        if(head == null){
            head = tail = newNode;
            return;
        }

//        assign the next of new node to the node which is previously pointed by head
        newNode.next = head;
//        point the head to the next node
        head = newNode;

    }

    public void insertLast(int data){
//        create a Node
        Node newNode = new Node(data);
        size++;

//        If there is no node initially
        if(head == null){
            tail = head = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("The LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addMiddle(int idx, int data){
//        if the element is to be added in the beginning
        if(idx == 0){
            insertFirst(data);
            return;
        }
        int i = 0;
        Node temp = head;
        while(i < idx - 1){
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("The LL is empty");
            return -1;
        }if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0) {
            System.out.println("The LL is empty");
            return -1;
        }if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        int val = temp.data;
        return val;
    }

    public int search(int key){
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return Integer.MIN_VALUE;
    }


    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);

    }

    public void reverseLL(){
        Node prev = null;
        Node cur = head;
        Node next = head;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return;


    }

    public void deleteNthFromEnd(int n){
        if(head == null){
            return;
        }
        if(n == size){
            head = head.next;
            return;
        }
        int i = 1;
        Node temp = head;
        while(i < size - n){
            temp = temp.next;
            i++;
        }
        Node next = temp.next;
        temp.next = next.next;


    }

    public Node FindMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome(){

        if(head == null || head.next == null){
            return true;
        }
        //        Step1 - Find the middle Node
        Node middle = FindMid(head);

        //        Step2 - Reverse the LL from the 2nd half

        Node cur,prev,next;
        cur = middle;
        next = middle;
        prev = null;

        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        Node head1 = prev;

        //        Step3 - Compare the 1st and 2nd halves

        Node temp = head;
        Node temp1 = head1;

        while(temp != null && temp1 != null){
            if(temp.data != temp1.data){
                return false;
            }
            temp = temp.next;
            temp1 = temp1.next;
        }
        return true;
    }

    public static boolean isCyclic(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;

    }

    public static void RemoveCycle(){
//        Detect a cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }
//        Remove the Cycle

        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
//        removing the cycle after detection
        prev.next = null;
    }

    public static Node mergeSort(Node head){

        if(head == null || head.next == null){
            return head;
        }
//        Step - 1: Find the mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

//        Step - 2: Divide the linkedList
        Node rightHead = slow.next;
        slow.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft,newRight);

    }
    //        Step - 3: Merge

    public static Node merge(Node head1,Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(temp1 != null && temp2 != null){
            if(temp1.data  > temp2.data){
                temp.next = temp2;
                temp2 = temp2.next;
                temp = temp.next;
            }else{
                temp.next = temp1;
                temp1 = temp1.next;
                temp = temp.next;
            }
        }
        while(temp1 != null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;
        }
        while(temp2 != null){
            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void zigZag(Node head){
//      Step - 1: Find the mid of the linked List
        Node mid = findMid(head);

//        Step - 2 : Reverse the linked list from the other half
        Node cur,next,prev;
        Node rightHead = mid.next;
        mid.next = null;
        cur = rightHead;
        next = rightHead;
        prev = null;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

//        Step 3 : Alternate merging
        rightHead = prev;
        Node leftHead = head;
        Node lNext,rNext;
        while(leftHead != null && rightHead != null){
            lNext = leftHead.next;
            leftHead.next = rightHead;
            rNext = rightHead.next;
            rightHead.next = lNext;

            rightHead = rNext;
            leftHead = lNext;

        }

    }

    public static void main(String[] args){
        linkedList ll = new linkedList();
//        ll.print();
        head = new Node(5);
        Node temp = new Node(4);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(6);
        head = ll.mergeSort(head);
        ll.zigZag(ll.head);
        ll.print();

//        ll.print();
//        System.out.println(ll.isCyclic());
//        ll.RemoveCycle();
//        System.out.println(ll.isCyclic());
//        System.out.println(ll.isPalindrome());
//        System.out.println(ll.isCyclic());
//        ll.addMiddle(0,9);
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.recSearch(3));
//        System.out.println(ll.size);
//        ll.reverseLL();
//        ll.print();
//        ll.deleteNthFromEnd(2);
//        ll.print();

    }


}
