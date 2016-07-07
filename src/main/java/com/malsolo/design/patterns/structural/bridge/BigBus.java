package com.malsolo.design.patterns.structural.bridge;

public class BigBus extends Vehicle {

    public BigBus(Engine engine) {
        this.weightInKilos = 3000;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.printf("\nThe big bus (%d kilos) is driving%n", this.weightInKilos);
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }

}
