package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = null;
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;
        while(start <= end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }
}
