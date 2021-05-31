package com.programers.kp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Pro3Test {

    @Test
    public void solution() {
        Pro3 pro3 = new Pro3();

        int [] input = {5, 3, 9, 13};
        boolean solution = pro3.solution(input,8);
        Assert.assertEquals(true, solution);
    }

    @Test
    public void solution2() {
        Pro3 pro3 = new Pro3();
        int [] input = {5, 3, 9, 13};
        boolean solution = pro3.solution(input,7);
        Assert.assertEquals(false, solution);
    }

    @Test
    public void solution3() {
        Pro3 pro3 = new Pro3();
        int [] input = {5, 3, 9, 13,3,5,6,7,8,9,90,43,1,23,4,2,34,123,2123,2345,546,234,457,35,47,345,743,45234};
        boolean solution = pro3.solution(input,25);
        Assert.assertEquals(true, solution);
    }

}