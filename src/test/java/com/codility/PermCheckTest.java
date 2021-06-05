package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermCheckTest {

    @Test
    public void solution() {
        int [] input = {4,1,3};
        PermCheck permCheck = new PermCheck();
        int solution = permCheck.solution(input);
        assertEquals(0, solution);
    }

    @Test
    public void solution_1() {
        int [] input = {4,1,3,2};
        PermCheck permCheck = new PermCheck();
        int solution = permCheck.solution(input);
        assertEquals(1, solution);
    }

    @Test
    public void solution_2() {
        int [] input = {4};
        PermCheck permCheck = new PermCheck();
        int solution = permCheck.solution(input);
        assertEquals(0, solution);
    }
}