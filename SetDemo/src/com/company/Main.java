package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set<Integer> s = new TreeSet<>();
        //Hash set prints the Data in a random way
        //Both Hash and Tree Sets print data, in which there will not be any duplicate elements
        s.add(15);
        s.add(45);
        s.add(62);
        s.add(1);
        s.add(-69);
        s.add(45);
        for(int i : s)
        {
            System.out.println(i);
        }
    }
}
