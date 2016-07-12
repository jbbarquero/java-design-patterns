package com.malsolo.design.patterns.structural.facade;

public class Cpu {

    public void freeze() {
        System.out.println("CPU: freeze.");
    }

    public void jump(long position) {
        System.out.println("CPU: jump to " + position);
    }

    public void execute() {
        System.out.println("CPU: execute.");
    }

}
