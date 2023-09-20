package variablerOppgaver;

import static javax.swing.JOptionPane.*;
public class VarbiablerOppgaver {
    public static void main (String []args){
        String desi1 = showInputDialog("Skriv inn et desimaltall");
        String desi2 = showInputDialog("Skriv inn et desimaltall til");
        String desi3 = showInputDialog("Skriv inn nok et desimaltall");

        double førsteDes = Double.parseDouble(desi1);
        double andreDes = Double.parseDouble(desi2);
        double tredjeDes = Double.parseDouble(desi3);

        double sum = førsteDes+andreDes+tredjeDes;
        double gjennomsnitt = sum/3;
        String gjennomsnittMedToDesimaler =String.format("%.2f", gjennomsnitt);

        showMessageDialog(null, "Gjennomsnittet av tallene er "+ gjennomsnittMedToDesimaler);



    }
}
