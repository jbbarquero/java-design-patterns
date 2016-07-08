package com.malsolo.design.patterns.structural.decorator;

public class VerticalScrollBarDecorator extends WindowDecorator {

    public VerticalScrollBarDecorator(Window window) {
        super(window);
    }

    @Override
    public void renderWindow() {
        super.renderWindow();
        drawVerticalScrollBar();
    }

    private void drawVerticalScrollBar() {
        System.out.println("VERTICAL scroll bar rendered");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", including vertical scrollbars";
    }

}
