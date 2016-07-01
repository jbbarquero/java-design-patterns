package com.malsolo.design.patterns.creational.abstractfactory.animals;

public class Dinosaur extends Animal {

    @Override
    public String name() {
        return "I'm a Dinosaur";
    }

    @Override
    public String makeSound() {
        return "Roar";
    }

}
