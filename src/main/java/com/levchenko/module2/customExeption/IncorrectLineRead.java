package com.levchenko.module2.customExeption;

import java.io.IOException;

public class IncorrectLineRead extends IOException {
    private String line;

    public IncorrectLineRead(String massage, String line) {
        super(massage);
        this.line = line;
    }

}
