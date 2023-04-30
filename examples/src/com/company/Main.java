package com.company;
import javax.print.attribute.EnumSyntax;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        // to take input we use the scanner class
        int[] arr = new int[5]; // creates an array object in the heap memory
        // RHS happens at the run time
        // LHS happens at compile time
        String[] names = new String[5];
        System.out.println(names[0]);
//      Using For-each or Enhanced for loop
//        for(String s : names){
//            System.out.print(s);
//        }


//        for(int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//        for(int i = 0; i < arr.length; i++){
//            System.out.println("Element : " + arr[i]);
//        }
//        for(int i : arr){
//            System.out.println(i + " ");
//        }
//        System.out.println(Arrays.toString(arr));

        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
