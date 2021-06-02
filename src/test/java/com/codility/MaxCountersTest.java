package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxCountersTest {

    @Test
    public void solution() {

        MaxCounters counters = new MaxCounters();
        int[] input = {3,4,4,6,1,4,4};
        int[] solution = counters.solution(5, input);
        int[] expected = {3,2,2,4,2};
        assertArrayEquals(expected, solution);
    }
}