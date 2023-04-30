package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 10;
        int b = 20;
        int temp;
//        temp = a;
//        a = b;
//        b = temp;
        swap(a,b);
        String name ="Kunal Kushwaha";
        changename(name);
        int[] arr = {0,45,62,1,33};
        change(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Name is " + name);
        System.out.println("a = " + a + " b = " + b);
        fun(1,2,45,86,75,15);
        fun1(2,5,"Harsha","Poojitha");

    }

     static void changename(String name) {
        name = "Rahul Rana";
    }

    static void swap(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    static void change(int[] nums){
        nums[0] = 99;
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun1(int a, int b, String ...v){
        System.out.println(a + " " + b + Arrays.toString(v));
    }
}
