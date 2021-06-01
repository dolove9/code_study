package com.codility;

import junit.framework.TestCase;

public class TapeEquilibriumTest extends TestCase {

    public void testSolution() {
        int [] input = {1,2,3,4,5};
        TapeEquilibrium equilibrium = new TapeEquilibrium();
        int solution = equilibrium.solution(input);
        assertEquals(7, solution);
    }
}