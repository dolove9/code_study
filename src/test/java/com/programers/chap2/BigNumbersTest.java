package com.programers.chap2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigNumbersTest {

    @Test
    public void solution() {
        int [] source = {6,10,2};
        BigNumbers numbers = new BigNumbers();
        String solution = numbers.solution(source);
        System.out.println("solution = " + solution);
    }
}