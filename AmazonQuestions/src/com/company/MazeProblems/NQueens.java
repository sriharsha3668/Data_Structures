package com.company.MazeProblems;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int num = queens(board,0);
        System.out.println(num);
    }

    static int queens(boolean[][] board,int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for(int col = 0; col < board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count = count + queens(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //for vertical rows;
        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }

        // for diagonal left elements
        int MaxLeft = Math.min(row,col);
        for(int i = 1; i <= MaxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        // for diagonal right elements
        int MaxRight = Math.min(row,board.length-col-1);
        for(int i = 1; i <= MaxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }

        }
        return true;
    }

    static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
