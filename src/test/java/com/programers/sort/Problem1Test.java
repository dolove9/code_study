package com.programers.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1Test {

    @Test
    public void solution() {
        int [] input = {1,5,2,6,3,7,4};
        int [][]commands = {{2,5,3,},{4,4,1},{1,7,3}};

        Problem1 problem1 = new Problem1();
        int[] solution = problem1.solution(input, commands);
        for( int i : solution){
            System.out.println("i = " + i);
        }
    }
}