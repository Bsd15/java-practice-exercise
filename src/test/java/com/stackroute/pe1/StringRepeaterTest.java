package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeaterTest {

    StringRepeater stringRepeater;

    @Before
    public void setUp() throws Exception {
        stringRepeater = new StringRepeater();
    }

    @After
    public void tearDown() throws Exception {
        stringRepeater = null;
    }

    @Test
    public void givenStringAndNumberShouldReturnStringWithRepeatedSubString() {
        assertEquals("Stackrouterouterouterouterouteroute",
                stringRepeater.repeat("Stackroute", 5));
        assertEquals("Stackroutetete",
                stringRepeater.repeat("Stackroute",2));
    }
}