package com.company;

import java.util.Scanner;

public class power2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        String[] vals = new String[65];
        for(int i = 0; i < vals.length; i++) {
            long val = i;
            val = (long)Math.pow(2l, i);
            vals[i] = String.valueOf(val);
        }
        for(int ti = 1; ti <= tc; ti++) {
            System.out.println(solve(sc.next(), vals));
        }
    }

    public static int solve(String str, String[] vals) {
        int min = Integer.MAX_VALUE;
        for(String val : vals) {
            int mm = check(str, val);
            // System.out.println(str + " " + val + " " + mm);
            min = Math.min(min, mm);
        }
        return min;
    }

    public static int check(String str, String pat) {
        int pi = 0;
        int l = str.length();
        int pl = pat.length();
        for(int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if(pi < pl && ch == pat.charAt(pi))
                pi++;
        }
        int ret = l - pi + pl - pi;
        return ret;
    }
}
