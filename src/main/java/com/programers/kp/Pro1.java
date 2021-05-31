package com.programers.kp;

public class Pro1 {
    public int solution(int[] A, int S) {
        int n = A.length;
        int min_len = n + 1;

        for (int start = 0; start < n; start++){
            int curr_sum = A[start];

            if (curr_sum > S){
                return 1;
            }

            for (int end = start + 1; end < n; end++){
                curr_sum += A[end];

                if (curr_sum > S && (end - start + 1) < min_len){
                    min_len = (end - start + 1);
                }
            }
        }
        return min_len;
    }


}