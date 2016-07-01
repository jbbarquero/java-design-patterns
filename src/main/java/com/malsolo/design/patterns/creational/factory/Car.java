package com.malsolo.design.patterns.creational.factory;

import java.util.logging.Logger;

public class Car extends Automobile {

    private final static Logger LOGGER = Logger.getLogger(Car.class.getName());

    @Override
    public void drive() {
        LOGGER.info("Driving a CAR...");
    }

}
