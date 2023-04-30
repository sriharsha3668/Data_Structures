package com.lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class specialNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();


        for(int i = 0; i < testcases; i++){
            int digits = sc.nextInt();
            String number = sc.next();
             if(digits == 1){
                 System.out.println("-1");
             }else{
                 String special = "";
                 int count = 0;
                 for(int h = 0; h < number.length(); h++){
                     special = special + number.charAt(h);
                     if((Integer.parseInt(special.substring(h,h+1)) % 2) != 0){
                         count++;
                     }
                     if (count == 2){
                         System.out.println(special);
                         break;
                     }
                 }
                 if(count != 2){
                     System.out.println("-1");
                 }
             }

        }
    }
}
