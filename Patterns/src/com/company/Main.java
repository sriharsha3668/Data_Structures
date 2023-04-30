package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Pattern1(4);
//        Pattern2(4);
//        Pattern3(4);
//        Pattern4(5);
//        Pattern5(4);
//        Pattern28(4);
//        Pattern30(5);
//        Pattern17(4);
        Pattern31(4);

    }
    static void Pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void Pattern5(int n){
        for(int row = 1; row <= 2*n - 1; row++){
            if(row <= n){
                for(int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            }

            else {
                for(int col = 1; col <= 2*n - row; col++){
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }
    static void Pattern28(int n){

        for(int row = 1; row <= 2*n - 1; row++){
            int noOfSpaces = row > n ? row - n : n-row;
            int noOfCols = row > n ? 2*n - row : row;
            for(int col = 1; col <= noOfSpaces; col++){
                System.out.print(" ");
            }
            for(int col = 1; col <= noOfCols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern30(int n){
        for(int row = 1; row <= n; row++){
            int noOfSpaces = n - row;
            for(int col = 1; col <= noOfSpaces; col++){
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
    static void Pattern17(int n){
        for(int row = 1; row <= 2*n - 1; row++){
            int noOfSpaces = row > n ? row - n : n - row;
            int noOfCols = row > n ? 2*n - row : row;
            for(int col = 1; col <= noOfSpaces; col++){
                System.out.print(" ");
            }
            for(int col = noOfCols; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= noOfCols; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void Pattern31(int n){
        int OriginalN = n;
        n = 2*n - 2;
        for(int row = 0; row <= n; row++){
            for(int col = 0; col <= n; col++){
                int atEveryCol = OriginalN - Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(atEveryCol + " ");
            }
            System.out.println();
        }
    }
}
