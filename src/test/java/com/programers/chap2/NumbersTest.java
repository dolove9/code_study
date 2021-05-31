package com.programers.chap2;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void solution() {
        String source = "17";
        Numbers numbers = new Numbers();
        int solution = numbers.solution(source);
        assertEquals(3, solution);
    }

    @Test
    public void solution_2() {
        String source = "011";
        Numbers numbers = new Numbers();
        int solution = numbers.solution(source);
        assertEquals(2, solution);
    }
}