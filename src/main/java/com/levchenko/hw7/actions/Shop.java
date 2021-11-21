package com.levchenko.hw7.actions;

import com.levchenko.hw7.model.Pet;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Shop {
    SecureRandom random = new SecureRandom();


    public void buyPresent1(Pet pet) {

        if (pet.getMoney() >= 100) {
            pet.setHappy(pet.getHappy() + 20);
            String[] presentsCopy = new String[pet.getPresents().length + 1];
            System.arraycopy(pet.getPresents(), 0, presentsCopy, 0, pet.getPresents().length);
            pet.setPresents(new String[pet.getPresents().length + 1]);

            String presentName = new BigInteger(25, random).toString(32);
            presentsCopy[presentsCopy.length - 1] = presentName;
            pet.setPresents(presentsCopy);
            pet.setMoney(pet.getMoney() - 100);


        } else {
            System.out.println("недостаточно денег");
        }


    }

    public void buyPresent2(Pet pet) {
        if (pet.getMoney() >= 150) {
            pet.setHappy(pet.getHappy() + 25);
            String[] presentsCopy = new String[pet.getPresents().length + 1];
            System.arraycopy(pet.getPresents(), 0, presentsCopy, 0, pet.getPresents().length);
            pet.setPresents(new String[pet.getPresents().length + 1]);

            String presentName = new BigInteger(25, random).toString(32);
            presentsCopy[presentsCopy.length - 1] = presentName;
            pet.setPresents(presentsCopy);
            pet.setMoney(pet.getMoney() - 150);


        } else {
            System.out.println("недостаточно денег");
        }

    }


    public void buyPresent3(Pet pet) {
        if (pet.getMoney() >= 200) {
            pet.setHappy(pet.getHappy() + 30);
            String[] presentsCopy = new String[pet.getPresents().length + 1];
            System.arraycopy(pet.getPresents(), 0, presentsCopy, 0, pet.getPresents().length);
            pet.setPresents(new String[pet.getPresents().length + 1]);

            String presentName = new BigInteger(25, random).toString(32);
            presentsCopy[presentsCopy.length - 1] = presentName;
            pet.setPresents(presentsCopy);
            pet.setMoney(pet.getMoney() - 200);


        } else {
            System.out.println("недостаточно денег");
        }
    }
}
