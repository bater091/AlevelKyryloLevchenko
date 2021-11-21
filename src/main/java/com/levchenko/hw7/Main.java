package com.levchenko.hw7;

import com.levchenko.hw7.model.Pet;
import com.levchenko.hw7.service.UserInputService;

public class Main {
    public static void main(String[] args) {
        UserInputService userInputService = new UserInputService();
        final Pet userPet = userInputService.userCreatePet();

        System.out.println(userPet);
        userInputService.actions(userPet);


    }
}