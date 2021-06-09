package com.codility.chap5;

import org.junit.Test;

import static org.junit.Assert.*;

public class PassingCarsTest {

    @Test
    public void solution() {
        int [] input = {0,1,0,1,1};
        PassingCars passingCars = new PassingCars();
        int solution = passingCars.solution(input);
        assertEquals(5, solution);
    }

    @Test
    public void solution2() {
        int [] input = {0,1,0,1,1};
        PassingCars passingCars = new PassingCars();
        int solution = passingCars.solution(input);
        assertEquals(5, solution);
    }
}