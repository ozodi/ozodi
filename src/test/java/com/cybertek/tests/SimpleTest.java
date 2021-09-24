package com.cybertek.tests;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @BeforeAll
    public static void init(){
        System.out.println("@Before all test ");
    }
    @AfterAll
    public static void some(){
        System.out.println("@After all test ");

    }
    @BeforeEach
    public void thig(){
        System.out.println("@BeforeEach test");
    }
    @AfterEach
    public void all(){
        System.out.println("@AfterEach test");
    }


    @Test
    public void testAddition(){

        System.out.println("Hello World testAddition");
        int num1 = 2;
        int num2 = 3;
        int expectedResult = 5;
        assertEquals(expectedResult, num1+num2);

    }
    @Test
    public void testString(){
        System.out.println("massage from testString");
        String name  = "Junit";
        assertEquals("Junit",name);
    }


}
