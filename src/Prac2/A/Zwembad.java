package Prac2.A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(){

    }
    public Zwembad(double bd, double lt, double dt){
        breedte = bd;
        lengte = lt;
        diepte = dt;
    }

    public double getBreedte() {
        return breedte; }
    public double getLengte() {
        return lengte;  }
    public double getDiepte() {
        return diepte;  }

    public double inhoud() {
        double s = breedte * lengte * diepte;
        return s;
    }

    public void setBreedte(double nwBreedte) {
        breedte = nwBreedte;
    }
    public void setLengte(double nwLengte) {
        lengte = nwLengte;
    }
    public void setDiepte(double nwDiepte) {
        diepte = nwDiepte;
    }

    public String toString() {
        String x = "Dit zwembad is " + breedte + " breed, " + lengte + " meter lang, en " + diepte + " meter diep.";
        return x;
    }
}
