package com.codility;

import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int N, int[] A){
        int[] result = new int[N];

        if (A.length == 1){
            result[A[0]-1] = 1;
            return result;
        }
        if( N == 1){
            result[0] = 0;
            return result;
        }

        for (int i = 0 ; i < A.length ; i++){
            if(N < A[i] ){
                Arrays.sort(result);
                int max = result[result.length-1];
                Arrays.fill(result, max);
            }if(N >= A[i]){
                result[A[i]-1] += 1;
            }

        }

        return result;
    }
}
