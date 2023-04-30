package com.company;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        nums(10,20,45);
        nums("Harsha","Poojitha");
        fun("Harsha");
        fun(7,3);
    }
    static void nums(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void nums(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a, int b){
        System.out.println(a + b);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
