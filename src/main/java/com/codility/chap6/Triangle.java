package com.codility.chap6;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] A){
        Arrays.sort(A);
        /**
         * P Q R
         * A[P] + A[Q] > A[R], == ?
         * A[Q] + A[R] > A[P], == true
         * A[R] + A[P] > A[Q]. == true
         */

        for(int i = 0 ; i < A.length -2; i++){
            long P = A[i], Q = A[i+1], R = A[i+2];
            if( P + Q > R){
                return 1;
            }
        }

        return 0;
    }
}
