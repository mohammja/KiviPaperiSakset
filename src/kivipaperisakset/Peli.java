package kivipaperisakset;

/**
 * Luokka edustaa Kivi-Paperi-Sakset -pelin pääohjelmaa.
 */
public class Peli {

    /**
     * Pääohjelma suorittaa Kivi-Paperi-Sakset -pelin.
     *
     * @param args Komentoriviparametrit (ei käytössä).
     */
    public static void main(String args[]) {
        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();
        boolean peliLoppui = false;
        int pelatutPelit = 0;           // Pelattujen pelien lkm
        int tasapelit = 0;              // Tasapelien lkm

        do {
            System.out.println("Erä: " + pelatutPelit + " =====================\n");
            System.out.println("Tasapelien lukumäärä: " + tasapelit + "\n");

            String p1Valinta = p1.pelaajanValinta();
            String p2Valinta = p2.pelaajanValinta();

            System.out.println("Pelaaja 1: " + p1Valinta + "\n\t Pelaaja 1:llä koossa " + p1.getVoitot() + " voittoa.");
            System.out.println("Pelaaja 2: " + p2Valinta + "\n\t Pelaaja 2:lla koossa " + p2.getVoitot() + " voittoa.");

            if (p1Valinta.equals(p2Valinta)) {
                tasapelit++;
                System.out.println("\n\t\t\t Tasapeli \n");
            } else if ((p1Valinta.equals("kivi") && p2Valinta.equals("sakset")) ||
                    (p1Valinta.equals("paperi") && p2Valinta.equals("kivi")) ||
                    (p1Valinta.equals("sakset") && p2Valinta.equals("paperi"))) {
                p1.voittoLisaa();
                System.out.println("Pelaaja 1 voittaa");
            } else {
                p2.voittoLisaa();
                System.out.println("Pelaaja 2 voittaa");
            }

            pelatutPelit++;

            if (p1.getVoitot() == 3 || p2.getVoitot() == 3) {
                peliLoppui = true;
                System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
                tulostaVoittaja(p1.getVoitot() == 3 ? p1 : p2);
            }

            System.out.println();
        } while (!peliLoppui);
    }

    /**
     * Tulostaa voittajan.
     *
     * @param voittaja Voittajapelaaja.
     */
    public static String tulostaVoittaja(Pelaaja voittaja) {
        System.out.println("Voittaja on pelaaja " + (voittaja.getVoitot() == 3 ? "1" : "2") + "!\n");
        return "Voittaja on pelaaja " + (voittaja.getVoitot() == 3 ? "1" : "2") + "!\n";
    }
}
