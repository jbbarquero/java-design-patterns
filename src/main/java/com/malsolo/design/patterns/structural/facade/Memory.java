package com.malsolo.design.patterns.structural.facade;

public class Memory {

    public void load(long position, byte[] data) {
        System.out.printf("Memory: loading data %s into position %d%n", new String(data), position);
    }

}
