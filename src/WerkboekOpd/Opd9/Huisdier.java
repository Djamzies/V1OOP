package WerkboekOpd.Opd9;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar mijnEigenaar;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }

    public void setBaasje(Eigenaar e) {
        mijnEigenaar = e;
    }
    public Eigenaar getMijnEigenaar() {
        return mijnEigenaar;
    }

    public String getNaam() { return naam; }
    public String getRas() { return ras; }
    public String toString() {
        return naam + ", de " + ras + ", weegt " + gewicht + " kg. \nEn de eigenaar is: " + mijnEigenaar;
    }
}
