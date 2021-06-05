package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingIntegerTest {

    @Test
    public void solution() {
        int [] input = {1,3,6,4,1,2};
        MissingInteger missingInteger = new MissingInteger();
        int solution = missingInteger.solution(input);
        assertEquals(5, solution);
    }

    @Test
    public void solution_1() {
        int [] input = {1,2,3};
        MissingInteger missingInteger = new MissingInteger();
        int solution = missingInteger.solution(input);
        assertEquals(4, solution);
    }

    @Test
    public void solution_2() {
        int [] input = {-1,-3};
        MissingInteger missingInteger = new MissingInteger();
        int solution = missingInteger.solution(input);
        assertEquals(1, solution);
    }

    @Test
    public void solution_3() {
        int [] input = {-1,-3,-100,4,-5,123,-2222,12311,2223,1,5,6,3,6,6,6,3,2,123,1222,3333,44,55555};
        MissingInteger missingInteger = new MissingInteger();
        int solution = missingInteger.solution(input);
        assertEquals(7, solution);
    }

    @Test
    public void solution_4() {
        int [] input = {-1};
        MissingInteger missingInteger = new MissingInteger();
        int solution = missingInteger.solution(input);
        assertEquals(1, solution);
    }
}