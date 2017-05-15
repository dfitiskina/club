package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Club club = new Club();

        Human rocker = new Rocker();
        Human raper = new Raper();
        Human dancer = new Dancer();

        club.setDancers(Arrays.asList(rocker, raper, dancer));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы хотите изменить музыку? (1/0)");
        int answer;
        answer = scanner.nextInt();

        if (answer == 0) {
            System.out.println("Ожидайте автоматической смены композиции");
            club.setRandom(5);
        } else if (answer == 1) {
            scanner.nextLine();

            while (true) {
                System.out.println("Выберите жанр композиции или завершите программу (rock,rap,pop,exit,rand)");
                String musicChange = scanner.nextLine();
                club.switchMusic(musicChange);
            }
        } else {
            System.out.println("Введен неверный ответ");
            scanner.close();
            System.exit(0);
        }
    }
}
