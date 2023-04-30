package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> values = new ArrayList<>();
        values.add(42);
        values.add(99);
        values.add(56);
        values.add(2,175);
        Collections.sort(values);
        for(Integer i: values)
        {
            System.out.println(i);
        }
    }
}
