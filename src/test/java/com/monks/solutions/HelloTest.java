package com.monks.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testEvaluate(){
        Hello hello = new Hello();
        int result = hello.evaluate("3+9+7*3-21");
        assertEquals(0, result);
    }

}