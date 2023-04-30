package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String,Integer> map = new HashMap<>();
        // Hashtable can also be used for the same purpose
        Map<String,String> maps = new HashMap<>();
//        Set<Map.Entry<String,String>> m = maps.entrySet();
//        for(Map.Entry<String,String> e : m)
//        {
//            System.out.println(e.getKey() + " " + e.getValue() );
//        }
//        Other way of using the HashMap with Nested Interface using Entry Interface
        Set<String> val = maps.keySet();
        maps.put("Hi There","I'm Harsha");
        maps.put("And I'm Here to Say that","I love Coding");
        for(String i : val)
        {
            System.out.println(i + " " + maps.get(i));
        }
        map.put("Harsha",1);
        map.put("Poojitha",2);
        map.put("Charan",3);
        map.put("Rakshit",4);
        map.put("Aakash",5);

        Set<String> keys = map.keySet();
        for(String key: keys)
        {
            System.out.println(key + " " + map.get(key));
        }

    }
}

