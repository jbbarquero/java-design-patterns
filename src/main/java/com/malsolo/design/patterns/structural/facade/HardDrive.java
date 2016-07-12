package com.malsolo.design.patterns.structural.facade;

public class HardDrive {

    public byte[] read(long lba, int size) {
        System.out.printf("HardDrive: reading from %d an amount of bytes: %d%n", lba, size);
        return "DATA".getBytes();
    }
}
