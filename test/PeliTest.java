import kivipaperisakset.Pelaaja;
import org.junit.jupiter.api.Test;
import kivipaperisakset.Peli;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Luokka testaa Peli-luokkaa.
 */
public class PeliTest {

    /**
     * Testaa voittajan tulostamista.
     */
    @Test
    public void testTulostaVoittaja() {
        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();

        p2.voittoLisaa();
        p2.voittoLisaa();
        p2.voittoLisaa();

        assertEquals("Voittaja on pelaaja 2!\n", Peli.tulostaVoittaja(p1));

    }
}
