package oppgave1;
/*
### Oppgave 1

Lag et program som beregner og skriver ut summen av alle tall mellom to grenser som brukeren skriver inn.
Programmet skal starte med å lese inn nedre og øvre grense for summen. Dersom innlest øvre grense er mindre
enn eller lik nedre grense, skal programmet skrive ut en melding til brukeren om dette og foreta ny innlesing.

Når godkjente grenser er lest inn, skal programmet beregne nevnte sum og summen skal så skrive den ut som en
sum. Hvis f. eks. nedre grense er 2 og øvre grense er 8 skal det skrives ut følgende tekst:
"2 + 3 + 4 + 5 + 6 + 7 + 8 = 35".

Test ut programmet med nedre grense lik 1 og øvre grense lik 100. Legg inn et linjeskift for hvert 10.
tall i summen.
 */

import javax.swing.*;
public class Oppgave1 {
    public static void main (String [] args){

        //Oppretter 2 innlesningsbokser som konverter input til heltall
        int nedreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn nedre grense for tall som skal summeres"));
        int øvreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn øvre grense for tall som skal summeres"));

        /*Hvis øvre grense er mindre enn eller lik den nedre grensen, kommer dette i en meldingsboks,
        og tallet må endres.
        */
        if (øvreGrense <= nedreGrense){
            JOptionPane.showMessageDialog(null, "Den øvre grensen er mindre eller lik den nedre grensen"+
                    "\nVennligst skriv inn et tall som er høyere enn den nedre grensen");

            øvreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn øvre grense for tall som skal summeres"));
            /*Det gis en ny sjanse for å skrive inn riktig data. Hvis det skrives feil her og, avsluttes programmet
            og summen settes til null.
            Vi trenger ikke definere øvreGrense som en double igjen, det er allerede fastsatt.*/
        }

        //Jeg setter int sum til 0. For hver runde i løkken skal de forskjellige verdiene av i adderes til denne summen.
        int sum = 0;
        int antall = 0;
        for (int i = nedreGrense; i <= øvreGrense; i++){
            sum += i;
            antall++;

//Vi vil printe hver verdi av i for å få printet ut tallrekken
            System.out.print(i);
//Hvis tallet ikke er det siste i rekken, vil jeg ha et etterfølgende plusstegn

            if (antall>10){
                System.out.print("\n");
                antall=0;
            }

            if (i < øvreGrense){
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + sum);


    }
}
