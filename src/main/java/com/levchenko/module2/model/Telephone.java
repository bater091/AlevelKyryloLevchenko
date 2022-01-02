package com.levchenko.module2.model;

import lombok.Getter;
import lombok.ToString;

@Getter
public class Telephone extends Electronics {
    private final String model;

    public Telephone(String series, String screenType, int price, String model, String type) {
        super(series, screenType, price, type);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "model='" + model + '\'' +
                ", price=" + getPrice() +

                '}';
    }
}
