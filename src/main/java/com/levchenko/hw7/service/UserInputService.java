package com.levchenko.hw7.service;

import com.levchenko.hw7.actions.*;
import com.levchenko.hw7.model.NegativeCoef;
import com.levchenko.hw7.model.Pet;
import com.levchenko.hw7.model.Type;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputService {
    Scanner scanner = new Scanner(System.in);
    Feed feed = new Feed();
    Game game = new Game();
    Shop shop = new Shop();
    Work work = new Work();
    NegativeCoef negative = new NegativeCoef();
    Heal heal = new Heal();


    public Pet userCreatePet() {
        System.out.println("Доступные типы");

        for (int i = 0; i < Type.values().length; i++) {
            System.out.println(i + ") " + Type.values()[i]);

        }
        int userInputInt;
        do {
            System.out.println("Выберете тип");
            userInputInt = scanner.nextInt();
        } while (userInputInt < 0 || userInputInt > 3);

        String userInputName;
        do {
            System.out.println("Назовите питомца");

            userInputName = scanner.next();
        } while (userInputName.length() < 3 || userInputName.length() > 20);


        return new Pet(userInputName, Type.values()[userInputInt]);
    }

    public void actions(Pet pet) {
        StringBuilder builder = new StringBuilder("Выберете действия \n");
        builder.append(0).append(") Закончить\n");
        builder.append(1).append(") Кормить\n");
        builder.append(2).append(") Играть\n");
        builder.append(3).append(") магазин\n");
        builder.append(4).append(") работа\n");
        builder.append(5).append(") лечение\n");

        StringBuilder presentShop = new StringBuilder("Выберете цену \n");
        presentShop.append(1).append(") 100\n");
        presentShop.append(2).append(") 150\n");
        presentShop.append(3).append(") 200\n");

        int userInput;
        do {
            System.out.println(builder);
            userInput = scanner.nextInt();


            switch (userInput) {
                case (0):
                    break;
                case (1):
                    feed.actionsFeed(pet, negative);
                    break;
                case (2):
                    game.playGame(pet);
                    break;
                case (3):
                    System.out.println(presentShop);
                    int userShopInput = scanner.nextInt();
                    switch (userShopInput) {
                        case (1):
                            shop.buyPresent1(pet);
                            System.out.println(Arrays.toString(pet.getPresents()));
                            break;
                        case (2):
                            shop.buyPresent2(pet);
                            System.out.println(Arrays.toString(pet.getPresents()));
                            break;
                        case (3):
                            shop.buyPresent3(pet);
                            System.out.println(Arrays.toString(pet.getPresents()));
                            break;

                    }
                    break;
                case (4):
                    work.work(pet);
                    break;
                case (5):
                    heal.petHeal(pet);
                    break;


            }
            if (pet.isSick()) {
                System.out.println("Питомец заболел");
            }
            System.out.println(pet);
        } while (userInput != 0);


    }

}
