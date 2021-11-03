package com.levchenko.HW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        happyTickets();
        guess();
        calculate();
    }

    public static void happyTickets() {
        int leftNum = 1;
        int rightNum = 1;
        int result = 0;


        while (leftNum < 1000) {

            int leftNumCopy = leftNum;
            int leftSum = 0;
            while (leftNumCopy >= 1) {
                leftSum += leftNumCopy % 10;
                leftNumCopy /= 10;

            }
            leftNum++;

            while (rightNum < 1000) {
                int rightNumCopy = rightNum;

                int rightSum = 0;
                while (rightNumCopy >= 1) {
                    rightSum += rightNumCopy % 10;
                    rightNumCopy /= 10;
                }

                if (leftSum == rightSum) {
                    result++;


                }
                rightNum++;


            }
            rightNum = 1;


        }


        System.out.println(result);
    }

    public static void guess() {
        int secret;
        secret = (int) (Math.random() * 20);
        // Число выводится для проверки правильности работы
        System.out.println(secret);
        int quess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("guess my number ");

        quess = scanner.nextInt();
        while (secret != quess) {
            if (secret < quess) {
                System.out.println("more ");
                quess = scanner.nextInt();
            } else {
                System.out.println("less ");
                quess = scanner.nextInt();
            }

        }
        System.out.println("Sucсess!");

    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        String symbol;
        do {
            System.out.println("What you want to do ");
            symbol = scanner.next();


            switch (symbol) {
                case ("0"):
                    break;
                case ("+"):

                    System.out.println("Enter the first number ");
                    double fistNum = scanner.nextDouble();
                    System.out.println("Enter the second number ");
                    double secondNum = scanner.nextDouble();
                    System.out.println(fistNum + secondNum);
                    break;
                case ("-"):

                    System.out.println("Enter the first number ");
                    fistNum = scanner.nextDouble();
                    System.out.println("Enter the second number ");
                    secondNum = scanner.nextDouble();
                    System.out.println(fistNum - secondNum);
                    break;
                case ("*"):

                    System.out.println("Enter the first number ");
                    fistNum = scanner.nextDouble();
                    System.out.println("Enter the second number ");
                    secondNum = scanner.nextDouble();
                    System.out.println(fistNum * secondNum);
                    break;
                case ("/"):
                    System.out.println("Enter the first number ");
                    fistNum = scanner.nextDouble();
                    System.out.println("Enter the second number ");
                    secondNum = scanner.nextDouble();
                    if (secondNum != 0) {


                        System.out.println(fistNum / secondNum);
                        break;
                    } else {
                        System.out.println("Can`t resolve it");
                        break;

                    }
                default:
                    System.out.println("ERROR!");
                    break;
            }


        }while (!symbol.equals("0")) ;

        System.out.println("thank you see you later) ");

    }
}



