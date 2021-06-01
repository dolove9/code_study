package com.codility;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A){
        /*
        if(A.length == 0){
            return 1;
        }
        Arrays.sort(A);
        for (int i = 0 ; i < A.length ; i++){
            if (i+1 != A[i]){
                return i+1;
            }
        }
        return A.length + 1;*/


        int missing = 1; // missing number 1 already
        Arrays.sort(A);

        // check numbers one by one
        for (int i = 0; i < A.length; i++) {
            if (A[i] == missing) {    // we found the missing number !
                missing = A[i]+1;    // add +1 and keep checking
            }
        }
        return missing;
    }
}
