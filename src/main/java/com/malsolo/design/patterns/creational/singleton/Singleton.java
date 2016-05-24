package com.malsolo.design.patterns.creational.singleton;

public class Singleton {

    private final static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void doStuff() {
        System.out.println("STUFF");
    }
}
