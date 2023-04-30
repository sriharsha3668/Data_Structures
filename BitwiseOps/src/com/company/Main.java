package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        OddOrEven(15);
        char[] s = {'h','e','l','l','o'};
        String news = new String(s);
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < news.length(); i++){
            builder.append(news.charAt(i));
        }

        System.out.println(builder.reverse().toString());


    }
    static void OddOrEven(int n){
        if((n & 1) == 1){
            System.out.println("odd");
        }
        else
            System.out.println("even");

    }
}
