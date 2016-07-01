package com.malsolo.design.patterns.creational.abstractfactory.factories;

public class AbstractFactory {

    public SpeciesFactory getSpeciesFactory(SpeciesTypes type) {
        switch (type) {
        case MAMMAL:
            return new MammalFactory();
        case REPTILE:
            return new ReptileFactory();
        default:
            throw new IllegalArgumentException(String.format("SpeciesTypes currently not supported: %s", type));
        }
    }

}
