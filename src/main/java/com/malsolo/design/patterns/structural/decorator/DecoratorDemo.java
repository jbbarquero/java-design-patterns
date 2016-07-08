package com.malsolo.design.patterns.structural.decorator;

/**
 * @see http://www.oodesign.com/decorator-pattern.html
 * @see http://www.avajava.com/tutorials/lessons/decorator-pattern.html
 * @see https://en.wikipedia.org/wiki/Decorator_pattern#Java
 * @author jbeneito
 *
 */
public class DecoratorDemo {

    public static void main(String[] args) {

        Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));

        System.out.println(decoratedWindow.getDescription());

        //@formatter:off
        /*
         * It will print: 
         * WINDOW rendered 
         * VERTICAL scroll bar rendered 
         * HORIZONTAL scroll bar rendered
         * 
         * Because it uses inheritance delegation. 
         * It's not goint to repite the WINDOW rendered message
         */
        //@formatter:on
        decoratedWindow.renderWindow();

    }

}
