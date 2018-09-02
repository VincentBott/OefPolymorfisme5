package com.company;

public class Arbeider extends Werknemer {


    private int urengewerkt;
    int uurloon;
    private String naam;

    public Arbeider(String naam, int urengewerkt, int uurloon) {

        this.naam  = naam;
        this.urengewerkt = urengewerkt;
        this.uurloon = uurloon;
    }

    public void setUrenGewerkt(int urengewerkt) {
        this.urengewerkt = urengewerkt;
    }


    @Override
    public String getNaam() {
        return this.naam;
    }

    @Override
    public int getLoon() {
        return urengewerkt * uurloon;
    }
}
