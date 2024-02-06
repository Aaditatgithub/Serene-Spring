package com.in28minutes.junit;
import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {
    //Sequence of execution of test cases is not fixed ::> here are some options to set it or if u wanna do something bef and after test

    @BeforeAll
    static void before(){
        System.out.println("Before everything");
    }

    @AfterAll
    static void after(){
        System.out.println("After everything");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Executing");
    }

    @AfterEach
    void afterEach(){
        System.out.println("AfterEach");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }

}
