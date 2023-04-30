package com.company;

interface Phone{
    void show();
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Phone obj = ()-> System.out.println("call,music,message,maps,videos");
        obj.show();
    }
}
