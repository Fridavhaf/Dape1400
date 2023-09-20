package klasserOgObjekter;

class Bil{ //Vi definerer en klasse Bil (ikke public/private: dette kommer vi til senere)
    public String farge; /*Vi legger til en attribut/variabel av typen String som heter farge
    Denne er public slik at vi får hentet den seneere.
    Så skal vi ha en metode, et sted hvor vi kan kjøre kode. Det er kode inni en metode*/
    public void visFarge (){/*Public for å kunne hente senere. void = den skal ikke returnere noe
Metoden heter visFarge, den tar ingen paramerere inn (det som settes i parentes)
Den skal bare vise fargen i System out*/
        System.out.println("Fargen til bilen er "+farge);

}
}

/* Vi bruker det ovenfor som mal, også lager vi en bil nedenfor.
Vi gjør dette ved å opprette et objekt av typen Bil.
Klassen Bil har altså blitt en egen type. Variabler har typer (Eks. String, int, osv.)
Nå vil variabelen vi kaller nyBil være at typen Bil*/
public class LettEksempel { //Vi har en klasse som heter LettEksempel
    public static void main (String [] args){ //Vi har metoden main, som kjøres når vi kjører programmet
        Bil nyBil = new Bil (); /*Når vi tar new klassenavn og (); blir variabel nyBil av typen Bil.
        Det vil si at nyBil, som er et objekt i forhold til klassen Bil, som er en beskrivelse av
        objektet. Så inni nyBil ligger det nå en variabel med navn farge og en metode som heter
        visFarge som viser fargen i system out. nyBil har fått attribut og metode.*/
        nyBil.farge="blå"; //nyBil sin variabel farge av typen Streng blitt tilordnet blå

        //Vi kan nå kjøre main ved å kalle på print-kommandoen slik:
        nyBil.visFarge();
    }
}
