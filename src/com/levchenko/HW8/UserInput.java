package com.levchenko.HW8;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class UserInput {
    private double firstNum;
    private double secondNum;
    private final Scanner scanner = new Scanner(System.in);

    public void userInFirstNum() {
        int userIn = 0;
        while (userIn <= 0) {

            userIn = scanner.nextInt();
            setFirstNum(userIn);
        }

    }

    public void userInSecondNum() {
        int userIn = 0;
        while (userIn <= 0) {

            userIn = scanner.nextInt();
            setSecondNum(userIn);

        }

    }
}
