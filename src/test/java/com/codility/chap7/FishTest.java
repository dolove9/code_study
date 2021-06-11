package com.codility.chap7;

import org.junit.Test;

import static org.junit.Assert.*;

public class FishTest {

    @Test
    public void solution() {
        int [] A = {4,3,2,1,5};
        int [] B = {0,1,0,0,0};

        Fish fish = new Fish();
        int solution = fish.solution(A, B);
        assertEquals(2, solution);
    }
}