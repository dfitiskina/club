package com.company;

import java.lang.String;
import java.util.Objects;

public class Rocker implements Human {

    public void listenMusic(String a) {
        if (Objects.equals(a, "rock")) {
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
