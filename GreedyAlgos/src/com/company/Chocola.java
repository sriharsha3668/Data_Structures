package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Chocola {
    public static void main(String[] args) {

        Integer [] costHor = {2,1,3,1,4};
        Integer [] costVer = {4,1,2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
        int m = 6;
        int n = 4;
        int v = 0;
        int h = 0;
        int vp = 1;
        int hp = 1;
        int cost = 0;

        while(v < costVer.length && h < costHor.length){
            if(costVer[v] >= costHor[h]){
//                Vertical Cut
                cost += costVer[v] * hp;
                vp++;
                v++;
            }else{
//                Horizontal Cut
                cost += costHor[h] * vp;
                hp++;
                h++;
            }
        }

        while(h < costHor.length){
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        while(v < costVer.length){
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("The Minimum cost for Cutting the chocolate into small squares : " + cost);
    }
}
