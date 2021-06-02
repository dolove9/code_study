package com.codility;

import java.util.HashSet;

public class FrogRiverOne {
    public int solution(int X, int[] A){
        HashSet<Integer> distance = new HashSet<>();

        for (int i = 0 ; i < A.length ; i++){
            if(A[i] <= X){
                distance.add(A[i]);
            }
            if(distance.size() == X){
                return i;
            }
        }

        return -1;
    }
}
