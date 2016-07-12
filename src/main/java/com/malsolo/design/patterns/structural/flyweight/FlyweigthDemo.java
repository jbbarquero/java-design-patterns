package com.malsolo.design.patterns.structural.flyweight;

public class FlyweigthDemo {

    public static void main(String[] args) {
        InventorySystem is = new InventorySystem();

        is.takeOrder("Mandanga", 123);
        is.takeOrder("Apple TV", 321);
        is.takeOrder("Apple TV", 666);
        is.takeOrder("Mandanga", 567);
        is.takeOrder("Pan Bimbo", 444);

        is.process();

        System.out.println(is.report());

    }

}
