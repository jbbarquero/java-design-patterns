package com.malsolo.design.patterns.structural.proxy.java;

public class SomeServiceProxiedDemo {

    public static void main(String[] args) {
        SomeService service = (SomeService) SecurityProxy.newInstance(new SomeServiceStub());

        System.out.println(service.obtainInfo());

        service.updateInfo("data");

    }

}
