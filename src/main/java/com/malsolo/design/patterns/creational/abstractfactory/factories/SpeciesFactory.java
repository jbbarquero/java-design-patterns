package com.malsolo.design.patterns.creational.abstractfactory.factories;

import com.malsolo.design.patterns.creational.abstractfactory.animals.Animal;

public abstract class SpeciesFactory {

    public abstract Animal getAnimal(String animalName);

}
