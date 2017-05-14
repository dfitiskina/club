package com.company;

import java.lang.String;
import java.util.Objects;

public class Dancer implements Human {
    public void listenMusic(String a) {
        if (Objects.equals(a, "pop")) {
            this.dance();
        } else {
            this.drink();
        }
    }

    public void dance() {
        System.out.println("Dancer dance");
    }

    public void drink() {
        System.out.println("Dancer drink rum");
    }
}