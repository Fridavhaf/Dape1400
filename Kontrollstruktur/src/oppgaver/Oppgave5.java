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

/*
import javax.swing.*;

public class Oppgave5 {
    public static void main (String []args){
        String måned = JOptionPane.showInputDialog("Skriv inn hvilken måned det er");

        if (måned.equals("juni") || måned.equals("juli") || måned.equals("august")){
            JOptionPane.showMessageDialog(null, "Det er sommer");
        }

        if (måned.equals("september") || måned.equals("oktober") || måned.equals("november")){
            JOptionPane.showMessageDialog(null, "Det er høst");
        }

        if (måned.equals("desember") || måned.equals("januar") || måned.equals("februar")){
            JOptionPane.showMessageDialog(null, "Det er vinter");
        }
        if (måned.equals("mars") || måned.equals("april") || måned.equals("mai")){
            JOptionPane.showMessageDialog(null, "Det er vår");
        }
    }
}
*/

import javax.swing.*;
import javax.swing.JOptionPane.*;

public class Oppgave5 {

    public static void main (String [] args){
        String måned = JOptionPane.showInputDialog("Skriv inn hvilen måned det er");
        switch (måned){
            case "januar": //NBNB kolon her
                JOptionPane.showMessageDialog(null, "Det er vinter");
                break;

            case "februar":
                JOptionPane.showMessageDialog(null, "Det er vinter");
                break;

            case "mars":
                JOptionPane.showMessageDialog(null, "Det er vår");
                break;

            case "april":
                JOptionPane.showMessageDialog(null, "Det er vår");
                break;

            case "mai":
                JOptionPane.showMessageDialog(null, "Det er vår");
                break;

            case "juni":
                JOptionPane.showMessageDialog(null, "Det er sommer");
                break;

            case "juli":
                JOptionPane.showMessageDialog(null, "Det er sommer");
                break;

            case "august":
                JOptionPane.showMessageDialog(null, "Det er sommer");
                break;

            case "september":
                JOptionPane.showMessageDialog(null, "Det er høst");
                break;

            case "oktober":
                JOptionPane.showMessageDialog(null, "Det er høst");
                break;

            case "november":
                JOptionPane.showMessageDialog(null, "Det er høst");
                break;

            case "desember":
                JOptionPane.showMessageDialog(null, "Det er vinter");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Det er ikke en måned"+"\nNB ! Du kan bare ha små bokstaver");
                        break;
        }


    }
}
