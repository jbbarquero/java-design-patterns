package com.malsolo.design.patterns.creational.abstractfactory.factories;

import com.malsolo.design.patterns.creational.abstractfactory.animals.Animal;
import com.malsolo.design.patterns.creational.abstractfactory.animals.Dinosaur;
import com.malsolo.design.patterns.creational.abstractfactory.animals.Snake;

public class ReptileFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String animalName) {
        switch (animalName) {
        case "snake":
            return new Snake();
        case "dinosaur":
            return new Dinosaur();
        default:
            throw new IllegalArgumentException(String.format("Animal name not supported: %s", animalName));
        }
    }

}
