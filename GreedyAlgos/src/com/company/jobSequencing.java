package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class jobSequencing {
    public static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int i, int d, int p){
            id = i;
            profit = p;
            deadline = d;
        }

    }
    public static void main(String[] args) {
        int[][] jobsInfo = {{4,20}, {1,10}, {1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i < jobsInfo.length; i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit);
        ArrayList<Integer> ans = new ArrayList<>();
        int time = 0;

        for(int i = 0; i < jobs.size(); i++){
            Job current = jobs.get(i);
            if(current.deadline > time){
                ans.add(current.id);
                time++;
            }
        }

        System.out.println("Max number of jobs : " + ans.size());
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();





    }
}
