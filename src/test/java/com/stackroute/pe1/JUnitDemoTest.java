package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JUnitDemoTest {

    private JUnitDemo jUnitDemo;


    @AfterClass
    public static void afterClass() {
        System.out.println("Inside after class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Inside before");
        //        Arrange
        jUnitDemo = new JUnitDemo();
    }


    @BeforeClass
    public static void beforeClass() {
        System.out.println("Inside before class");
    }


    @Test
    public void givenTwoStringsShouldConcatAndUpperCase() {
//        Act
        String result = jUnitDemo.concatAndUpperCase("Hello", "World");
//        Assert
        assertNotNull(result);
        assertEquals("HELLOWORLD", result);
    }

    @Test
    public void givenAStringShouldReturnErrorMessage() {
        //        Act
        String result = jUnitDemo.concatAndUpperCase(null, null);
        //        Assert
        assertNotNull(result);
        assertEquals("Null value not allowed", result);
    }

    @Test
    public void givenStringShouldReturnItsReverse() {
        String result = jUnitDemo.reverseString("Hello");
        assertEquals("olleH",result);
    }

    @Test(expected = NullPointerException.class)
    public  void  shouldThrowNullPointerException() {
        String result = jUnitDemo.reverseString("hello");
//        assertEquals("olleH",result);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Inside after");
        jUnitDemo = null;
    }
}