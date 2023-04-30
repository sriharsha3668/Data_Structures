package com.company;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String s = "Sri Harsha";
        char target = 'i';
        System.out.println(search(s,target));
        System.out.println(Arrays.toString(s.toCharArray()));

    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
