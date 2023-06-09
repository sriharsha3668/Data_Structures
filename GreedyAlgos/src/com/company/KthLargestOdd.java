package com.company;

public class KthLargestOdd {
    public static int KthLargest(int L,int R, int K){
        int n = 0;
        if(L % 2 == 0 && R % 2 == 0){
             n = (R - L)/2;
        }else{
             n = (R - L)/2 + 1;
        }
        if(K > n){
            return 0;
        }
        if(K == 1 && R%2 != 0){
            return R;
        }else if(K == 1 && R%2 == 0){
            return (R-1)/2;
        }
        else if(R%2 != 0){
            for(int i = 1; i < K; i++){
                R -= 2;
            }
        }else{
            R--;
            for(int i = 1; i < K; i++){
                R -= 2;
            }
        }

        return R;
    }
    public static void main(String[] args) {
        int L = -10;
        int R = 10;
        int K = 11;
        System.out.println(KthLargest(L,R,K));

    }
}
