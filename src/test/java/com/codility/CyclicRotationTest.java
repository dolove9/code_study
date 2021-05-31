package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class CyclicRotationTest {

    @Test
    public void solution() {
        int [] temp1 = {1,2,3,4,5};
        int pos = 3;

        CyclicRotation rotation = new CyclicRotation();
        int[] solution = rotation.solution(temp1, pos);
        System.out.println("solution = " + solution);

    }
}