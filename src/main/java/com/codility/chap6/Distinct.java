package com.codility.chap6;

import java.util.Arrays;

public class Distinct {
    public int solution(int[] A){
        if(A.length <= 1){
            return A.length;
        }
        Arrays.sort(A);
        int dupCount = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i-1] != A[i]) {
                ++dupCount;
            }
        }
        return dupCount;
    }
}
