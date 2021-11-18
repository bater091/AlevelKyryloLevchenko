package com.levchenko.MODULE1.actions;

import com.levchenko.MODULE1.model.UserMassive;

import java.util.Arrays;

public class Sort {
    public void sortHeight(UserMassive userMassive) {
        int[] argsCopy = new int[userMassive.getUserArgs().length];
        argsCopy = Arrays.copyOf(userMassive.getUserArgs(),userMassive.getUserArgs().length);
        for (int i = 0; i < argsCopy.length - 1; i++) {
            for (int j = i + 1; j < argsCopy.length; j++) {
                if (argsCopy[i] > argsCopy[j]) {

                } else {
                    int safeNumb = argsCopy[i];
                    argsCopy[i] = argsCopy[j];
                    argsCopy[j] = safeNumb;
                }


            }


        }
        userMassive.setUserArgs(argsCopy);
    }

    public void sortLow(UserMassive userMassive) {
        int[] argsCopy = new int[userMassive.getUserArgs().length];
        argsCopy = Arrays.copyOf(userMassive.getUserArgs(),userMassive.getUserArgs().length);
        for (int i = 0; i < argsCopy.length - 1; i++) {
            for (int j = i + 1; j < argsCopy.length; j++) {
                if (argsCopy[i] < argsCopy[j]) {

                } else {
                    int safeNumb = argsCopy[i];
                    argsCopy[i] = argsCopy[j];
                    argsCopy[j] = safeNumb;
                }


            }


        }
        userMassive.setUserArgs(argsCopy);
    }
}
