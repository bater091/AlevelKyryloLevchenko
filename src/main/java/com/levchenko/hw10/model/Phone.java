package com.levchenko.hw10.model;

import com.levchenko.hw10.resources.PhoneTrouble;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public abstract class Phone {
    private int number;
    private int series;
    private int charge;
    private PhoneTrouble phoneTrouble;

    public Phone(int number, int series, int charge, PhoneTrouble phoneTrouble) {
        this.number = number;
        this.series = series;
        this.charge = charge;
        this.phoneTrouble = phoneTrouble;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return phoneTrouble == phone.phoneTrouble;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneTrouble);
    }

    public static boolean equalsAndHashCode(Object compare, Object reference) {
        if (reference.hashCode() == compare.hashCode()) {
            return compare.equals(reference);
        } else {
            return false;
        }
    }

    public boolean allMethod() {
        return false;
    }

}
