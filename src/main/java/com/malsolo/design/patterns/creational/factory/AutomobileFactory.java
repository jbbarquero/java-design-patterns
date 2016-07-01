package com.malsolo.design.patterns.creational.factory;

/**
 * Factory Pattern Examples in JDK
 * <ol>
 * <li>java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.</li>
 * <li>valueOf() method in wrapper classes like Boolean, Integer etc.</li>
 * </ol>
 */
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
