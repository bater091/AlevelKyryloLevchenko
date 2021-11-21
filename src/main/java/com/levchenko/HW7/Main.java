package com.levchenko.HW7;

import com.levchenko.HW7.model.Pet;
import com.levchenko.HW7.model.Type;
import com.levchenko.HW7.service.UserInputService;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        UserInputService userInputService = new UserInputService();
        final Pet userPet = userInputService.userCreatePet();

        System.out.println(userPet);
        userInputService.actions(userPet);


    }
}