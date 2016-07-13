package com.malsolo.design.patterns.structural.proxy.java;

public class SomeServiceStub implements SomeService {

    @Override
    public String obtainInfo() {
        return "INFO 4 U";
    }

    @Override
    public void updateInfo(String data) {
        System.out.printf("INFO updated with data %s%n", data);
    }

}
