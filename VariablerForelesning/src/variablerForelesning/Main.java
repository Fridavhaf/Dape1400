package variablerForelesning;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String [] args){
        String navn, adresse;
        navn = "Mari Noteland";
        adresse = "Blindern 2";
        String postAdresse = "Oslo";
        String postNr = "0575";
        System.out.println("Navnet er "+navn);
        System.out.println("Adressen er"+" "+adresse+" "+postNr+" "+postAdresse);

        String innNavn = showInputDialog("skriv inn navnet");
        String innAdresse = showInputDialog("Skriv inn adressen");
        String innPostNr = showInputDialog("Skriv inn postnr");
        String innPostAdressen = showInputDialog("Skriv inn postadressen");
        showMessageDialog(null, innNavn+" har adressen"+innAdresse);

        String ut = "Navnet : "+innNavn+"\n"+"Adressen er :"+innAdresse+" "+innPostNr+" "+innPostAdressen;
        showInputDialog(null, ut);

    }
}
