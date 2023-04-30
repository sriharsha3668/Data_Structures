package com.company;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        mazeAllDirectionsRet("",maze,0,0,path,1);
    }
    static void mazeAllDirections(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r < maze.length-1){
            mazeAllDirections(p+'R',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            mazeAllDirections(p+'D',maze,r,c+1);
        }
        if(r > 0){
            mazeAllDirections(p+'U',maze,r-1,c);
        }
        if(c > 0){
            mazeAllDirections(p+'L',maze,r,c-1);
        }
        maze[r][c] = true;
    }
    static void mazeAllDirectionsRet(String p, boolean[][] maze, int r, int c,int[][] path,int step){
        if(r == maze.length - 1 && c == maze[0].length-1){
            path[r][c] = step;
            for(int[] ans : path){
                System.out.println(Arrays.toString(ans));
            }
            System.out.println(p);
            System.out.println();

            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length-1){
            mazeAllDirectionsRet(p+'D',maze,r+1,c,path,step+ 1);
        }
        if(c < maze[0].length-1){
            mazeAllDirectionsRet(p+'R',maze,r,c+1,path,step + 1);
        }
        if(r > 0){
            mazeAllDirectionsRet(p+'U',maze,r-1,c,path,step + 1);
        }
        if(c > 0){
            mazeAllDirectionsRet(p+'L',maze,r,c-1,path,step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
