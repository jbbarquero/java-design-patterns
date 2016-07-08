package com.malsolo.design.patterns.structural.composite;

import lombok.Getter;

@Getter
public abstract class AbstractMenuComponent implements MenuComponent {

    private final String name;

    private final String url;

    public AbstractMenuComponent(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String print() {
        return String.format("%s: %s", name, url);
    }

}
