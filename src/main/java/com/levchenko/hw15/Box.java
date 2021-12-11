package com.levchenko.hw15;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Box {
    private double Volume;

    public Box(double volume) {
        Volume = volume;
    }


}
