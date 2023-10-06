/*
Levert av gruppe 102
Eda Gulcan: 385395
Frida von Hafenbrädl: 385353
*/

package oppgave2;

import javax.swing.*;

public class Oblig1Oppgave2 {
    public static void main(String[] args) {
        //Siden vi skal ha input via bokser så må vi sette opp dette først

        //Først setter vi inn data via input-bokser for vare 1:
        String navn1 = JOptionPane.showInputDialog("Skriv inn varens navn");
        String innAntall1 = JOptionPane.showInputDialog("Skriv inn antall varer");

        /*Siden antall må være på desimalform, skal vi prøve å konvertere strengen til en desimal via try.
        Vi setter også inn en catch, som kjøres dersom input ikke er mulig å konvertere.
        Dette skjer for eksempel hvis det settes inn bokstaver eller tegn i input-boksen*/

        int antall1;
        try {
            antall1 = Integer.parseInt(innAntall1);
        } catch (Exception e) {
            antall1 = 0;
            JOptionPane.showMessageDialog(null,"Dette er ikke et heltall," +
                    "\nAntall er satt til 0");
        }
        //Dersom catch kjøres settes antall til 0 og det vil komme en meldingsboks om at dette skjer.


        //Videre oppretter vi en input-boks for pris

        String innPris1 = JOptionPane.showInputDialog("Skriv inn prisen på varen");
        //Vi prøver å konvertere innPris1 til en double pris1, hvis ikke det går setter catch prisen til null
        double pris1;
        try {
                pris1 = Double.parseDouble(innPris1);
            } catch (Exception e) {
                pris1 = 0;
                JOptionPane.showMessageDialog(null, "Dette er ikke et tall"+
                        "\nPrisen er satt til null");
               }


        //Så gjør vi det samme for vare 2:
        String navn2 = JOptionPane.showInputDialog("Skriv inn navnet på en annen vare");
        String innAntall2 = JOptionPane.showInputDialog("Skriv inn antall av denne varen");
        int antall2;
        try{
            antall2 = Integer.parseInt(innAntall2);
        } catch (Exception e){
            antall2 = 0;
            JOptionPane.showMessageDialog(null, "Dette er ikke et heltall \nAntall er satt til null");
        }
        String innPris2 = JOptionPane.showInputDialog("Skriv inn prisen på varen");
        double pris2;
        try{
            pris2 = Double.parseDouble(innPris2);
        } catch (Exception e){
            pris2 = 0;
            JOptionPane.showMessageDialog(null, "Dette er ikke et tall\nPris er satt til null");
        }

        /*Vi oppretter to objekter, vare1 og vare2. Nå kalles det på konstruktøren, og vi må sette inn attributter
        Disse attributtene er allerede definert via input-boksene*/


        Vare vare1 = new Vare(navn1, antall1, pris1);
        Vare vare2 = new Vare(navn2, antall2, pris2);



        /*Videre oppretter vi variabel totalPris av typen double.
        Så henter vi metoden beregnTotalpris fra "public class Vare".
        Denne metoden bruker vi for å beregne vare1 sin totalpris og vare2 sin totalpris*/

        double totalPris = (vare1.beregnTotalpris()) + (vare2.beregnTotalpris());
        //Her blir totalprisen for vare1 og vare2 addert sammen, siden vi vil finne totalprisen av begge varene

        String totalPrisMedToDesimaler = String.format("%.1f", totalPris);
        //Det kan være greit å sette en restriksjon på to desimaler når det er snakk om pris

        System.out.println("Totalprisen ble : " + totalPrisMedToDesimaler + " kr.");
        //Den siste koden kjører ut totalprisen for begge varene basert på pris og antall for hver av de.

        }
    }

