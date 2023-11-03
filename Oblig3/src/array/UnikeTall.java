package array;

import javax.swing.*;

//Jeg har UnikeTall i en egen public class, slik at denne kan hentes fra andre klasser
public class UnikeTall {

    /*Jeg oppretter tre attributter i klassen:
    -En for lengdeArray, som senere skal bestemmes gjennom en konstruktør,
    og følgelig fra den andre klasser hvor jeg kjører main-metoden
    -En for arrayet av type int, som foreløpig står tomt
    -En for tilfeligTall, som blir tilfeldig generert lenger ned i denne filen*/
    int lengdeArray;
    int[] listeMedUnikeTall;
    int tilfeldigTall;

    //Jeg oppretter en metode for deklarasjon, D
    public void deklarasjon() {
        JOptionPane.showMessageDialog(null, "Jeg lager et array for lagring av tilfeldige heltall\n"+
                "fra intervallet 100 til 999, begge grensene inkludert");
    }

    //Jeg oppretter en konstruktør, denne må ha samme navn som klassen selv
    //Innparameteren til konstruktøren er arrayets lengde, og med denne informasjonen kan arrayet defineres
    public UnikeTall(int lengdeArray) {
        this.lengdeArray = lengdeArray;
        //Vi gir arrayet vi definerte tidligere en definisjon. Den blir nå definert med antall plasser:
        listeMedUnikeTall = new int[lengdeArray];
    }

     /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
     Tallet det letes etter skal mottas som parameter.
     Metoden skal returnere true hvis tallet finnes i arrayet.
     Hvis ikke skal metoden returnere false. */

    public boolean sikreNyeTall(int tilfeldigTall) {
        this.tilfeldigTall = tilfeldigTall;
        for (int tall : listeMedUnikeTall) {
            if (tall == tilfeldigTall) {
                return true;
                // Hvis tallet finnes i listen, returnerer vi true.
            }
        }
        return false;
        // Hvis løkken avsluttes uten å finne tallet, returnerer vi false.
    }


       /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
     begge grenser inkludert. Metoden skal gjøre dette på en måte
     som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
     parametre og heller ikke returnere noen verdi.
     Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
   */

    public void fyllArrayMedUnikeTall() {
        int indeks = 0;
        while (indeks < lengdeArray) {
            //Her oppretter vi slumptall av tilfeldige tall som variabelen tilfeldigTall f.o.m. 99 t.o.m. 999
            int tilfeldigTall = (int) (Math.random() * 900) + 100;
            if (!sikreNyeTall(tilfeldigTall)) {
                listeMedUnikeTall[indeks] = tilfeldigTall; // Legg til det unike tallet i arrayet.
                indeks++;
            }
        }
    }

    // Metode som finner og returnerer det minste tallet i arrayet.
    //Jeg kaller metoden for minsteTall for å beskrive den, jeg bruker identitet int fordi det er det den skal returnere

    private int minsteTall() {
        int minste = listeMedUnikeTall[0];
        for (int i : listeMedUnikeTall) {
            if (i < minste) {
                minste = i;
            }
        }
        return minste;
    }

    /*Trenger bare å være privat, siden vi skal kalle på denne senere fra denne klassen i en public metode,
    og det er den public metoden vi skal kalle på  fra en annen klasse*/
    private int størsteTall() {
        int største = listeMedUnikeTall[0];
        for (int i : listeMedUnikeTall) {
            if (i > største) {
                største = i;
            }
        }
        return største;
    }

    /*  Metode som beregner og returnerer den gjennomstnittlige verdien
  (double-verdi) av tallene i arrayet.  */

    private double finnGjennomsnitt() {
        //Jeg vil først opprette en for-løkke for å finne summen av alle tallene i arrayet
        int sum = 0;
        for (int i=0; i<listeMedUnikeTall.length; i++) {
            sum+= listeMedUnikeTall[i];
        }
        double gjennomsnitt = (double) sum / lengdeArray;
        return gjennomsnitt;
    }

    public String kjørMeldinger() {

        //Dette er en for-løkke som skall vise alle tallene i arrayet
        String ut = "";
        int antall = 0;
        for (int i = 0; i < listeMedUnikeTall.length; i++) {
            ut += Integer.toString(listeMedUnikeTall[i]);
            antall++;
            if (i < listeMedUnikeTall.length - 1) {
                ut += ", ";
            }
            if (antall > 8) {
                ut += "\n";
                //Setter antall til null igjen, for at tellingen skaL begynne på nytt
                antall = 0;
            }
        }

        int minste = minsteTall();
        int største = størsteTall();
        double gjennomsnitt = finnGjennomsnitt();
        JOptionPane.showMessageDialog(null, "Tallene i listen er:\n"+ut+"\n"+"\n"+
                "Minste tall er "+minste+"\n"+"Største tall er "+største+"\n"+
                "Gjennomsnittsverdien er "+String.format("%.2f", gjennomsnitt));

        return ut;

    }
}
