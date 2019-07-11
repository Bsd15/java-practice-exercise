package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomOrJerryTest {

    TomOrJerry tomOrJerry;
    @Before
    public void setUp() throws Exception {
        tomOrJerry = new TomOrJerry();
    }

    @After
    public void tearDown() throws Exception {
        tomOrJerry = null;
    }

    @Test
    public void givenNumberShouldReturnString() {
        String result = tomOrJerry.checkTomOrJerry(25);
        assertEquals("Tom",result);
        result = tomOrJerry.checkTomOrJerry(22);
        assertEquals("Jerry",result);
    }

    @Test
    public void givenNumberShouldReturnNull() {
        String result = tomOrJerry.checkTomOrJerry(55);
        assertNull(result);
    }
}