package com.programers.kp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Pro1Test {

    @Test
    public void solution() {
        int [] input = {1,10,2,9,3,8,4,7,5,6};

        Pro1 pro1 = new Pro1();
        int solution = pro1.solution(input, 20);
        Assert.assertEquals(3, solution);
    }
}