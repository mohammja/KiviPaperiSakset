package kivipaperisakset;

/**
 * Luokka edustaa yhtä pelaajaa Kivi-Paperi-Sakset -pelissä.
 */
public class Pelaaja {

    private int voitot; // Voittojen lukumäärä

    /**
     * Valitsee randomilla kivi, paperi tai sakset.
     *
     * @return Pelaajan valinta (kivi, paperi tai sakset).
     */
    public String pelaajanValinta() {
        String valinta = "";
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0:
                valinta = "kivi";
                break;
            case 1:
                valinta = "paperi";
                break;
            case 2:
                valinta = "sakset";
                break;
        }
        return valinta;
    }

    /**
     * Lisää voiton pelaajalle.
     */
    public void voittoLisaa() {
        voitot++;
    }

    /**
     * Palauttaa pelaajan voittojen lukumäärän.
     *
     * @return Pelaajan voittojen lukumäärä.
     */
    public int getVoitot() {
        return voitot;
    }
}
