package variablerOppgaver;

import static javax.swing.JOptionPane.showInputDialog;

import static javax.swing.JOptionPane.*;
public class Oppgave4 {
    public static void main(String[] args) {
        String desi1 = showInputDialog("Skriv inn et desimaltall");
        String desi2 = showInputDialog("Skriv inn et desimaltall til");
        String desi3 = showInputDialog("Skriv inn nok et desimaltall");
        double tall1, tall2, tall3; //vi definerer først tallene som desimaltall

        try{
            tall1=Double.parseDouble(desi1); //Vi forsøker å konvertere inntall til desimaltall
            tall2=Double.parseDouble(desi2);
            tall3 = Double.parseDouble(desi3);
        } //hvis en av disse feiler, så setter vi en catch:
        catch (Exception e){
            tall1 = 0;
            tall2 = 0;
            tall3 = 0; //Alle blir satt til 0 dersom én feiler. Vi kunne evt. tatt en try/catch om gangen.
        }
        double sum = tall1+tall2+tall3;
        double gjennomsnitt = sum/3;
        String gjennomsnittMedToDesimaler =String.format("%.2f", gjennomsnitt);

        showMessageDialog(null, "Gjennomsnittet av tallene er "+ gjennomsnittMedToDesimaler);

    }

}