package com.programers.kp;

import org.junit.Test;

import static org.junit.Assert.*;

public class Pro2Test {

    @Test
    public void solution() {
        String [] input = {"DS7651 A0", "CA0055 D+", "AI5543 C0", "OS1808 B-", "DS7651 B+", "AI0001 F", "DB0001 B-", "AI5543 D+", "DS7651 A+", "OS1808 B-"};
        Pro2 pro2 = new Pro2();
        String[] solution = pro2.solution(input);
    }
}