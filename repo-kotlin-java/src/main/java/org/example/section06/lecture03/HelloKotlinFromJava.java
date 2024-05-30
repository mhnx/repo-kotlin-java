package org.example.section06.lecture03;

import org.example.section05.lecture05.MaxKt;

public class HelloKotlinFromJava {

    public static void main(String[] args) {

        Person bob = new Person("Robert", "Martin");

        System.out.println("His name is " + bob.getFirstName());

        bob.setFirstName("Uncle Bob");

        System.out.println("Now his name is " + bob.getFirstName());

        Integer maxInt = MaxKt.max(2001, 2022);

        System.out.println("The max value is " + maxInt);

    }
}
