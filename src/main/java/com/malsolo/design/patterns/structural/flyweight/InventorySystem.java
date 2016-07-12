package com.malsolo.design.patterns.structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

    private final Catalog catalog = new Catalog();

    private final List<Order> orders = new CopyOnWriteArrayList<>();

    void takeOrder(String itemName, int orderNumber) {
        Item item = catalog.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    void process() {
        orders.stream().map(o -> o.processOrder()).forEach(orders::remove);
    }

    String report() {
        return String.format("%nTotal Item objects made: %d", catalog.totalItemsMade());
    }

}
