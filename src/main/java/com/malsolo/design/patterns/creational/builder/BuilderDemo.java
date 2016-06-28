package com.malsolo.design.patterns.creational.builder;

import java.time.LocalDate;

public class BuilderDemo {

    public static void main(String[] args) {
        Person.Builder builder = new Person.Builder();

        // @formatter:off
        Person me = builder
                .firstname("Javier").surname("Beneito Barquero")
                .email("jbbarquero@gmail.com")
                .gender(Person.Sex.MALE)
                .birthDate(LocalDate.of(1973, 8, 12))
                .build();
        // @formatter:on

        System.out.println(me.toString());
    }

}
