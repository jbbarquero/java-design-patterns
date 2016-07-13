package com.malsolo.design.patterns.structural.proxy;

public class ProxyImage implements Image {

    private final String imageFilePath;

    private Image proxifiedImage;

    public ProxyImage(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    @Override
    public void displayImage() {
        if (proxifiedImage == null) {
            proxifiedImage = new RealImage(imageFilePath);
        }
        proxifiedImage.displayImage();
    }

}
