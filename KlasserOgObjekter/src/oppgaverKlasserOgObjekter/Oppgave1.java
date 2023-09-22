
import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showMessageDialog;

class Bøker {
    String tittel;
    double pris;
    String forfatter;
    String iBSN_nummer;

    // Lag en metode for å vise informasjon om boken
    void visInfo() {
        String ut = "Tittel: "+tittel+" Prisen er: "+pris+" Forfatter er: "+forfatter+
                " iSBN-nummer er: "+iBSN_nummer;
        showMessageDialog(null, ut);
    }
}

public class Oppgave1 {
    public static void main(String[] args) {
        Bøker nyBok = new Bøker();
        String forfatter = showInputDialog("Skriv inn forfatter");
        String tittel = showInputDialog("Skriv inn tittel");
        String innPris = showInputDialog("Skriv inn pris");
        String nummer = showInputDialog("Skriv inn iBSN-nummer");
        double pris = Double.parseDouble(innPris);
        nyBok.forfatter = forfatter;
        nyBok.tittel = tittel;
        nyBok.pris = pris;
        nyBok.iBSN_nummer = nummer;
        nyBok.visInfo();
    }}

/*
        // Parse the price (as a String) to a double
        try {
            nyBok.pris = Double.parseDouble(showInputDialog("Skriv inn pris på boken"));
        } catch (NumberFormatException e) {
            showMessageDialog(null, "Ugyldig pris. Bruk et gyldig tall.");
            return; // Exit the program
        }

        nyBok.forfatter = showInputDialog("Skriv inn forfatterens navn");

        // Parse the ISBN (as a String) to an int
        try {
            nyBok.isBN = Integer.parseInt(showInputDialog("Skriv inn et fire-sifret nummer (ISBN)"));
        } catch (NumberFormatException e) {
            showMessageDialog(null, "Ugyldig ISBN. Bruk et gyldig fire-sifret nummer.");
            return; // Exit the program
        }

        nyBok.visInfo();
    }
}*/