package com.company;

import java.util.Scanner;

public class palindromeIndices {
    public static void main(String[] args) {
        int testcases;
        Scanner sc = new Scanner(System.in);
        testcases = sc.nextInt();
        for(int i = 0; i < testcases; i++){
            int n = sc.nextInt();
            String s = sc.next();
            int mid = s.length()/2;
            int index = s.length()/2-1;
            int count = 0;
            while(index >= 0 && s.charAt(mid) == s.charAt(index)){
                count++;
                index--;
            }
            if(s.length()%2 != 0){
                System.out.println(2*count+1);
            }else{
                System.out.println(2*count);
            }
        }

    }

}
