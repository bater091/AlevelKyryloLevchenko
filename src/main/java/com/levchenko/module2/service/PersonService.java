package com.levchenko.module2.service;

import com.levchenko.module2.model.Customer;

import java.math.BigInteger;
import java.util.Random;

public class PersonService {
    private static final Random random = new Random();
    private static final StringBuilder stringBuilder = new StringBuilder();

    public static Customer createCustomer() {
        stringBuilder.delete(0, stringBuilder.length());
        String customerEmail = new BigInteger(25, random).toString(32);
        stringBuilder.append(customerEmail);
        stringBuilder.append("@gmail.com");

        return new Customer((int) (Math.random() * 100), (int) (Math.random() * 15 + 15), stringBuilder.toString());
    }

    public static void main(String[] args) {
        Customer customer = PersonService.createCustomer();
        System.out.println(customer.toString());
    }
}
