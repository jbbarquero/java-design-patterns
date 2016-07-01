package com.malsolo.design.patterns.creational.factory;

public class AutomobileFactory {

    public static Automobile getAutomobile(String type) {
        switch (type) {
        case "car":
            return new Car();
        case "truck":
            return new Truck();
        default:
            throw new IllegalArgumentException(String.format("Type not supported: %s", type));
        }
    }

}
