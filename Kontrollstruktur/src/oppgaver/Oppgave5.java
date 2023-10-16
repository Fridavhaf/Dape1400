/*
Oppgave 5
Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:

Sommer : juni, juli, august
Høst : september, oktober, november
Vinter: desember, januar, februar,
Vår : mars, april, mai,
a) Lag først et program som løser det med if /else

b) Lag deretter et program som løser det med bruk av switch.
 */

package oppgaver;

import javax.swing.*;
import javax.swing.JOptionPane.*;

public class Oppgave5 {

    public static void main (String [] args){
        String måned = JOptionPane.showInputDialog("Skriv inn hvilen måned det er");
        switch (måned){

            case "mars": //NBNB vanlig kolon her
            case "april":
            case "mai":
                JOptionPane.showMessageDialog(null, "Det er vår");
                break;

            case "juni":
            case "juli":
            case "august":
                JOptionPane.showMessageDialog(null, "Det er sommer");
                break;

            case "september":
            case "oktober":
            case "november":
                JOptionPane.showMessageDialog(null, "Det er høst");
                break;

            case "desember":
            case "januar":
            case "februar":
                JOptionPane.showMessageDialog(null, "Det er vinter");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Det er ikke en måned"+"\nNB !" +
                        " Du kan bare ha små bokstaver");
                        break;
        }


    }
}
