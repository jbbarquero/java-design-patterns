package com.malsolo.design.patterns.creational.singleton;

import static com.google.common.base.Objects.equal;
import static com.google.common.base.Preconditions.checkArgument;

public class SingletonDemo {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);

        checkArgument(equal(s1, s2));
        
        s1.doStuff();

        SingletonEnum se1 = SingletonEnum.INSTANCE;
        System.out.println(se1);
        SingletonEnum se2 = SingletonEnum.INSTANCE;
        System.out.println(se2);

        checkArgument(equal(se1, se2));
        
        se1.doStuff();

    }

}
