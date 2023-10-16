package forelesningseksempler;

import javax.swing.*;

public class WhileGjennomsnitt {
    public static void main (String [] args){
        int sum =  0;
        int antall = 0;
        int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0"));

        while (tall>0) {
            sum = sum + tall;
            antall = antall + 1;
            tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall og avlsutt med 0"));
        }

        double gjennomsnitt = (double) sum / (double) antall;
        JOptionPane.showMessageDialog(null, "Summen av tallene er : " + sum);
        JOptionPane.showMessageDialog(null, "Gjennomsnittet av tallene er : " + String.format("%.2f", gjennomsnitt));


    }
}
