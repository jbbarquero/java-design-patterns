package com.malsolo.design.patterns.structural.bridge;

public class SmallCar extends Vehicle {

    public SmallCar(Engine engine) {
        this.weightInKilos = 600;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.printf("\nThe small car (%d kilos) is driving %n", this.weightInKilos);
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }

}
