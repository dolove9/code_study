package com.codility;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TapeEquilibrium {
    public int solution(int[] A){
        int [] resultArray = new int[A.length-1];
        int sum = Arrays.stream(A).sum();
        int first = 0;
        int second = 0;
        for (int P = 1 ; P < A.length ; P++){
//            arraySum(A, i, );


            /*
            for(int f = 0 ; f < P ; f++){
                first = first + A[f];
            }
             */
            first = first + A[P-1];


            second = sum - first;

            resultArray[P-1] = Math.abs(first - second);
        }

        Arrays.sort(resultArray);//[7, 5, 1, 7, 0]
        return resultArray[0];
    }

}
