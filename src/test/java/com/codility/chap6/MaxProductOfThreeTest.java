package com.codility.chap6;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProductOfThreeTest {

    @Test
    public void solution() {
        int [] input = {-3,1,2,-2,5,6};
        MaxProductOfThree product = new MaxProductOfThree();
        int solution = product.solution(input);
        assertEquals(60, solution);
    }

    @Test
    public void solution2() {
        int [] input = {-3,1,2,3,5,6};
        MaxProductOfThree product = new MaxProductOfThree();
        int solution = product.solution(input);
        assertEquals(90, solution);
    }
}