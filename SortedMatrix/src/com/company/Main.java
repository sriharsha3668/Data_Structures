package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(SortedMatrixSearch(nums,3)));
    }

    static int[] BinarySearch(int[][] arr,int row,int cStart,int cEnd,int target){
        while(cStart <= cEnd){
            int mid = cStart + (cStart - cEnd)/2;
            if(arr[row][mid] == target){
                return new int[] {row,mid};
            }
            if(arr[row][mid] > target){
                cEnd = mid - 1;
            }
            else
                cStart = mid + 1;

        }
        return new int[]{-1,-1};

    }
    static int[] SortedMatrixSearch(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(cols == 0){
            return new int[] {-1,-1};
        }

        if(rows == 1){
            return BinarySearch(matrix,0,0,cols-1,target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cmid = cols/2;
        while(rStart < rEnd - 1){
            int mid = rStart + (rEnd - rStart)/2;
            if(matrix[mid][cmid] == target){
                return new int[] {mid,cmid};
            }
            if(matrix[mid][cmid] > target){
                rEnd = mid;
            }
            else
                rStart = mid;
        }

        if(matrix[rStart][cmid] == target){
            return new int[]{rStart,cmid};
        }
        if(matrix[rStart + 1][cmid] == target){
            return new int[]{rStart + 1,cmid};
        }

        // 1st part
        if(matrix[rStart][cmid-1] >= target){
            return BinarySearch(matrix,rStart,0,cmid-1,target);
        }
        // 2nd part
        if(matrix[rStart][cmid + 1] <= target && matrix[rStart][cols-1] >= target){
            return BinarySearch(matrix,rStart,cmid+1,cols-1,target);
        }

        // 3rd part
        if(matrix[rStart+1][cmid - 1] >= target){
            return BinarySearch(matrix,rStart+1,0,cmid-1,target);
        }
        else
            return BinarySearch(matrix,rStart + 1,cmid + 1,cols-1,target);

        // 4th part

    }
}
