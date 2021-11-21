package com.levchenko.HW8;

public class Calculate {
     UserInput userInput = new UserInput();
    double numsSum( UserInput userInput){

        return userInput.getFirstNum() + userInput.getSecondNum();
    }
    double numsMinus(UserInput userInput){

        return userInput.getFirstNum() - userInput.getSecondNum();
    }
    double numsMultip(UserInput userInput){

        return userInput.getFirstNum() * userInput.getSecondNum();
    }
    double numsDivis(UserInput userInput){

        return userInput.getFirstNum() / userInput.getSecondNum();
    }
}
