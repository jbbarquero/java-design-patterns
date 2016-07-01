package com.malsolo.design.patterns.creational.factory;

import lombok.Data;

@Data
public abstract class Automobile {

    private String color, make, model;

    private int cc, gears, year;

    public abstract void drive();

}
