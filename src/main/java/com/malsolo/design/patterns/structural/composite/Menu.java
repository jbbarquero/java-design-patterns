package com.malsolo.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu extends AbstractMenuComponent {

    private final List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, String url) {
        super(name, url);
    }

    public void add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }

    @Override
    public String print() {
        return String.format("%s%n%s", super.print(), this.menuComponents.stream().map(m -> m.print()).collect(Collectors.joining("\n")));
    }

}
