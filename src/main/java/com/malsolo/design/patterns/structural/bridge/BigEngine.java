package com.malsolo.design.patterns.structural.bridge;

public class BigEngine implements Engine {

    int horsepower;

    public BigEngine() {
        horsepower = 350;
    }

    @Override
    public int go() {
        System.out.printf("The small engine is running with horspower %d%n", horsepower);
        return horsepower;
    }

}
