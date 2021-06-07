package com.codility.chap5;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinAvgTwoSliceTest {

    @Test
    public void solution() {
        int [] input = {4,2,2,5,1,5,8};
        MinAvgTwoSlice twoSlice = new MinAvgTwoSlice();
        int solution = twoSlice.solution(input);
        assertEquals(1, solution);
    }
}