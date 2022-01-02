package com.levchenko.module2.model;

import lombok.Getter;
import lombok.ToString;


@Getter
public class Electronics {
    private final String series, screenType, type;
    private final int price;


    public Electronics(String series, String screenType, int price, String type) {
        this.series = series;
        this.screenType = screenType;
        this.price = price;
        this.type = type;
    }


}
