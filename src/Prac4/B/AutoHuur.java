package Prac4.B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;
    private double korting;
    private double prijs;

    public AutoHuur() {
    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gh) {
        gehuurdeAuto = gh;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        if (gehuurdeAuto != null) {
            prijs = aantalDagen * gehuurdeAuto.getPrijsPerDag();
            if (huurder != null) {
                korting = (100 - huurder.getKorting()) /100;
            } else {
                korting = 1;
            }
            return prijs * korting;
        } else {
            return 0.0;
        }
    }

    public String toString() {
        if (gehuurdeAuto == null) {
            if (huurder == null) {
                return "er is geen auto bekend\ner is geen huurder bekend\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
            } else {
                return "er is geen auto bekend\n" + huurder.toString() + "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
            }
        } else {
            if (huurder == null) {
                return gehuurdeAuto.toString() + "\ner is geen huurder bekend\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
            } else {
                return gehuurdeAuto.toString() + "\n" + huurder.toString() + "\naantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
            }
        }
    }
}