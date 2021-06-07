package com.codility.chap5;

public class MinAvgTwoSlice {
    public int solution(int[] A){
        float minAver = (A[0] + A[1]) /2f;
        int minIndex = 0;

        for(int i = 2 ; i < A.length ; i++){
            float aver = (A[i-2] + A[i-1] + A[i]) / 3f;
            if(minAver > aver){
                minAver = aver;
                minIndex = i-2;
            }

            aver = (A[i-1] + A[i]) / 2f;//왜 2부터냐하면 앞에 0,1 은 평균을 구했으니가.
            if(minAver > aver){
                minAver = aver;
                minIndex = i-1;
            }

        }
        return minIndex;
    }
}
