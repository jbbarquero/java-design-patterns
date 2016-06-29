package com.malsolo.design.patterns.creational.prototype;

import java.util.HashMap;

public class Registry {

    private HashMap<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item) items.get(type + "1").clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie starWars = new Movie();
        starWars.setTitle("Star Wars. Episode IV: a new hope.");
        starWars.setYear(1977);
        starWars.setPrice(1.0);
        items.put("Movie1", starWars);

        Book warAndPeace = new Book();
        warAndPeace.setTitle("War and Peace");
        warAndPeace.setIsbn("9783538065437");
        warAndPeace.setPrice(2.0);
        items.put("Book1", warAndPeace);

    }

}
