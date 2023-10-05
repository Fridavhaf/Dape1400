//STUDENTNUMMER OG FULLT NAVN PÅ ALLE DELTAKERE

package oppgave2;

public class Vare { //Vi oppretter en public class med navn Vare. Den heter altså det samme som Java-filen


    //Videre har vi attributtene i klassen:

    //Vi definerer variabel navn av type String
    private String navn;

    //Vi definerer variabelen tall av type int
    private int antall;

    //Vi definerer variabelen pris av type double
    private double pris;

    /*Disse variablene er private. Det vil si at de bare kan hentes fra/brukes i denne klassen.
    Men ved get/set kan vi få brukt de fra en annen klasse allikevel.*/


    //Etter attributtene setter vi en konstruktør. Dette er en metode med samme navn som klassen, må dermed ha stor forbokstav
    public Vare (String navn, int antall, double pris) {
        //Konstruktøren heter Vare og inneholder alle attributtene

        this.navn = navn;
        this.antall = antall;
        this.pris = pris;

        /*med this-kommandoen etterfulgt av .variabelnavn velger vi variabelen som er definert i denne klassen
        Vi setter variablene navn, tall og pris i klassen til henholdsvis å være like attributtene i konstruktøren*/
    }

    /*Vi kaller på denne konstrukøtrn når vi senere oppretter et objekt av typen Vare.
    Konstruktøren gjør at vi må sette verdier til attributtene med en gang.*/

    /*Siden variablene i klassen er private, så oppretter vi nå "get"/"set"-metoder.
    Disse kan vi hente ut data og lagre data i.
    Da blir det mulig å bruke variablene fra en annen klasse, selv om variablene er private.
    "get"/"set"-metoder kan vi også bruke til å sjekke dataen som legges inn i parameterene.
    I denne oppgaven skal vi sørge for at attributtene antall og pris blir satt til større enn null*/



    /*Vi oppretter en "set"-metode for navn. Metoden er public fordi den skal hentes fra en annen klasse.
    Metoden er void, fordi den ikke skal returnere noe.
    Metoden setNavn inneholder en innparameter; strengen navn. Metoden skal ta inn parameter for attributten navn av type String.
    Vi setter this.navn = navn; for å sette metodens attributt navn lik klassens attributt navn.*/
    public void setNavn(String navn){
        this.navn = navn;
    }

    /*Videre oppretter vi en "get"-metode som skal returnere dataen som ble lagt inn i navn via "set"-metoden.*/
    public String getNavn(){
        return navn;
    }

    /*Videre oppretter vi "set"/"get"-metoder for antall. Forskjellen her er at vi at variabelen er av typen int.
    Det er derfor viktig å definere det i innparameter i "set"-metoden og før metode-navnet i "get"-metoden slik at
    det blir satt inn data av type int og retunert data av type int.*/
    public void setAntall(int antall){
        if (antall>0) {
            this.antall = antall;
            /*Hvis antall blir satt til større en null blir kommandoen kjørt.
            Variabelen i klassen blir ikke tilegnet verdi dersom inndataen ikke er en int>0
             */
        }
    }
    public int getAntall(){
            return antall;
    }
    public void setPris(double pris){
        if (pris>0) {
            this.pris = pris;
        }
    }
    public double getPris(){
            return pris;
        }


        //Videre trenger vi en metode for å regne beregne varens totalpris


    public double beregnTotalpris(){
        //Vi trenger ikke noen innparameter, vi har dataen vi trenger

        double totalpris;
        //Vi definerer variabelen pris.

        totalpris = getAntall()*getPris();
        //Vi setter pris lik formelen for å beregne pris

        return totalpris;
        //Vi vil ha svaret på formelen/prisens verdi oppgitt når vi kaller på metoden
    }
}
