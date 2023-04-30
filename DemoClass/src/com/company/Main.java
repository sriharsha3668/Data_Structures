package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> values = new ArrayList<>();
        values.add(175);
        values.add(156);
        values.add(138);
        values.add(571);
        values.add(510);
        values.add(262);
        Collections.sort(values);
        Collections.sort(values,(o1, o2) -> {
           return ((o1%10) > (o2%10) ? 1 : -1 );
            //Anonymous Class
        });
        for(int i: values)
        System.out.println(i);

    }
}
