package Prac2.A;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {
    private Zwembad z;

//    @BeforeEach
//    public void init() {
//        System.out.println("INIT");
//        z = new Zwembad(50, 50, 50);
//    }

    @Test
    void testBerekendeInhoudFout() {
        System.out.println("testBerekendeInhoudFout");
        z = new Zwembad(2, 5, 1.5);
        assertEquals(14, z.inhoud(), "berekening van inhoud klopt niet");
    }

    @Test
    void testBerekendeInhoud() {
        System.out.println("testBerekendeInhoud");
        z = new Zwembad(2, 5, 1.5);
        assertEquals(15, z.inhoud(), "berekening van inhoud klopt niet");
    }
}