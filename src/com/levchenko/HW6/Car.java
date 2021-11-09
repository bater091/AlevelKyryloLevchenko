package com.levchenko.HW6;

public class Car {
    Manufacture manufacture;
    Engine engine;
    private String colour;
    private int petrol;

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
        if (petrol < 50) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    public Car(Manufacture manufacture, Engine engine, String colour) {
        this.manufacture = manufacture;
        this.engine = engine;
        this.colour = colour;
        petrol = 100;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car " +
                "manufacture = '" + manufacture.toString() + '\'' +
                ", engine = '" + engine.toString() + '\'' +
                ", colour = '" + colour + '\'' +
                ", petrol = " + petrol;

    }

}
