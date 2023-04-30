package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int b = 0; b < a; b++)
        {
            String s, t;
           s = sc.next();
           t = sc.next();

            int f = 0;
            int l = t.length();
            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == t.charAt(0))
                {
                    f = right(s, t, i, 1);
                    if (f == 1)
                    {
                        break;
                    }
                }
            }
            if (f == 1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }



    }
    static int left(String s,String t,int i,int x){
        while(x < t.length() && i >= 0){
            if(t.charAt(x) == s.charAt(i)){
                x++;
                i--;
            }
            else{
                break;
            }
        }
        if(x == t.length()){
            return 1;
        }
        return 0;
    }

    static int right(String s,String t,int i,int x){
        if (x == t.length())
        {
            return 1;
        }
        if (x + 1 == t.length())
        {
            if ((i + 1) < s.length() && s.charAt(i+1) == t.charAt(x))
            {
                return 1;
            }
            else if ((i - 1) >= 0 && s.charAt(i-1) == t.charAt(x))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        int p1 = 0;
        int p2 = 0;
        int h = 0;
        if(i - 1 >= 0 && s.charAt(i-1) == t.charAt(x)){
            p1 = left(s,t,i-1,x);
        }
        if(p1 == 1){
            return 1;
        }
        if (i + 1 < s.length() && s.charAt(i+1) == t.charAt(x))
        {
            p2 = right(s, t, i + 1, x + 1);
        }
        if(p1 == 1 || p2 == 1){
            h = 1;
        }
        
        return (h);

    }
}
