package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        List<Integer> values = Arrays.asList(56,67,88);
//        for (int i : values)
//        System.out.println(i);
        List<Integer> values = new ArrayList<Integer>()
        {{
            //Double Braces Intialization
           add(56);
           add(68);
           add(99);
           //Outer braces are the Inner Class and Inner Braces are the Instantiable Initializers
        }};
        for(int i : values)
        {
            System.out.println(i);
        }
    }
}
