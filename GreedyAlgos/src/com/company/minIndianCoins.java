package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class minIndianCoins {
    public static void main(String[] args) {
        Integer [] Coins = {1,2,5,10,20,50,100,500,2000};
        int amount = 143;
        int noNotes = 0;
        Arrays.sort(Coins, Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();


        for(int i = 0; i < Coins.length; i++){
            if(Coins[i] <= amount){
                while(Coins[i] <= amount){
                    noNotes++;
                    ans.add(Coins[i]);
                    amount -= Coins[i];
                }
            }
        }
        System.out.println("The Minimum number of notes required are : " + noNotes);
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + "INR ");
        }
    }
}
