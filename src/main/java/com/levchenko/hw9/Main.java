package com.levchenko.hw9;

public class Main {
    public static void main(String[] args) {
        Recovery recovery = new Recovery() {
            @Override
            public void reFuel() {
                System.out.println("Success");
            }
        };
        recovery.reFuel();


    }
}