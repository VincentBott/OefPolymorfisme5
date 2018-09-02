package com.company;

public class Bediende extends Werknemer {

    private String naam;
    private int maandloon;

    public Bediende(String naam, int maandloon) {

        this.naam = naam;
        this.maandloon = maandloon;
    }

    public void setMaandloon(int maandloon) {
        this.maandloon = maandloon;
    }

    public String getNaam() {

        return this.naam;
    }

    @Override
    public int getLoon() {
        return maandloon;
    }

}
