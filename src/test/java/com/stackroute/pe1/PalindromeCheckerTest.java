package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker;

    @Before
    public void setUp() throws Exception {
        palindromeChecker = new PalindromeChecker();
    }

    @After
    public void tearDown() throws Exception {
        palindromeChecker = null;
    }

    @Test
    public void givenNumberShouldReturnMessage() {
        long number = 2468642;
        String result = palindromeChecker.palindromeAndSumOfEvensCheck(number);
        /*Assert*/
        assertEquals(number + "is a palindrome and the sum of even numbers is greater than 25", result);
        number = 12345;
        result = palindromeChecker.palindromeAndSumOfEvensCheck(number);
        assertEquals(number + "is not a palindrome", result);

        number = 12345654321L;
        result = palindromeChecker.palindromeAndSumOfEvensCheck(number);
        assertEquals(number + "is a palindrome and the sum of even numbers is less than 25", result);
    }
}