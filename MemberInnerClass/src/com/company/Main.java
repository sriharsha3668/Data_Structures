package com.company;

class A{
    int i;
    class B{
        int j;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        A obj = new A();
        obj.i = 5;
        A.B obj1 = obj.new B();
        obj1.j = 10;
        System.out.println("i : " + obj.i + " j : " + obj1.j);
    }
}
