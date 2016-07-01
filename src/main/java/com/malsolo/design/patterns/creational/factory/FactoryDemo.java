package com.malsolo.design.patterns.creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {

        Automobile car = AutomobileFactory.getAutomobile("car");

        car.drive();

        Automobile truck = AutomobileFactory.getAutomobile("truck");

        truck.drive();

    }

}
