package com.levchenko.hw8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumNumbersTest {


    @Test
    void sumNumbersCheck() {

        Assertions.assertEquals(5, SumNumbers.sumNumbers(23));

    }
    @Test
    void sumNumbersCheckPos() {

        Assertions.assertEquals(-1, SumNumbers.sumNumbers(-2));

    }


}