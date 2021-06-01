package com.codility;

import junit.framework.TestCase;

public class TapeEquilibriumTest extends TestCase {

    public void testSolution() {
        //[3, 1, 2, 4, 3]
        int [] input = {3,1,2,4,3,};
        TapeEquilibrium equilibrium = new TapeEquilibrium();
        int solution = equilibrium.solution(input);
        assertEquals(1, solution);
    }

    public void testSolution1() {
        //[3, 1, 2, 4, 3]
        int [] input = {3};
        TapeEquilibrium equilibrium = new TapeEquilibrium();
        int solution = equilibrium.solution(input);
        assertEquals(0, solution);
    }
}