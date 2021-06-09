package com.codility.chap6;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void solution() {
        int [] input = {10,2,5,1,8,20};
        Triangle triangle = new Triangle();
        int solution = triangle.solution(input);
        assertEquals(1, solution);
    }

    @Test
    public void solution2() {
        int [] input = {10,50,5,1};
        Triangle triangle = new Triangle();
        int solution = triangle.solution(input);
        assertEquals(0, solution);
    }
}