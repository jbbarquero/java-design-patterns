package com.malsolo.design.patterns.creational.singleton;

public enum SingletonEnum {

    INSTANCE;

    private SingletonEnum() {
        try {
            Thread.sleep(3000);
            System.err.println("Singleton ENUM CREATED");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void doStuff() {
        System.out.println("STUFF");
    }

}
