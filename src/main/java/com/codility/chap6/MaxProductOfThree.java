package com.codility.chap6;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A){

        Arrays.sort(A);
        int len = A.length;
        int max1 = A[len-1] * A[len-2] * A[len-3];
        int max2 = A[0] * A[1] * A[len-1];


        return Math.max(max1, max2);
    }


}
