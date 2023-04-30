package com.company;

interface A{
    void show();
}
//class Xyz implements A{
//    public void show()
//    {
//        System.out.println("Hello");
//    }
//}
public class Main {

    public static void main(String[] args) {
	// write your code here
       A obj;
       obj = () -> System.out.println("Hello");
       //After removing the boiler plate of code, We get the above Lambda Expression
       obj.show();
    }
}
