package com.codility;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A){
        Arrays.sort(A);

        for(int i = 1 ; i <= A.length ; i++){
            if(A[i-1] != i){
                return 0;
            }
        }
        return 1;
    }
}
