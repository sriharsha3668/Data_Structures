package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
       String s = sc.nextLine();
       char ch = s.charAt(0);
       if(ch >= 97){
           s = (char)(ch-32) + s.substring(1);
       }
        System.out.println(s);

    }
}
