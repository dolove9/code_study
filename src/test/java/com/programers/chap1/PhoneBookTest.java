package com.programers.chap1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void solution_test_1(){
        PhoneBook phoneBook = new PhoneBook();
        String [] testCase_1 =  {"119", "97674223", "1195524421"};
        boolean result = phoneBook.solution(testCase_1);
        assertEquals(false, result);
    }

    @Test
    public void solution_test_2(){
        PhoneBook phoneBook = new PhoneBook();
        String [] testCase_1 =  {"123","456","789"};
        boolean result = phoneBook.solution(testCase_1);
        assertEquals(true, result);
    }
}