package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinAvgTwoSliceTest {

    @Test
    public void solution() {
        int [] input = {1,2,3,};

        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        int solution = minAvgTwoSlice.solution(input);
        assertEquals(0, solution);
    }
}