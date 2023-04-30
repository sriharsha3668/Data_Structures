package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Collection<Integer>Values = new ArrayList<>();
        //Collection is an Interface whereas Arraylist is a Class.
        //List is a Interface which extends the Collection Interface.
        //ArrayList implements the List Interface

        Values.add(175);
        Values.add(17);
        Values.add(45);

        Iterator i = Values.iterator();
        //Iterator is an Interface in java
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        /*
           for(Object i: Values)
           {
              System.out.println(i.next());
           }
         */

    }
}
