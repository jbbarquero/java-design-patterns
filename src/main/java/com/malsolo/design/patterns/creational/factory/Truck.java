package com.malsolo.design.patterns.creational.factory;

import java.util.logging.Logger;

public class Truck extends Automobile {

    private final static Logger LOGGER = Logger.getLogger(Truck.class.getName());

    @Override
    public void drive() {
        LOGGER.info("Driving a TRUCK...");
    }

}
