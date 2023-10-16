package forelesningseksempler;

//Programmet skal lese inn positive heltall og summere disse. Dersom det skrives inn et
// negativt tall, eller null, skal innlesningen av tall avsluttes og summen vises.
// Det skal brukes dialogbokser for å lese tallene inn og vise summen.

import javax.swing.*;

public class While {
    public static void main (String [] args){
        int sum = 0;
        int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med null"));

        while (tall > 0){
            sum = sum + tall;
            tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med null"));
        }
        JOptionPane.showMessageDialog(null, "Summen er "+sum);
    }

}
