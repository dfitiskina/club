package com.company;

import java.lang.String;
import java.util.Objects;


public class Raper implements Human {


    public void listenMusic(String a) {
        if (Objects.equals(a, "rap")) {
            this.dance();
        } else {
            this.drink();
        }

    }

    public void dance() {
        System.out.println("Raper dance");
    }

    public void drink() {
        System.out.println("Rapers drink beer");
    }
}
