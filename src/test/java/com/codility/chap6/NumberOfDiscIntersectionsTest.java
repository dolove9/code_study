package com.codility.chap6;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfDiscIntersectionsTest {

    @Test
    public void solution() {
        int [] input = {1,5,2,1,4,0};
        NumberOfDiscIntersections number = new NumberOfDiscIntersections();
        int solution = number.solution(input);
        assertEquals(11, input);
    }
}