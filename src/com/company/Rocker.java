package com.company;

import java.lang.String;
import java.util.Objects;

public class Rocker implements Human {

    public void listenMusic(String enteredType) {
        if (Objects.equals(enteredType, "rock")) {
            this.dance();
        } else {
            this.drink();
        }
    }

    public void dance() {
        System.out.println("Rockers dance");

    }

    public void drink() {
        System.out.println("Rockers drink vodka");
    }
}
