import kivipaperisakset.Pelaaja;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Luokka testaa Pelaaja-luokkaa.
 */
public class PelaajaTest {

    /**
     * Testaa pelaajan valinnan.
     */
    @Test
    public void testPelaajanValinta() {
        Pelaaja pelaaja = new Pelaaja();
        String valinta = pelaaja.pelaajanValinta();
        assertNotNull(valinta);
        assertTrue(valinta.equals("kivi") || valinta.equals("paperi") || valinta.equals("sakset"));
    }

    /**
     * Testaa voiton lisäämistä.
     */
    @Test
    public void testVoittoLisaa() {
        Pelaaja pelaaja = new Pelaaja();
        assertEquals(0, pelaaja.getVoitot());
        pelaaja.voittoLisaa();
        assertEquals(1, pelaaja.getVoitot());
    }
}
