package com.levchenko.module2.model;

import lombok.Getter;
import lombok.ToString;


@Getter
public class Television extends Electronics {
    private final String country;
    private final int diagonal;

    public Television(String series, String screenType, int price, String country, int diagonal, String type) {
        super(series, screenType, price, type);
        this.country = country;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Television{" +
                "country='" + country + '\'' +
                ", diagonal=" + diagonal + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
