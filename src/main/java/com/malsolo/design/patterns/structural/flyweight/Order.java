package com.malsolo.design.patterns.structural.flyweight;

public class Order {

    private final int orderNumber;

    private final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    public Order processOrder() {
        System.out.printf("Ordeering %s for order number %d%n", item.gimmeName(), orderNumber);
        return this;
    }

}
