package variabler2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4 {
    /*
    Endre på programmet i oppgave 3 slik at du sikrer at det skrives inn tall 
    og ikke vanlig tekst i input-boksene. 
    Bruk try og catch for å få dette til. Dersom det ikke skrives inn tall sett input til 0.
    */
    public static void main(String[] args) {
        String innTall1 = showInputDialog("Skriv inn et tall:");
        String innTall2 = showInputDialog("Skriv inn et tall til:");
        String innTall3 = showInputDialog("Skriv inn enda et tall:");
        double tall1, tall2, tall3;
        try {
            tall1 = Double.parseDouble(innTall1);
            tall2 = Double.parseDouble(innTall2);
            tall3 = Double.parseDouble(innTall3);
        }
        catch(Exception e) {
            tall1=0;
            tall2=0;
            tall3=0;
        }
        double sum = tall1 + tall2 + tall3;
        double gjennomsnitt = sum / 3;
        String ut = "Summen av tallene "+tall1+" , "+tall2+" , "+tall3+
                    " er "+sum+"\n"+
                    "Gjennomsnittet av tallene er "+gjennomsnitt;
        System.out.print(ut);
        showMessageDialog(null,ut);
    }
}
