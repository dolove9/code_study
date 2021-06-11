package com.codility.chap7;

import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        Stack<Integer> downFish = new Stack<>();

        int fishCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                downFish.push(A[i]);
            } else {
                while (!downFish.isEmpty()) {
                    if (downFish.peek() > A[i]) {
                        break;
                    } else {
                        downFish.pop();
                    }
                }
                if (downFish.isEmpty()) {
                    fishCount++;
                }
            }
        }
        return downFish.size() + fishCount;
    }
}

