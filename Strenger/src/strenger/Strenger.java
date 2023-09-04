package strenger;

import javax.swing.*;

public class Strenger {
    public static void main(String [] args){
        String navn = JOptionPane.showInputDialog("Hva heter du?");
        System.out.print(navn);
        String etternavn = "Bamsemums";
        String adresse = "Seljeveien 37";
        String ut = "\n" + etternavn +"\n"+ adresse;
        System.out.println(ut);

    }
}
//Her har jeg laget et program hvor man kan gi input til programmet gjennom en message box
/*Her er spørsmålet "Hva heter du?" besvart med "Frida von Hafenbrädl
Swing er en gammel funksjon, men det kan gjøre input og output litt mer synlig
nå i opplæringsfasen.
 */


