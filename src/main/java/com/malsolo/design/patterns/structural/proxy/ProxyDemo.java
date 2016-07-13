package com.malsolo.design.patterns.structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        final Image image1 = new ProxyImage("photo1");
        final Image image2 = new ProxyImage("photo2");
        @SuppressWarnings("unused")
        final Image image3 = new ProxyImage("photo3");

        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
        // image3 never loaded

        @SuppressWarnings("unused")
        final Image image4 = new RealImage("photo4");
        // image4 loaded in spite is never used
    }

}
