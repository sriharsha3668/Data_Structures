package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String series = "";
//        for(int i = 0; i < 26; i++){
//            char ch = (char)('a' + i);
//            series = series + ch;
//        }
//        System.out.println(series);
//        StringBuilder builder = new StringBuilder();
//        for(int i = 0; i < 26; i++){
//            char ch = (char)('a' + i);
//            builder.append(ch);
//        }
//        System.out.println(builder);
//        builder.reverse();
//        System.out.println(builder);
//
//        String name = "Kunal Kushwaha";
//        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(name.length());
//        System.out.println(name.indexOf('a'));
//        System.out.println(name.lastIndexOf('a'));
//        String names = Arrays.toString(name.split(" "));
//        System.out.println(names);
//        String s = "   fly me   to   the moon  ";
//        StringBuilder builder = new StringBuilder();
//        for(int i = 0; i < s.length(); i++){
//            builder.append(s.charAt(i));
//        }
////        builder.reverse();
////        System.out.println(builder);
//        System.out.println(s.trim().lastIndexOf(" "));
//        System.out.println(Arrays.toString(s.split(" ")));
//        System.out.println(s.length());
//        String s = "()[]{}";
//        System.out.println(s.charAt(0));
//        System.out.println(s.indexOf('!'));
//        Stack<Character> stack = new Stack<Character>();
//        System.out.println(stack.isEmpty());
//        StringBuilder builder = new StringBuilder();


        //Question
        StringBuilder builder = new StringBuilder();
       String word = "abcdefd";
       char ch = 'd';

        int length = word.indexOf(ch);
        for(int i = 0; i <= length; i++){
            builder.append(word.charAt(i));
        }

        builder.reverse();
        for(int i = length+1; i < word.length(); i++){
            builder.append(word.charAt(i));
        }
        System.out.println(builder);
        builder.toString();


    }

}
