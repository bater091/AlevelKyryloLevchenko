package com.levchenko.HW8;

public class SumNumbers {
    static int sumNumbers(int num){
        int result = 0;
        while (num >= 1){
            result += num % 10;
            num /= 10;
        }

        return result;


    }
}