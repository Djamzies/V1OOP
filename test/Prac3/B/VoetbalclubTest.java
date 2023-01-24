package Prac3.B;

import Prac2.B.Voetbalclub;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest{

    @Test
    void clubNaamLeegNullWordtFC(){
        Voetbalclub v1 = new Voetbalclub("");

        assertEquals("FC", v1.getNaam());
    }
    @Test
    void puntenTest(){
        Voetbalclub v2 = new Voetbalclub("psv");
        v2.verwerkResultaat('w');
        assertEquals(3, v2.aantalPunten());
        v2.verwerkResultaat('g');
        assertEquals(4, v2.aantalPunten());
        v2.verwerkResultaat('v');
        assertEquals(4, v2.aantalPunten());
        v2.verwerkResultaat('L');
        assertEquals(4, v2.aantalPunten());
    }
    @Test
    void gespeeldeWedstrijdenTest(){
        Voetbalclub aap = new Voetbalclub("aap");
        aap.verwerkResultaat('L');
        assertEquals(0,aap.aantalGespeeld());
    }
    @Test
    void puntenIntoString(){
        Voetbalclub feij = new Voetbalclub("Feijenoord");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');
        assertEquals("Feijenoord 4 3 1 0 10", feij.toString());
    }
    @Test
    void herhaaldelijkVerwerkenTest(){
        Voetbalclub v4 = new Voetbalclub("kutclub");
        v4.verwerkResultaat('w');
        v4.verwerkResultaat('w');
        v4.verwerkResultaat('w');
        v4.verwerkResultaat('w');
        assertEquals(12, v4.aantalPunten());
    }
}