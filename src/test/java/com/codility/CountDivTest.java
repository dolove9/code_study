package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountDivTest {

    @Test
    public void solution() {
        int A=4, B=4, K=4;

        CountDiv countDiv = new CountDiv();
        int solution = countDiv.solution(A, B, K);
        assertEquals(0, solution);
    }
    @Test
    public void solution_1() {
        int A=4, B=4, K=5;

        CountDiv countDiv = new CountDiv();
        int solution = countDiv.solution(A, B, K);
        assertEquals(0, solution);
    }
    @Test
    public void solution_2() {
        int A=2, B=5, K=3;

        CountDiv countDiv = new CountDiv();
        int solution = countDiv.solution(A, B, K);
        assertEquals(1, solution);
    }


}