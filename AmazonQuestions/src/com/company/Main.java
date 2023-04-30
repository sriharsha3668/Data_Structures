package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        dice("",4);
//        ArrayList<String> list = diceRet("",3);
//        System.out.println(list);
        String s = "ab#c";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                s = s.substring(0,i-1) + s.substring(i+1);
            }

        }
        System.out.println(s);

    }
    static void dice(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++){
            dice(p+i,target-i);
        }
    }
    static ArrayList<String> diceRet(String p,int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++){
            ans.addAll(diceRet(p+i,target - i));
        }
        return ans;
    }
    static ArrayList<String> diceFaceRet(String p,int target,int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i <= face && i <= target; i++){
            ans.addAll(diceFaceRet(p+i,target - i,face));
        }
        return ans;
    }
    static String helper(String p,String up){
        if(up.isEmpty()){
            return p;
        }

        char ch = up.charAt(0);
        if(ch == '#'){
            return helper(p.substring(1),up.substring(1));
        }
        else{
            return helper(p+ch,up.substring(1));
        }
    }
}
