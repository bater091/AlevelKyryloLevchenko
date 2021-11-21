package com.levchenko.hw2;

public class Main {
    public static void main(String[] args) {
        // First task
        Double square = square(4, 5, 7);
        System.out.println("1. Square = " + square);
        // Second task
        int result = minAbs((int) (Math.random() * 1000 - 500), (int) (Math.random() * 1000 - 500), (int) (Math.random() * 1000 - 500));
        System.out.println("2. The least number = " + result);
        // Third task
        int rand = ((int) (Math.random() * 1000 - 500));
        System.out.println("3. " + rand + " is " + chekEven(rand));
        //Fourth task
        int conNumb = (int) (Math.random() * 2000);
        int num[] = con(conNumb);
        System.out.print("4. " + conNumb + " in binary system = ");
        int space = 3;
        for (int i = 0; i < 12; i++) {
            System.out.print(num[i]);
            if(i == space){
                System.out.print(" ");
                space +=4;
            }
        }


    }





    public static double square(double a, double b, double c) {
        double square;
        double P = (a + b + c) / 2;
        square = Math.sqrt (P * ((P - a) * (P - b) * (P - c)));

        return square;
    }

    public static int minAbs(int a, int b, int c) {
        int minAbs;
        minAbs = Math.abs(a) < Math.abs(b) ? a : b;
        minAbs = Math.abs(minAbs) < Math.abs(c) ? minAbs : c;


        return minAbs;
    }


    public static String chekEven ( int a) {
        String result;
        if (a % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }

        return result;
    }
    public static int[] con (int a){
        int [] num;
        num = new int[12];
        int ConNum = a;
        int i = 11;
        do {

            if(a % 2 == 0){
                num[i] = 0;
                a /= 2;

            }else{
                num [i] = 1;
                a -= 1;
                a /= 2;
            }
            i --;

        }while (a >= 1);

        return num;
    }

}


