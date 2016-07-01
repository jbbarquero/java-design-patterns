package com.malsolo.design.patterns.creational.abstractfactory.animals;

public class Dog extends Animal {

    @Override
    public String name() {
        return "I'm a Dog";
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

}
