package WerkboekOpd.Opd13;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    public Huisdier(String nm, String r, double v) {
        naam = nm;
        ras = r;
        gewicht = v;
    }
    public String getNaam() { return naam; }
    public String getRas() { return ras; }
    public String toString() {
        return naam + ", de " + ras + ", weegt " + gewicht + " kg.";
    }
}
