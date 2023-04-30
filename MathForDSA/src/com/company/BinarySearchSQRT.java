package com.company;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 1;
        int p = 3;
        System.out.printf("%.3f",Sqrt(n,p));
    }
    static double Sqrt(int n, int p){
        double start = 0;
        double end = n;
        double ans = 0.0;
       while(start <= end){
           double mid = start + (end - start)/2;
           if(mid * mid == n){
               return mid;
           }
           if(mid * mid > n){
               end = mid - 1;
           }
           else
               start = mid + 1;
       }
       double incr = 0.1;
       for(int i = 0; i < p; i++){
           while(ans * ans < n){
               ans += incr;
           }
           ans -= incr;
           incr /= 10;
       }

        return ans;
    }
}
