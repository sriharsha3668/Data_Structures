package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "baccappldah";
        System.out.println(SkipAppNotApple(s));
    }
    static void Skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        if(c == 'a'){
            Skip(p,up.substring(1));
        }
        else{
            p += c;
            Skip(p,up.substring(1));

        }
    }
    static String Skip1(String s){
        if(s.isEmpty()){
            return s;
        }
        char c = s.charAt(0);
        if(c == 'a'){
            return Skip1(s.substring(1));
        }
        else{
            return c + Skip1(s.substring(1));
        }
    }
    static String SkipApple(String s){
        if(s.isEmpty()){
            return s;
        }

        if(s.startsWith("apple")){
            return SkipApple(s.substring(5));
        }
        else{
            return s.charAt(0) + SkipApple(s.substring(1));
        }
    }
    static String SkipAppNotApple(String s){
        if(s.isEmpty()){
            return s;
        }

        if(s.startsWith("app") && !s.startsWith("apple")){
            return SkipAppNotApple(s.substring(3));
        }
        else{
            return s.charAt(0) + SkipAppNotApple(s.substring(1));
        }
    }
}
