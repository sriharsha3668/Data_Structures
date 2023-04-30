package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 40;
       for(int i = 1; i <= n; i++){
           if(IsPrime(i)){
               System.out.println(i);
           }
       }
    }
    static boolean IsPrime(int n){
        if(n <= 1){
            return false;
        }
        int i = 2;
        while(i*i <= n){
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return (i*i > n);
    }
}
