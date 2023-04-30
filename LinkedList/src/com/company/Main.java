package com.company;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//      Contains collection of objects
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(2);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);
    }
}
