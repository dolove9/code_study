package com.programers.fullscan;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1Test {

    @Test
    public void solution() {
        int [] input = {1,2,3,4,5};
        int [] expected = {1};
        Problem1 problem1 = new Problem1();
        int[] solution = problem1.solution(input);
        assertArrayEquals(expected, solution);
    }

    @Test
    public void solution2() {
        int [] input = {1,3,2,4,2};
        int [] expected = {1,2,3};
        Problem1 problem1 = new Problem1();
        int[] solution = problem1.solution(input);
        assertArrayEquals(expected, solution);
    }
}