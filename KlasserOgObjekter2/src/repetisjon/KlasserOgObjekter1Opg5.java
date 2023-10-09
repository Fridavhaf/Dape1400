package repetisjon;
/*
Oppgave 5
Lag en klasse kalt Kalkulator. Denne klassen skal ha 4 statiske metoder som tar inn 2 parametere hver. Disse statiske metodene skal
henholdsvis addere, subtrahere, multiplisere og dividere to desimaltall.

Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer.
 */

class Kalkulator{

    public static double addere(double tall1, double tall2) {
        double sum = tall1 + tall2;
        return sum;
        //Kunne også skrevet all koden i metoden på en linje: return tall1 + tall2;
    }
    public static double subtrahere (double tall1, double tall2){
        double sum = tall1 - tall2;
        return sum;
    }
    public static double dividere (double tall1, double tall2){
        double sum = tall1/tall2;
        return sum;
    }
    public static double multiplisere (double tall1, double tall2){
        double sum  = tall1*tall2;
        return sum;
    }
}
public class KlasserOgObjekter1Opg5 {
    public static void main (String [] args){
        System.out.println("2+2 er "+Kalkulator.addere(2,2));
        System.out.println("2-2 er "+Kalkulator.subtrahere(2,2));
        System.out.println("2*2 er "+Kalkulator.multiplisere(2,2));
        System.out.println("2/2 er "+Kalkulator.dividere(2,2));

    }
}
