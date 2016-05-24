package com.malsolo.design.patterns.creational.singleton;

import static com.google.common.base.Objects.equal;
import static com.google.common.base.Preconditions.checkArgument;

public class SingletonDemo {

    public static void main(String[] args) {

        System.out.println("MAIN");

        long start = System.currentTimeMillis();
        Singleton s1 = Singleton.getInstance();
        long end = System.currentTimeMillis();
        System.out.printf("SINGLETON 1 CREATED IN %d ms: %s%n", end - start, s1);
        start = System.currentTimeMillis();
        Singleton s2 = Singleton.getInstance();
        end = System.currentTimeMillis();
        System.out.printf("SINGLETON 2 CREATED IN %d ms: %s%n", end - start, s2);

        checkArgument(equal(s1, s2));

        s1.doStuff();

        start = System.currentTimeMillis();
        SingletonEnum se1 = SingletonEnum.INSTANCE;
        end = System.currentTimeMillis();
        System.out.printf("SINGLETON ENUM 1 CREATED IN %d ms: %s%n", end - start, se1);
        start = System.currentTimeMillis();
        SingletonEnum se2 = SingletonEnum.INSTANCE;
        end = System.currentTimeMillis();
        System.out.printf("SINGLETON ENUM 1 CREATED IN %d ms: %s%n", end - start, se2);

        checkArgument(equal(se1, se2));

        se1.doStuff();

        System.out.println("END MAIN");
    }

}
