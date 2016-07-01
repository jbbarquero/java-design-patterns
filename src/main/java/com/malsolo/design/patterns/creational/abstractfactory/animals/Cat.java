package com.malsolo.design.patterns.creational.abstractfactory.animals;

public class Cat extends Animal {

    @Override
    public String name() {
        return "I'm a Cat";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

}
