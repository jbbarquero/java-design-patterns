package com.malsolo.design.patterns.creational.abstractfactory.animals;

public class Snake extends Animal {

    @Override
    public String name() {
        return "I'm a Snake";
    }

    @Override
    public String makeSound() {
        return "Hiss";
    }

}
