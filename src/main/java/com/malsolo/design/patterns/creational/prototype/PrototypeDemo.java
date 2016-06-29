package com.malsolo.design.patterns.creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("My movie");

        System.out.println(movie);

        Movie film = (Movie) registry.createItem("Movie");
        film.setTitle("Your movie");

        System.out.println(film);

    }

}
