package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxOfSubArrays {
    public static void maxSub(int[] arr,int N, int K){
        Deque<Integer> dq = new LinkedList<>();

        for(int i = 0; i < K; i++){
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);

        }

        for(int i = K; i < N; i++){
            System.out.print(arr[dq.peekFirst()] + " ");
            while(!dq.isEmpty() && dq.peekFirst() <= i-K){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peekFirst()]);


    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,5,2,3,6};
        int len = arr.length;
        int K = 3;
        maxSub(arr,len,K);

    }
}
