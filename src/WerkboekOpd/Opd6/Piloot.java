package WerkboekOpd.Opd6;

public class Piloot {
    private String naam;
    private double salaris;
    private int vlieguren;

    public Piloot(String nm) {
        naam = nm;
    }

    public String getNaam() {
        return naam;
    }
    public double getSalaris() {
        return salaris;
    }
    public int getVlieguren() {
        return vlieguren;
    }

    public void setSalaris(double nwsal) {
        salaris = nwsal;
    }
    public void verhoogVliegurenMet(int nwvu) {
        vlieguren = vlieguren + nwvu;
    }

    public String toString() {
        String s = naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " + salaris;
        return s;
    }
}
