package com.malsolo.design.patterns.structural.composite;

/**
 * @see http://www.oodesign.com/composite-pattern.html
 * @see http://www.avajava.com/tutorials/lessons/composite-pattern.html
 * @author jbeneito
 *
 */
public class CompositeDemo {

    public static void main(String[] args) {

        Menu mainMenu = new Menu("Main", "/main");

        MenuItem administrationMenuItem = new MenuItem("Administration", "/admin");

        mainMenu.add(administrationMenuItem);

        Menu configurationSubMenu = new Menu("Configuration", "/conf");

        MenuItem usersMenuItem = new MenuItem("Users", "/users");

        configurationSubMenu.add(usersMenuItem);

        mainMenu.add(configurationSubMenu);

        System.out.println(mainMenu.print());

    }

}
