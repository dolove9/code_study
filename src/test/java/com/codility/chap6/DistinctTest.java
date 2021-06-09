package com.codility.chap6;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistinctTest {

    @Test
    public void solution() {
        int [] input = {2,1,1,2,3,1};
        Distinct distinct = new Distinct();
        int solution = distinct.solution(input);
        assertEquals(3, solution);
    }
}