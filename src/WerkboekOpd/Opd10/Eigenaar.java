package WerkboekOpd.Opd10;

import Prac4.A.Huis;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje;
    public Eigenaar(String nm) {
        naam = nm;
    }

    public void setBeestje(Huisdier b) {
        beestje = b;
    }
    public Huisdier getBeestje() {
        return beestje;
    }

    public void setGiroNr(int nr) { giroNr = nr; }
    public int getGiroNr() { return giroNr; }
    public String getNaam() { return naam; }
    public String toString() {
        return naam + " heeft giro " + giroNr + ". En is het baasje van " + beestje;
    }
}
