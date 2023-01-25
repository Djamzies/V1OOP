package WerkboekOpd.Opd13;

import Prac4.A.Huis;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        ArrayList<Huisdier> lijst = new ArrayList<Huisdier>();
        Huisdier h1 = new Huisdier("Henk", "kat", 2.5);
        Huisdier h2 = new Huisdier("Willem", "parkiet", 0.5);

        lijst.add(h1);
        lijst.add(h2);
        lijst.add(new Huisdier("Pieter", "goudvis", 0.1));

        int aantal = lijst.size();
        System.out.println("Er zitten " + aantal + " huisdieren in deze lijst.");

        for (Huisdier item : lijst) {
            System.out.println(item);
        }

        lijst.add(0, new Huisdier("Karel", "baviaan", 3.4));

        lijst.set(2, new Huisdier("Gerard", "Walvis", 572.2));

        for (Huisdier item : lijst) {
            System.out.println(item);
        }
    }

}
