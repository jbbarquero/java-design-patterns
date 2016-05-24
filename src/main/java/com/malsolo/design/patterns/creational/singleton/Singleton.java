package com.malsolo.design.patterns.creational.singleton;

public class Singleton {

    private final static Singleton instance = new Singleton();

    private Singleton() {
        try {
            Thread.sleep(3000);
            System.err.println("Singleton CREATED");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void doStuff() {
        System.out.println("STUFF");
    }
}
