package com.company;

public class BuyandSellStock {
    public static int maxProfit(int[] prices) {
        int Profit = 0;
        int buy = prices[0];
        int n = prices.length;

        for(int i = 1; i < n; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            if(prices[i] - buy >= Profit){
                Profit = prices[i] - buy;
            }
        }
        return Profit;

    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
