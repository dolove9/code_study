package com.codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {
    public int solution(int[] A){
        /*int result = 0;
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        for (int i : A){
            if(Collections.frequency(list, i) == 1){
                return i;
            }
        }
        return result;*/

        int result = 0;

        Arrays.sort(A);

        for(int i = 0 ; i < A.length ; i = i+2){
            if(i+1 == A.length){
                result = A[i];
                break;
            }
            if(A[i] != A[i+1]){
                result = A[i];
                break;
            }
        }
        return result;
    }
}
