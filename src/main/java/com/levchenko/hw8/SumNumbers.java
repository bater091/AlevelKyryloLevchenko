package com.levchenko.hw8;

public class SumNumbers {
    static int sumNumbers(int num){
        if(num > 0) {
            int result = 0;
            while (num >= 1) {
                result += num % 10;
                num /= 10;
            }

            return result;
        }else{
            return -1;
        }

    }
}