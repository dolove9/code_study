package com.programers.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    @Test
    public void solution() {
        int [] input = {6,10,2};
        Problem2 problem2 = new Problem2();
        String solution = problem2.solution(input);
        assertEquals("6210", solution);

    }

    @Test
    public void solution2() {
        int [] input = {3,30,34,5,9};
        Problem2 problem2 = new Problem2();
        String solution = problem2.solution(input);
        assertEquals("9534330", solution);
    }
}