package com.programers.chap1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpyTest {

    @Test
    public void solution_test1() {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Spy spy = new Spy();
        int solution = spy.solution(clothes);
        assertEquals(5, solution);
    }

    @Test
    public void solution_test2() {
        Spy spy = new Spy();
        int solution = spy.solution(null);
        assertEquals(0, solution);
    }

    @Test
    public void solution_test3() {
        Spy spy = new Spy();
        int solution = spy.solution(null);
        assertEquals(0, solution);
    }
}