package com.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermMissingElemTest {

    @Test
    public void solution() {
        int [] req = {2,3,1,5};
        PermMissingElem elem = new PermMissingElem();
        int solution = elem.solution(req);
        assertEquals(4, solution);
    }

    @Test
    public void solution2() {
        int [] req = {};
        PermMissingElem elem = new PermMissingElem();
        int solution = elem.solution(req);
        assertEquals(1, solution);
    }
}