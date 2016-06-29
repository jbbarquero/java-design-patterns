package com.malsolo.design.patterns.creational.prototype;

import lombok.Data;

@Data
public abstract class Item implements Cloneable {

    private String title;

    private double price;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
