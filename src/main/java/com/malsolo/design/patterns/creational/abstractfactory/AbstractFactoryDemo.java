package com.malsolo.design.patterns.creational.abstractfactory;

import java.util.ArrayList;
import java.util.List;

import com.malsolo.design.patterns.creational.abstractfactory.animals.Animal;
import com.malsolo.design.patterns.creational.abstractfactory.factories.AbstractFactory;
import com.malsolo.design.patterns.creational.abstractfactory.factories.SpeciesFactory;
import com.malsolo.design.patterns.creational.abstractfactory.factories.SpeciesTypes;

/**
 * Abstract Factory Pattern Examples in JDK
 * <ol>
 * <li>javax.xml.parsers.DocumentBuilderFactory#newInstance()</li>
 * <li>javax.xml.transform.TransformerFactory#newInstance()</li>
 * <li>javax.xml.xpath.XPathFactory#newInstance()</li>
 * </ol>
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        AbstractFactory abstractFactory = new AbstractFactory();

        SpeciesFactory reptileFactory = abstractFactory.getSpeciesFactory(SpeciesTypes.REPTILE);
        animals.add(reptileFactory.getAnimal("snake"));
        animals.add(reptileFactory.getAnimal("dinosaur"));
        SpeciesFactory mammalFactory = abstractFactory.getSpeciesFactory(SpeciesTypes.MAMMAL);
        animals.add(mammalFactory.getAnimal("dog"));
        animals.add(mammalFactory.getAnimal("cat"));

        animals.stream().map(a -> String.format("%s: %s", a.name(), a.makeSound())).forEach(System.out::println);
        ;

    }

}
