/*
Oppgave 2
Les inn en heltallsvariabel "alder".
Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende :

”Du kan ta førerkortet for bil da du er gammel nok” eller
”Du er for ung til å ta førerkort for bil”.

Gjør dette uten bruk av en else-setning (bruk to if-setninger).
 */

/*
Oppgave 3
Gjør oppgave 2 ved hjelp av en else-setning (i tillegg til en if).
 */

/*
Oppgave 4
Definer så en variabel som indikerer høyeste alder man kan ta førerkort uten årlig legesjekk (= 70 år). Oppdater oppgavene over slik at programmet skriver
ut meldingene

Du er for ung til å ta førerkort for bil
Du kan ta førerkort for bil og du trenger ikke årlige legesjekker
Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker
 */

package oppgaver;

import javax.swing.*;

public class Oppgave2_3_4 {
    public static void main (String []args){
        int alder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alderen din :"));

        if (alder < 18){
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }
        else if (alder >= 18 && alder<70){
            JOptionPane.showMessageDialog(null, "Du kan ta førerkort for bil og du trenger ikke årlige legesjekker");
        }
        else{
            JOptionPane.showMessageDialog(null, "Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
        }
    }
}
