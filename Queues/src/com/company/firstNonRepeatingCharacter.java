package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeatingCharacter {
    public static void Non_Repeating(String s){
        Queue<Character> q = new LinkedList<>();
        char[] freq = new char[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            q.add(c);
            freq[c-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print(q.peek() + " ");
            }
        }
    }
    public static void main(String[] args) {
        String s = "aabccxb";
        Non_Repeating(s);
    }
}
