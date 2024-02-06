package com.in28minutes.junit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS","Azure","DevOps");
    @Test
    public void test(){
        boolean test = todos.contains("AWS");
        boolean test2 = todos.contains("GCP");
        //assertEquals(true, test);

        //Works for boolean values only
        assertTrue(test,"Something went wrong");
        assertTrue(test2,"Something went wrong");

        assertArrayEquals(new int[] {1,2}, new int[] {1,2,3});

        assertEquals(3,todos.size());
    }
}
