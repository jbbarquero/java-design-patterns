package com.malsolo.design.patterns.structural.proxy;

public class RealImage implements Image {

    private final String filename;

    public RealImage(final String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.printf("Loading REAL IMAGE %s%n", filename);
    }

    @Override
    public void displayImage() {
        System.out.printf("Displaying %s%n", filename);
    }

}
