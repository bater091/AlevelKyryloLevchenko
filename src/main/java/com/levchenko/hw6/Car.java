package com.levchenko.hw6;

public class Car {
    private Manufacture manufacture;
    private Engine engine;
    private String colour;
    private int petrol;

    public Car(Manufacture manufacture, Engine engine, String colour) {
        this.manufacture = manufacture;
        this.engine = engine;
        this.colour = colour;
        petrol = 100;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public void startEngine(String name) {
        System.out.println(name + "start engine");
    }

    public boolean isEnoughPetrolLevel() {
        boolean result;
        if (petrol > 50) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


    public Car() {
    }

    @Override
    public String toString() {
        return "Car " +
                "manufacture = '" + manufacture + '\'' +
                ", engine = '" + engine + '\'' +
                ", colour = '" + colour + '\'' +
                ", petrol = " + petrol;

    }

}
