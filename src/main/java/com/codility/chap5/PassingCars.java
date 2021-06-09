package com.codility.chap5;

import java.util.ArrayList;
import java.util.List;

public class PassingCars {
    public int solution(int[] A){
        int len = A.length;
        /*
        List<Integer> P = new ArrayList<>();
        List<Integer> Q = new ArrayList<>();
        for(int i = 0 ; i < len ; i++){
            if(A[i] == 0){
                P.add(i);
            }else {
                Q.add(i);
            }
        }
        int count = 0;
        for(int i = 0 ; i < P.size() ; i++){
            for(int j = 0 ; j < Q.size() ; j++){
                if(P.get(i) < Q.get(j)){
                    count++;
                }
                if (count > 1000000000) {
                    return -1;
                }
            }
        }
         */
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < len ; i++){
            if(A[i] == 0){
                count++;
            }
            if(A[i]== 1){
                sum = sum + count;
            }
            if(sum <0 || sum > 1000000000){
                return -1;
            }
        }

        return sum;
    }
}
