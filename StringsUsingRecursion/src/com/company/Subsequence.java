package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list = subsequence1("","abc");
        System.out.println(list);
//        subSeqReturn("","abc");

    }
    static void subsequence(String p,String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subsequence(p + ch,up.substring(1));
        subsequence(p,up.substring(1));
    }

    static ArrayList<String> subsequence1(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsequence1(p + ch,up.substring(1));
        ArrayList<String> right = subsequence1(p,up.substring(1));
        left.addAll(right);

        return left;

    }

    static void subSeqReturn(String p,String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subSeqReturn(p + ch,up.substring(1));
        subSeqReturn(p,up.substring(1));
        subSeqReturn(p + (ch+0), up.substring(1));


    }

    static ArrayList<String> subSeqReturn1(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subSeqReturn1(p + ch,up.substring(1));
        ArrayList<String> second = subSeqReturn1(p,up.substring(1));
        ArrayList<String> third = subSeqReturn1(p + (ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);

        return first;

    }
}
