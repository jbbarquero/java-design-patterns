package com.malsolo.design.patterns.structural.bridge;

public class SmallEngine implements Engine {

    int horsepower;

    public SmallEngine() {
        horsepower = 100;
    }

    @Override
    public int go() {
        System.out.printf("The small engine is running with horspower %d%n", horsepower);
        return horsepower;
    }

}
