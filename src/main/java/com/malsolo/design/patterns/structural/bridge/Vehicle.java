package com.malsolo.design.patterns.structural.bridge;

public abstract class Vehicle {

    Engine engine;

    int weightInKilos;

    public abstract void drive();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void reportOnSpeed(int horsepower) {
        int ratio = weightInKilos / horsepower;
        if (ratio < 3) {
            System.out.printf("The vehicle is going at a fast speed: ratio=%d%n", ratio);
        } else if ((ratio >= 3) && (ratio < 8)) {
            System.out.printf("The vehicle is going an average speed: ratio=%d%n", ratio);
        } else {
            System.out.printf("The vehicle is going at a slow speed: ratio=%d%n", ratio);
        }
    }

}
