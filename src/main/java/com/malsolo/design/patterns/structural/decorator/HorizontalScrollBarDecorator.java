package com.malsolo.design.patterns.structural.decorator;

public class HorizontalScrollBarDecorator extends WindowDecorator {

    public HorizontalScrollBarDecorator(Window window) {
        super(window);
    }

    @Override
    public void renderWindow() {
        super.renderWindow();
        drawHorizontalScrollBar();
    }

    private void drawHorizontalScrollBar() {
        System.out.println("HORIZONTAL scroll bar rendered");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", including horizontal scrollbars";
    }

}
