package com.levchenko.HW8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class SumNumbersTest {


    @Test
    void sumNumbersCheck() {

        Assertions.assertEquals(5, SumNumbers.sumNumbers(23));

    }


}