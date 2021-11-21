package com.levchenko.MODULE1;

import com.levchenko.MODULE1.model.UserMassive;
import com.levchenko.MODULE1.service.UserInput;

public class Main {
    public static void main(String[] args) {
       UserInput userInput = new UserInput();
        UserMassive userMassive = new UserMassive();
        userInput.userInput(userMassive);
        userInput.userSort(userMassive);
        System.out.println();
        System.out.println();
        System.out.println();
        int[] array = new int[]{1,2,3};
        Lock lock = new Lock(array);
        System.out.println(lock.toString());
        lock.getArgs()[0] = 10;
        lock.getArgs()[1] = 1;
        System.out.println(lock.toString());
    }
}
