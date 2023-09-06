package avvikshandtering;

import javax.swing.*;
public class Avvikshandtering {
    public static void main (String []args){
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et heltall");
        int tall;
        try {
            tall = Integer.parseInt(innStreng1); /*Gjør om input til heltall, definere som heltall*/
        }
        catch (Exception e){
            tall = 0;
            System.out.println(e);
}       System.out.println("Tallet er "+tall);

        //Hvis vi ikke skriver inn et tall, men f.eks. random tekst vil programmet feile
        //Hvordan håndtere feilmelding?

        //Vi kan f eks prøve try/catch. Vi kan først prøve try. Vi må definere int før try
        //Hvis ikke try funker må vi ha en catch, feks. tall=0 ved error eller vi kan printe
       //feimeldingen med System.out.println(e);
       /*java.lang.NumberFormatException: For input string: "fje"
        Tallet er 0 * - den øverste meldingen er pga System.out.print kommando*/

}

}
