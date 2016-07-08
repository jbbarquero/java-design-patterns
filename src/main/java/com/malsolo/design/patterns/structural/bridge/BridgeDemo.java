package com.malsolo.design.patterns.structural.bridge;

/**
 * @see http://www.oodesign.com/bridge-pattern.html
 * @see http://www.avajava.com/tutorials/lessons/bridge-pattern.html
 * @see http://www.programcreek.com/2011/10/java-design-pattern-bridge/
 * @author Javier
 *
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Vehicle vehicle = new BigBus(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();

        vehicle = new SmallCar(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();

    }

}
