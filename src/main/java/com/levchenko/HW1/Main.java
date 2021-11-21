package com.levchenko.HW1;

public class Main {
    public static void main(String[] args) {


        String name = "Kyrylo";
        String surname = "Levchenko";
        System.out.println(name + " " + surname);
        if (name.length() < 7){
            System.out.println("less that 7");
        }else{
            System.out.println("more that 7");
        }
        int res = 5;
        for(int i = 0; i < 11; i++){

            System.out.println("Step " + i + " Result " + res);
            res +=2;
        }

    }
}

