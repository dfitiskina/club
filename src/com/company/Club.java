package com.company;

import java.util.*;
import java.lang.String;
import java.lang.*;

public class Club {
    private static int count = 0;
    private static List<Human> dancers = new ArrayList<>();

    public static void main(String[] args) {
        Club club = new Club();

        Human rocker = new Rocker();
        Human raper = new Raper();
        Human dancer = new Dancer();

        dancers = Arrays.asList(rocker, raper, dancer);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы хотите изменить музыку? (1/0)");
        int answer;
        answer = scanner.nextInt();

        if (answer == 0) {
            System.out.println("Ожидайте автоматической смены композиции");
            club.setRandom(5, club);
        } else if (answer == 1) {
            scanner.nextLine();

            while (true) {
                System.out.println("Выберите жанр композиции или завершите программу (rock,rap,pop,exit,rand)");
                String musicChange = scanner.nextLine();
                club.switchMusic(musicChange,dancers);
            }
        } else {
            System.out.println("Введен неверный ответ 1");
            scanner.close();
            System.exit(0);
        }
    }

    private void setRandom(int a, Club club) {
        Timer timer = new Timer();
        TimerTask tt = new TimerTask() {

            @Override
            public void run() {
                ArrayList<String> musicTypes = new ArrayList<>();
                Random rand = new Random();
                musicTypes.add("rock");
                musicTypes.add("rap");
                musicTypes.add("pop");

                String types = musicTypes.get(rand.nextInt(musicTypes.size()));
                club.switchMusic(types, dancers);

                count++;
                if (count >= a) {
                    timer.cancel();
                    count = 0;
                }
            }
        };

        timer.schedule(tt, 0, 5000);
    }

    private void switchMusic(String musicChange, List<Human> dancers) {
        switch (musicChange) {
            case "rock":
                System.out.println("Now play Rock");
                dancers.forEach(Human::dance);
                break;
            case "rap":
                System.out.println("Now play Rap");
                dancers.forEach(Human::dance);
                break;
            case "pop":
                System.out.println("Now play Pop");
                dancers.forEach(Human::dance);
                break;
            case "rand":
                this.setRandom(1, this);
                break;
            case "exit":
                System.exit(0);
            default:
                System.out.println("Введен неверный ответ");
                break;
        }
    }
}

