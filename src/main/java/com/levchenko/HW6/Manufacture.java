package com.levchenko.HW6;

public enum Manufacture {
    BMW ("БМВ"),
    Volvo ("Вольво"),
    KIA ("КИА");
    private String russianName;

    Manufacture(String russianName) {
        this.russianName = russianName;
    }

    @Override
    public String toString() {
        return russianName;

    }
}