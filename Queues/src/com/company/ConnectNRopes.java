package com.company;

import java.util.PriorityQueue;

public class ConnectNRopes {
    public static int connect(int[] arr,int N){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < N; i++){
            pq.add(arr[i]);
        }
        int res = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            res += first + second;
            pq.add(res);
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int len = arr.length;
        System.out.println(connect(arr,len));
    }
}
