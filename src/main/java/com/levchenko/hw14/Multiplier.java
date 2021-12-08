package com.levchenko.hw14;

import java.util.Arrays;
import java.util.List;


interface Multiplier<T> {
    <G extends Number> Double[] doubleValueIn(G[] array);
}
