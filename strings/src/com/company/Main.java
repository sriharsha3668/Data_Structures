package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String peru;
        System.out.println("Enter your name: ");
        Scanner in = new Scanner(System.in);
        peru = in.next();
        System.out.println(Greet(peru));
    }
    static String Greet(String name){
        return "Hello " + name;

    }
}
