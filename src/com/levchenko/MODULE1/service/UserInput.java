package com.levchenko.MODULE1.service;

import com.levchenko.MODULE1.actions.Exponentiation;
import com.levchenko.MODULE1.actions.SetMassive;
import com.levchenko.MODULE1.actions.Sort;
import com.levchenko.MODULE1.model.UserMassive;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);
    SetMassive setMassive = new SetMassive();
    Sort sort = new Sort();
    Exponentiation exponentiation = new Exponentiation();
    public void userInput(UserMassive userMassive) {

        int userInput;
        do {
            System.out.println("enter massive size");
            userInput = scanner.nextInt();
            userMassive.setUserArgs(new int[userInput]);


        } while (userInput <= 9);
        setMassive.randomNumbs(userMassive);
    }
    public void userSort(UserMassive userMassive) {
        int userInput;
        System.out.println(Arrays.toString(userMassive.getUserArgs()));
        StringBuilder builder = new StringBuilder();
        builder.append("Chose how to sort\n");
        builder.append(1).append(") Height sort\n");
        builder.append(2).append(") Low sort\n");
        System.out.println(builder);
        userInput = scanner.nextInt();
        switch (userInput) {
            case (1):
                sort.sortHeight(userMassive);
                break;
            case (2):
                sort.sortLow(userMassive);
                break;
        }
        System.out.println(Arrays.toString(userMassive.getUserArgs()));
        exponentiation.ExponentArgs(userMassive);
        System.out.println(Arrays.toString(userMassive.getUserArgs()));
    }


    }

