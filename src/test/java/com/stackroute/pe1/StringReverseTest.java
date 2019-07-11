package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    StringReverse stringReverse;
    @Before
    public void setUp() throws Exception {
        stringReverse = new StringReverse();
    }

    @After
    public void tearDown() throws Exception {
        stringReverse = null;
    }

    @Test
    public void stringReverse() {
        String result = stringReverse.stringReverse("london");
        assertEquals("nodnol", result);
    }
}