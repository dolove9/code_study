package com.programers.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem3Test {

    @Test
    public void solution() {
        int [] input = {3,0,6,1,5};
        Problem3 problem3 = new Problem3();
        int solution = problem3.solution(input);
        assertEquals(3, solution);
    }
}