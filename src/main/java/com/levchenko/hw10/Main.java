package com.levchenko.hw10;

import com.levchenko.hw10.model.*;
import com.levchenko.hw10.resources.PhoneTrouble;

public class Main {
    public static void main(String[] args) {
        PhoneService phoneService = new PhoneService();
        SmartPhone smartPhoneReference = new SmartPhone(0, 0, 100, PhoneTrouble.DEFAULT);
        SmartPhone smartPhone = new SmartPhone(123, 321, 50, PhoneTrouble.CALLTROUBLE);
        ButtonsPhone buttonsPhone = new ButtonsPhone(456, 654, 100, PhoneTrouble.CAMERATROUBLE);
        ButtonsPhone buttonsPhoneReference = new ButtonsPhone(0, 0, 100, PhoneTrouble.DEFAULT);
        OldPhone oldPhone = new OldPhone(678, 876, 45, PhoneTrouble.CHARGETROUBLE);
        OldPhone oldPhoneReference = new OldPhone(0, 0, 100, PhoneTrouble.DEFAULT);
        Phone[] phonesReference = new Phone[3];
        phonesReference[0] = smartPhoneReference;
        phonesReference[1] = buttonsPhoneReference;
        phonesReference[2] = oldPhoneReference;
        Phone[] phones = new Phone[3];
        phones[0] = smartPhone;
        phones[1] = buttonsPhone;
        phones[2] = oldPhone;
        System.out.println("phone 1 " + smartPhone.call(123));
        System.out.println("phone 2 " + buttonsPhone.photo());
        System.out.println("phone 3 " + oldPhone.charge());


        int j = 0;
        int i = 1;
        for (Phone phone : phonesReference) {

            phoneService.phoneRepair(phones[j]);
            System.out.println("phone " + i + " repairing is " + Phone.equalsAndHashCode(phones[j], phone));
            System.out.println("phone " + i + " test " + phones[j].allMethod());

            j++;
            i++;


        }


    }
}
