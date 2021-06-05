package com.programers;

import org.junit.Test;

import static org.junit.Assert.*;

public class RunningManTest {

    @Test
    public void solution() {
        String [] p = {"leo", "kiki", "eden"};
        String [] c = {"eden", "kiki"};

        RunningMan runningMan = new RunningMan();
        String solution = runningMan.solution(p, c);
        assertEquals("leo", solution);
    }

    @Test
    public void solution_1() {
        String [] p = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String [] c = {"josipa", "filipa", "marina", "nikola"};

        RunningMan runningMan = new RunningMan();
        String solution = runningMan.solution(p, c);
        assertEquals("vinko", solution);
    }
}