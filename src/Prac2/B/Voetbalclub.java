package Prac2.B;

public class Voetbalclub {
    private String clubnaam;

    public Voetbalclub(String club) {
        clubnaam = club;
    }

    private Integer aantalGewonnen = 0;
    private Integer aantalGelijk = 0;
    private Integer aantalVerloren = 0;

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public Integer aantalPunten() {
        Integer x = (aantalGewonnen * 3) + (aantalGelijk);
        return x;
    }

    public Integer aantalGespeeld() {
        Integer x = aantalGewonnen + aantalGelijk + aantalVerloren;
        return x;
    }

    public String toString() {
        String x = clubnaam + ' ' + aantalGespeeld() + ' ' + aantalGewonnen + ' ' + aantalGelijk + ' ' + aantalVerloren + ' ' + aantalPunten();
        return x;
    }
}