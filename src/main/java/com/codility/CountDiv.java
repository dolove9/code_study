package com.codility;

import java.util.ArrayList;

public class CountDiv {
    public int solution(int A, int B, int K){
        /*
        if (A == B){
            if(A % K == 0){
                return 1;
            }else{
                return 0;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0, j = A ; j <= B ; j++, i++){
            if(j % K == 0){
                result.add(j);
            }
        }
        return result.size();
         */
        int result = 0;
        /*
        if( A == 0){
            result = (B / K) +1;
        }
        if(A != B){
            result = (B / K+1) - ((A - 1) / K + 1);
        }
         */

        result = (B/K) - (A/K);
        if (A%K == 0){
            result += 1;
        }
        return result;
    }
}
