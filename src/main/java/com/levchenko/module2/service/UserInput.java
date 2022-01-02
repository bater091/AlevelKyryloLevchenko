package com.levchenko.module2.service;

import java.util.Scanner;

public class UserInput {
    static int priceLimit;
    private final static Scanner sc = new Scanner(System.in);

    public static void chooseLimit() {
        priceLimit = sc.nextInt();
    }

}
