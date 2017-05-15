package com.company;

import java.util.*;
import java.lang.String;
import java.lang.*;

class Club {
    private static int period = 7000;
    private static int count = 0;
    private List<Human> dancers = new ArrayList<>();

    //public static List<Human> getDancers() {
    //  return dancers;
    //}

    void setDancers(List<Human> temp) {
        this.dancers = temp;
    }


    void setRandom(int numberOfRepeat) {
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
                switchMusic(types);

                count++;
                if (count >= numberOfRepeat) {
                    timer.cancel();
                    count = 0;
                }
            }
        };

        timer.schedule(tt, 0, period);
    }

    void switchMusic(String musicChange) {
        switch (musicChange) {
            case "rock":
                System.out.println("Now play Rock");
                dancers.forEach(human -> human.listenMusic(musicChange));
                break;
            case "rap":
                System.out.println("Now play Rap");
                dancers.forEach(human -> human.listenMusic(musicChange));
                break;
            case "pop":
                System.out.println("Now play Pop");
                dancers.forEach(human -> human.listenMusic(musicChange));
                break;
            case "rand":
                this.setRandom(1);
                break;
            case "exit":
                System.exit(0);
            default:
                System.out.println("Введен неверный ответ");
                break;
        }
    }
}
