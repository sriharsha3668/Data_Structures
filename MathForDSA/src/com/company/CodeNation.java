package com.company;

public class CodeNation {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8};
        int nums = solve(arr);
        System.out.println(nums);
    }
        public static int solve(int[] A) {
            int flag = 0;
            for(int i = 0; i < A.length; i++){
                flag = 0;
                for(int j = i+1; j < A.length; j++){
                    if(GCD(A[i],A[j]) == 1){
                        flag = 1;
                    }
                    else
                    flag = 0;
                }
                if(flag == 1){
                    return 0;
                }
            }
            return 1;

        }
        public static int GCD(int a,int b){
            if(a == 0){
                return b;
            }
            return GCD(b%a,a);
        }
}
