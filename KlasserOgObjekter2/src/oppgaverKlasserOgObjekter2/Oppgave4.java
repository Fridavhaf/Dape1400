package oppgaverKlasserOgObjekter2;

/*
Oppgave 4
Lag en klasse kalt Klokke. Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.

Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre).

Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller som meldingsboks på følgende format tt : mm : ss.

Skriv så kode i main for å teste ut denne klassen.
 */

class Klokke{
    private int timer;
    private int minutter;
    private int sekunder;

    public Klokke(int timer, int minutter, int sekunder){
        setSekunder(sekunder);
        setMinutter(minutter);
        setTimer(timer);
        //Vi må kalle på set-metodene i konstruktøren for at disse skal bli brukt, og dermed kjøre if-løkkene
    }

    public void setTimer(int timer){
        if (timer<=24 && timer>=0){
            this.timer=timer;
        }}
    public int getTimer(){
        return minutter;
    }
    public void setMinutter(int minutter){
        if (minutter >= 0 && minutter <= 59){
            this.minutter=minutter;
        }
    }
    public int getMinutter(){
        return minutter;
    }
    public void setSekunder(int sekunder){
        if (sekunder >= 0 && sekunder <= 59){
            this.sekunder = sekunder;
        }
    }
    public int getSekunder(){
        return sekunder;
    }

    public void visTiden(){
        System.out.println("Klokken er "+timer+" : "+minutter+" : "+sekunder+".");
    }

}
   /* Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller som meldingsboks på følgende format tt : mm : ss.
        Skriv så kode i main for å teste ut denne klassen.
        */
public class Oppgave4 {
    public static void main(String[]args){
        Klokke stoppeKlokke = new Klokke(1, 49, 20);
        stoppeKlokke.visTiden();
        Klokke visTiden = new Klokke(13, 77, 3);
        visTiden.visTiden();
        //visTiden-objektet får minutter satt til 0, siden kravene fra if-løkken ikke er tilfredsstilt.
    }
}
