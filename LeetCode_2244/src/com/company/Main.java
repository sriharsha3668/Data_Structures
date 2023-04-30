package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,3,3};
        System.out.println(Arrays.toString(minimumRounds(arr)));

    }
    public static int[] minimumRounds(int[] tasks) {
        int count;
        Map<Integer,Integer> hash_map = new HashMap<>();
        for(int i = 0; i < tasks.length; i++){
            if(hash_map.containsKey(tasks[i])){
                hash_map.put(tasks[i],hash_map.get(tasks[i]) + 1);
            }else{
                hash_map.put(tasks[i],1);
            }
        }
        int[] arr = new int[hash_map.size()];
        int j = 0;
        for(Map.Entry<Integer,Integer>entry : hash_map.entrySet()){
            arr[j++] = entry.getValue();
        }

        return arr;
    }
}
