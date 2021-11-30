package com.levchenko.hw10.model;

import com.levchenko.hw10.resources.PhoneActions;
import com.levchenko.hw10.resources.PhoneTrouble;

public class ButtonsPhone extends Phone implements PhoneActions {


    public ButtonsPhone(int number, int series, int charge, PhoneTrouble phoneTrouble) {
        super(number, series, charge, phoneTrouble);
    }

    @Override
    public boolean call(int number) {

        return getPhoneTrouble() != PhoneTrouble.CALLTROUBLE;
    }


    @Override
    public boolean charge() {
        return getPhoneTrouble() != PhoneTrouble.CHARGETROUBLE;
    }

    @Override
    public boolean photo() {
        return getPhoneTrouble() != PhoneTrouble.CAMERATROUBLE;
    }

    @Override
    public boolean allMethod() {
        return call(123) && charge() && photo() && unBlock();
    }

    public boolean unBlock() {
        return true;
    }

}
