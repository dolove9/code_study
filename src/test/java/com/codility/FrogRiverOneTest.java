package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogRiverOneTest {

    @Test
    public void solution() {
        FrogRiverOne riverOne = new FrogRiverOne();
        int[] input = {1,3,1,4,2,3,5,4};
        int solution = riverOne.solution(5, input);
        assertEquals(6, solution);
    }
}