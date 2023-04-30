package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        vararg(10,20,30,40,50,60,175,86,92,100);
        multivararg(10,20,"Harsha","Poojitha");
    }
    static void vararg(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multivararg(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
}
