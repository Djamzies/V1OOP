package Prac4.B;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AutoHuurTest {

    AutoHuur ah1 = new AutoHuur();
    Klant k = new Klant("Mijnheer de Vries");
    Auto a1 = new Auto("Peugeot 207", 50);

    @Test
    void huurderZonderAuto(){
        ah1.setHuurder(k);
        System.out.println(ah1);
        assertEquals("er is geen auto bekend\nop naam van: Mijnheer de Vries (korting: 0.0%)\naantal dagen: 0 en dat kost 0.0", ah1);
    }

    @Test
    void zonderHuurderZonderAuto(){
        System.out.println(ah1);
    }

    @Test
    void autoZonderHuurder(){
        ah1.setGehuurdeAuto(a1);
        System.out.println(ah1);



    }

    @Test
    void zonderAantalDagen(){

    }

    @Test
    void autoHuurSetter(){

    }

    @Test
    void aantalDagenSetter(){

    }

    @Test
    void totaalPrijsCheck(){

    }
}
