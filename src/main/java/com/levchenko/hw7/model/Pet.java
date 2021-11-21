package com.levchenko.hw7.model;

public class Pet {
    private final String name;
    private final Type type;
    private int age;
    private double hungry;
    private int money;
    private double clear;
    private double happy;
    private int gameCount;
    private String[] presents;
    private int workCount;
    private boolean sick;

    public Pet(String name, Type type) {
        this.name = name;
        this.type = type;
        this.age = 1;
        this.hungry = 100;
        this.happy = 50;
        this.clear = 100;
        this.presents = new String[0];
        this.sick = false;
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    public int getWorkCount() {
        return workCount;
    }

    public void setWorkCount(int workCount) {
        this.workCount = workCount;
    }

    public String[] getPresents() {
        return presents;
    }

    public void setPresents(String[] presents) {
        this.presents = presents;
    }


    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHungry() {
        return hungry;
    }

    public void setHungry(double hungry) {
        this.hungry = hungry;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public double getClear() {
        return clear;
    }

    public void setClear(double clear) {
        this.clear = clear;
    }

    public double getHappy() {
        return happy;
    }

    public void setHappy(double happy) {
        this.happy = happy;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                ", hungry=" + hungry +
                ", money=" + money +
                ", clear=" + clear +
                ", happy=" + happy +
                '}';
    }
}
