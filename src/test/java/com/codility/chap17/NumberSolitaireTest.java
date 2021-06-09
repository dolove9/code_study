package com.codility.chap17;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSolitaireTest {

    @Test
    public void solution() {
        int [] input = {1,-2,0,9,-1,-2};
        NumberSolitaire numberSolitaire = new NumberSolitaire();
        int solution = numberSolitaire.solution(input);
        assertEquals(8, solution);
    }
}