package com.levchenko.hw10.model;

import com.levchenko.hw10.resources.PhoneTrouble;

public class PhoneService {
    public void phoneRepair(Phone phone) {
        if (phone.getPhoneTrouble() != PhoneTrouble.DEFAULT) {
            phone.setPhoneTrouble(PhoneTrouble.DEFAULT);
        }

    }
}
