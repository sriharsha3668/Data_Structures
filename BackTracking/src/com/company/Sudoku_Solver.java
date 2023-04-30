package com.company;

public class Sudoku_Solver {
    public static void main(String[] args) {
        int[][] board = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };
//        if(solve(board)){
//            display(board);
//        }


    }

    private static void display(int[][] board) {
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean solve(int[][] board){
        int row = -1;
        int col = -1;
        boolean emptyLeft = false;
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = true;
                    break;
                }
            }
            if(emptyLeft == true){
                break;
            }
        }
        if(emptyLeft == false){
            return true;
            //sudoku is solved
        }
//        backtrack
        for(int number = 1; number <= 9; number++){
            if(isSafe(board,row,col,number)){
                board[row][col] = number;
                if(solve(board)){
                    // found the ans
                    return true;
                }else{
                    board[row][col] = 0;
                }

            }
        }
        return false;
    }

    static boolean isSafe(int[][] board,int row,int col,int num){
        // check a row
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }
        // check a col
        for(int j = 0; j < board.length; j++){
            if(board[j][col] == num){
                return false;
            }
        }
        // In a grid
        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for(int r = rowStart; r < rowStart + sqrt; r++){
            for(int c = colStart; c < colStart + sqrt; c++){
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
