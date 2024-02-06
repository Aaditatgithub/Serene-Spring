package com.in28minutes.junit;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {
    //Famous Junit green bar :: absence of failure is success

    private MyMath math = new MyMath();
    @Test
    public void calculateSum_ThreeMemberArray(){
        // Asserts or Test Conditions
         assertEquals(5, math.calculateSum(new int[]{1,2,3}));
    }
    @Test
    public void calculateSum_ZeroMemberArray(){
        // Asserts or Test Conditions
        assertEquals(0, math.calculateSum(new int[]{}));
    }
}