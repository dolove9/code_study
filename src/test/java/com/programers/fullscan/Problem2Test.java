package com.programers.fullscan;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    @Test
    public void solution() {
        String input = "17";
        Problem2 problem2 = new Problem2();
        int solution = problem2.solution(input);
        assertEquals(3, solution);
    }

    @Test
    public void solution2() {
        String input = "011";
        Problem2 problem2 = new Problem2();
        int solution = problem2.solution(input);
        assertEquals(2, solution);
    }
}