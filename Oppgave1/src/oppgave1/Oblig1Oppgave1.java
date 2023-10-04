//STUDENTNUMMER OG FULLT NAVN PÅ DELTAKERE

package oppgave1;

public class Oblig1Oppgave1 { //Her har vi klassen hvor vi skal kjøre programmet
    public static void main (String [] args){ //Denne main-metoden kjører programmet
        double radius = 23.5; //Vi må definere radius, som er parameter for alle metodene i Sirkel-klassen

        /*Vi har statiske metoder i Sirkel-klassen, og det betyr at vi ikke trenger å instansiere et objekt av type Sirkel
        *Vi kan hente metodene kun ved Klassenavn.metodeNavn(parameter).
        *Når vi videre skriver inn parameteren trenger vi kun navnet, ikke type (double), det er allerede definert*/

        double diameter = Sirkel.beregnDiameter(radius);
        double omkrets = Sirkel.beregnOmkrets(radius);
        double areal = Sirkel.beregnAreal(radius);
        /*Her har vi definert diameter, omkrets og areal av type double, og hver av de kaller på hver sine metoder fra
        Sirkel-klassen. Det vil si at variablene nå er definert med formlene fra metoden og verdien for radius som vi
        definerte ovenfor.*/


        //Videre kjører vi koden fra metodene. Det vi si at formlene blir beregnet og svaret på disse blir retunert til oss:
        System.out.println("Diameteren til en sirkel med radius "+radius+" er "+String.format("%.2f", diameter));
        System.out.println("Omkretsen av en sirkel med radius "+radius+" er "+String.format("%.2f", omkrets));
        System.out.println("Arealet til en sirkel med radius "+radius+" er "+String.format("%.2f", areal));
        //String.format("%.2f", variabel) gjør at variabelen av type double blir oppgitt med to desimaler.
    }
}
