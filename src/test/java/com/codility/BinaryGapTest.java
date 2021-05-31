package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {

    @Test
    public void solution() {
        BinaryGap gap = new BinaryGap();
        int solution = gap.solution(32);
        assertEquals(0,solution);
    }

    @Test
    public void solution2() {
        BinaryGap gap = new BinaryGap();
        int solution = gap.solution(9);
        assertEquals(2,solution);
    }

    @Test
    public void solution3() {
        BinaryGap gap = new BinaryGap();
        int solution = gap.solution(1041);
        assertEquals(5,solution);
    }



}