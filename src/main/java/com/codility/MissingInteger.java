package com.codility;

import java.util.HashSet;
import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] A){
        int result = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        Arrays.sort(A);
        if(A[A.length -1] < 0 ){
            return 1;
        }

        for(int i = 0 ; i < A.length ; i++){
            hashSet.add(A[i]);
        }

        for(int j = 1 ; j <= A[A.length-1] + 1 ; j++){
            if(!hashSet.contains((j))){
                return j;
            }
        }

        /*for(int i = 0 ; i < A.length ; i++){
            if(A[i]> 0){
                if(i == A.length-1){
                    result =  A[i] + 1;
                    break;
                }
                if(A[i] + 1 != A[i+1]){
                    if(A[i] != A[i+1]){
                        result = A[i] + 1;
                        break;
                    }
                }
            }
        }*/
        return result;
    }
}
