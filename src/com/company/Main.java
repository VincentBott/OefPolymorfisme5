package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Werknemer> werknemers = new ArrayList<>();

        int urengewerkt = 168;
        int uurloon = 17;

        Arbeider joske = new Arbeider("Joske", urengewerkt, uurloon);

        werknemers.add(joske);

        Arbeider lewieke = new Arbeider("Lewieke", urengewerkt, uurloon);

        werknemers.add(lewieke);

        lewieke.setUrenGewerkt(172);

        int maandloon = 3500;

        Bediende marieke = new Bediende("Marieke", maandloon);

        werknemers.add(marieke);

        Bediende sky = new Bediende("Sky", maandloon);
        werknemers.add(sky);

        sky.setMaandloon(3000);

        for(Werknemer w: werknemers){
            System.out.printf("%s verdient %d EURO%n", w.getNaam(), w.getLoon());
        }

        int totaalloon = getMaandloon(werknemers);

        System.out.println("Het totale loon bedraagt " + totaalloon);

    }

    private static int getMaandloon(List<Werknemer> werknemers) {

        int maandloon = 0;

        for(Werknemer werknemer : werknemers) {

            maandloon = maandloon + werknemer.getLoon();

        }
        return maandloon;
    }

}

