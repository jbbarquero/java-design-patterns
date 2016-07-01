package com.malsolo.design.patterns.creational.abstractfactory.factories;

import com.malsolo.design.patterns.creational.abstractfactory.animals.Animal;
import com.malsolo.design.patterns.creational.abstractfactory.animals.Cat;
import com.malsolo.design.patterns.creational.abstractfactory.animals.Dog;

public class MammalFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String animalName) {
        switch (animalName) {
        case "cat":
            return new Cat();
        case "dog":
            return new Dog();
        default:
            throw new IllegalArgumentException(String.format("Animal name not supported: %s", animalName));
        }
    }

}
