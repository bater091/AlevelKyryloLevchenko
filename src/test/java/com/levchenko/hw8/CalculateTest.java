package com.levchenko.hw8;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculateTest {

    private final Calculate calculate = new Calculate();
    private UserInput userInput;

    @Before
    public void setUp() {
        userInput = Mockito.mock(UserInput.class);

    }


    @Test
    public void numsSum() {
        Mockito.when(userInput.getFirstNum()).thenReturn(2.0);
        Mockito.when(userInput.getSecondNum()).thenReturn(3.0);
        Assertions.assertEquals(5, calculate.numsSum(userInput));

    }
    @Test
    public void numsMinusCheck() {
        Mockito.when(userInput.getFirstNum()).thenReturn(2.0);
        Mockito.when(userInput.getSecondNum()).thenReturn(3.0);
        double result = calculate.numsDivis(userInput);
        Assertions.assertTrue(result > 0);
    }

    @Test
    public void numsMinus() {
        Mockito.when(userInput.getFirstNum()).thenReturn(9.0);
        Mockito.when(userInput.getSecondNum()).thenReturn(3.0);
        Assertions.assertEquals(6, calculate.numsMinus(userInput));

    }


    @Test
    public void numsMultip() {
        Mockito.when(userInput.getFirstNum()).thenReturn(2.0);
        Mockito.when(userInput.getSecondNum()).thenReturn(3.0);
        Assertions.assertEquals(6, calculate.numsMultip(userInput));
    }
    @Test
    public void numsDivisCheckZero() {
        Mockito.when(userInput.getFirstNum()).thenReturn(0.0);
        Mockito.when(userInput.getSecondNum()).thenReturn(3.0);
        Assertions.assertEquals(0, calculate.numsDivis(userInput));
    }
    @Test
    public void numsDivis() {
        Mockito.when(userInput.getFirstNum()).thenReturn(6.0);
        Mockito.when(userInput.getSecondNum()).thenReturn(3.0);
        Assertions.assertEquals(2, calculate.numsDivis(userInput));
    }
}