package com.malsolo.design.patterns.structural.decorator;

public class SimpleWindow implements Window {

    @Override
    public void renderWindow() {
        System.out.println("WINDOW rendered");
    }

    @Override
    public String getDescription() {
        return "Simple Window";
    }

}
