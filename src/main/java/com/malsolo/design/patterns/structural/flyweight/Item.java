package com.malsolo.design.patterns.structural.flyweight;

/**
 * Class to be "flyweighted"
 * 
 * @author jbeneito
 *
 */
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String gimmeName() {
        return name;
    }

}
