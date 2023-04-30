package com.company;

public class NewtonRapson {
    public static void main(String[] args) {
        System.out.println(Sqrt(40));

    }
    static double Sqrt(int n){
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x + (n/x));

            if(Math.abs(root - x) < 0.05){
                break;
            }
            x = root;
        }
        return root;
    }
}
