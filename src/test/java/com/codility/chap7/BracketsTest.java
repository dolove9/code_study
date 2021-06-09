package com.codility.chap7;

import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsTest {

    @Test
    public void solution() {
        String input = "{[()()]}";
        Brackets brackets = new Brackets();
        int solution = brackets.solution(input);
        assertEquals(1, solution);
    }

    @Test
    public void solution2() {
        String input = "([)()]";
        Brackets brackets = new Brackets();
        int solution = brackets.solution(input);
        assertEquals(0, solution);
    }
}