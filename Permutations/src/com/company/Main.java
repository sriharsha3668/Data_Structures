package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s ="abc";
        System.out.println(permutationsList("",s));

    }
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f+c+s,up.substring(1));
        }
    }

    static List<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        List<String> ans = new ArrayList<>();

        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationsList(f+c+s,up.substring(1)));
        }
        return ans;
    }
    static int permutationsCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char c = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
           count += permutationsCount(f+c+s,up.substring(1));
        }
        return count;
    }
}
