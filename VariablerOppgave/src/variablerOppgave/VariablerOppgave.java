package variablerOppgave;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class VariablerOppgave {
    public static void main(String[] args) {
        String innFornavn = showInputDialog("Skriv inn fornavn");
        String innEtternavn = showInputDialog("Skriv inn etternavn");
        showMessageDialog(null, innFornavn+" er fornavnet"+"\n"+innEtternavn+" "+"er etternavnet");
        String innAlder = showInputDialog("Skriv inn alder");
        showMessageDialog(null, "Alderen til"+" "+innFornavn+" "+innEtternavn+" "+"er"+" "+innAlder+" "+"år");
        String innAdresse = showInputDialog("Skriv inn adresse");
        String innPostnr = showInputDialog("Skriv inn postnummer");
        String innPostadresse = showInputDialog("Skriv inn postadresse");
        String ut = "Navn : "+innFornavn+" "+innEtternavn+"\n"+"Adresse : "+innAdresse
                +"\n"+"Postnummer : "+innPostnr+"\n"+"Poststed : "+innPostadresse+"\n"+"Alder : "+innAlder;
        System.out.println(ut);


    }
}
