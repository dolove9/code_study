package com.programers.kp;

import java.util.ArrayList;
import java.util.List;

public class Pro3 {
    public boolean solution(int[] arr, int n) {
        boolean answer = false;

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int c = arr[i] + arr[j];
                if(c == n){
                    return true;
                }
//                if (list.indexOf(c) < 0)
//                    list.add(c);
            }
        }

//        answer = list.contains(n);

        return answer;
    }
}
