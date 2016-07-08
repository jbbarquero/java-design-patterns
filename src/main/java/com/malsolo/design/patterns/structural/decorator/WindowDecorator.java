package com.malsolo.design.patterns.structural.decorator;

public abstract class WindowDecorator implements Window {

    protected Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void renderWindow() {
        this.window.renderWindow();

    }

    @Override
    public String getDescription() {
        return this.window.getDescription();
    }

}
