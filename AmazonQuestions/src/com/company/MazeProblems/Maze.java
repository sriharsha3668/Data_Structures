package com.company.MazeProblems;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(maze(3,3));
//        mazePath("",3,3);
//        ArrayList<String> list = mazePathDiagonalRet("",3,3);
//        System.out.println(list);
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazeRestrictions("",maze,0,0);
    }
    static int maze(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = maze(r-1,c);
        int right = maze(r,c-1);

        return left + right;
    }
    static void mazePath(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        char left = 'D';
        char right = 'R';
        if(r > 1){
            mazePath(p+left,r-1,c);
        }

        if(c > 1){
            mazePath(p+right,r,c-1);
        }


    }

    static ArrayList<String> mazePathRet(String p, int r, int c){
        if(r == 1 && c == 1){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        char left = 'D';
        char right = 'R';
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(mazePathRet(p+left,r-1,c));
        }

        if(c > 1){
         ans.addAll(mazePathRet(p+right,r,c-1));
        }
        return ans;

    }
    static ArrayList<String> mazePathDiagonalRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(mazePathDiagonalRet(p+'V',r-1,c));
        }
        if(r > 1 && c > 1){
            ans.addAll(mazePathDiagonalRet(p+'D',r-1,c-1));
        }

        if(c > 1){
            ans.addAll(mazePathDiagonalRet(p+'H',r,c-1));
        }
        return ans;

    }

    static void mazeRestrictions(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length-1){
            mazeRestrictions(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            mazeRestrictions(p+'R',maze,r,c+1);
        }
    }

}
