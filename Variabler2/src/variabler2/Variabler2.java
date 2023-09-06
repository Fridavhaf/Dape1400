package variabler2;

import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class Variabler2 {
    public static void main (String [] args){


    String desi1 = showInputDialog("skriv et desimaltall");
    String desi2 = showInputDialog("Skriv et desimaltall til");
    String desi3 = showInputDialog("Skriv nok et deismaltall");
    double des1 = Double.parseDouble(desi1);
    double des2 = Double.parseDouble(desi2);
    double des3 = Double.parseDouble(desi3);
    double sum= des1+des2+des3;
    showMessageDialog(null, "summen av de tre desimaltallene, er "+sum);

    double gjennomsnitt = des1+des2+des3/3;
    showMessageDialog(null, "Gjennomsnittet av desimaltallene er "+gjennomsnitt);
    }
}