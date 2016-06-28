package com.malsolo.design.patterns.creational.builder;

import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    private final String firstname, surname, email;

    private final LocalDate birthDate;

    private final Sex gender;

    private Person(Builder builder) {
        this.firstname = builder.firstname;
        this.surname = builder.surname;
        this.email = builder.email;
        this.birthDate = builder.birthDate;
        this.gender = builder.gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Sex getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person [firstname=" + firstname + ", surname=" + surname + ", email=" + email + ", birthDate=" + birthDate + ", gender="
                + gender + "]";
    }

    public static class Builder {

        private String firstname, surname, email;

        private LocalDate birthDate;

        Sex gender;

        public Builder() {
        }

        public Person build() {
            return new Person(this);
        }

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder gender(Sex gender) {
            this.gender = gender;
            return this;
        }

    }

}
