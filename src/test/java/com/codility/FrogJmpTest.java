package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJmpTest {

    @Test
    public void solution() {
        FrogJmp frogJmp = new FrogJmp();
        int solution = frogJmp.solution(10, 85, 30);
        assertEquals(3, solution);
    }
}