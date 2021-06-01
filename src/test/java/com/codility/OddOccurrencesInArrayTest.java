package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddOccurrencesInArrayTest {

    @Test
    public void solution() {
        OddOccurrencesInArray inArray = new OddOccurrencesInArray();
        int[] temp = {9,9,5,5,6,6,7,7,1};
        int solution = inArray.solution(temp);
        assertEquals(1, solution);
    }
    @Test
    public void solution2() {
        OddOccurrencesInArray inArray = new OddOccurrencesInArray();
        int[] temp = {42};
        int solution = inArray.solution(temp);
        assertEquals(42, solution);
    }
}