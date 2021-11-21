package com.levchenko.HW5;



import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("first tusk");
        findHighNumb();
        System.out.println();
        System.out.println("second tusk");
        changeOddNum();
        System.out.println();
        System.out.println("third tusk");
        subsequence();
        System.out.println();
        System.out.println("fourth tusk");
        averageNum();
        System.out.println();
        System.out.println("fifth tusk");
        userArgs();
    }


    private static void findHighNumb() {
        int[] args = new int[12];
        for (int i = 0; i < args.length; i++) {
            args[i] = (int) (Math.random() * 31 - 16);
        }
        System.out.println(Arrays.toString(args));
        int highNum = args[0];
        int indexHighNum = 0;
        for (int i = 1; i < args.length; i++) {

            if (highNum <= args[i]) {
                highNum = args[i];
                indexHighNum = i;

            }




        }
        System.out.println("HighNumb = " + highNum + " index = " + indexHighNum);

    }

    private static void changeOddNum() {
        int[] args = new int[8];
        for (int i = 0; i < args.length; i++) {
            args[i] = (int) (Math.random() * 10 + 1);


        }
        System.out.println(Arrays.toString(args));
        for (int i = 1; i < args.length; i += 2) {
            args[i] = 0;

        }
        System.out.println(Arrays.toString(args));

    }

    private static void subsequence() {
        int[] args = new int[4];
        for (int i = 0; i < args.length; i++) {
            args[i] = (int) (Math.random() * 90) + 10;

        }
        System.out.println(Arrays.toString(args));
        boolean flag = false;
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i] < args[i + 1]) {
                flag = true;


            } else {
                System.out.println("Error!");
                flag = false;
                break;
            }


        }
        if (flag) {
            System.out.println("OK!");
        }


    }

    private static void averageNum() {
        int[] args1 = new int[5];
        int[] args2 = new int[5];
        for (int i = 0; i < args2.length; i++) {
            args2[i] = (int) (Math.random() * 6);
            args1[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(args1));
        System.out.println(Arrays.toString(args2));

        if (average(args1) > average(args2)) {
            System.out.println("First average " + average(args1) + " > Second average " + average(args2));
        } else {
            if (average(args1) == average(args2)) {
                System.out.println("First average " + average(args1) + " = Second average " + average(args2));

            } else {

                System.out.println("First average " + average(args1) + " < Second average " + average(args2));
            }

        }
    }


    private static double average(int[] a) {
        double averageNum = 0;
        for (int i = 0; i < a.length; i++) {
            averageNum += a[i];


        }
        averageNum /= a.length;
        return averageNum;
    }

    private static void userArgs() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (input <= 3) {
            System.out.println("Enter your number ");
            input = scanner.nextInt();


        }
        int[] args = new int[input];
        for (int i = 0; i < args.length; i++) {
            args[i] = (int) (Math.random() * (input + 1));

        }
        System.out.println(Arrays.toString(args));
        int countOddNum = 0;
        for (int i = 0; i < args.length; i++) {
            if ( args[i] % 2 == 0){
                countOddNum ++;
            }

        }



    int[] argsCopy = new int[countOddNum];
        int indexNum = 0;
        for (int j = 0; j < argsCopy.length; j++) {

            for (int i = indexNum; i < args.length; i++) {
                if (args[i] % 2 == 0) {
                    argsCopy[j] = args[i];
                    indexNum = i + 1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(argsCopy));
}



    }




