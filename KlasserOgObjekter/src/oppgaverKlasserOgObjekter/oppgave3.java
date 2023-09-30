package oppgaverKlasserOgObjekter;

import static javax.swing.JOptionPane.*;

/*Oppgave 3
Lag en klasse kalt Person. Denne skal inneholde følgende attributter:

navn
adresse
telefonnr
fødselsår
Lag en metode for å regne ut alderen til en person. Metoden skal ikke ta inn noen parametere, den skal regne ut alderen ut i fra fødselsår. Metoden skal returnere alderen.

Lag så en metode som, tar inn alderen, og som skriver ut alle vitale data for personen på følgende måte:

Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.
Opprett et eller flere person objekter i main-metoden for å teste ut.*/

class Person{
    public String navn;
    public String adresse;
    public String telefonnummer;
    public int fødselsår;

    public int alder(){
        return 2023 - fødselsår; //Når vi kaller på denne i metoden, så får vi tilbake hvor gammel personen er
    }


    public void skrivUt(int alder){ //Vi putter inn parameteren alder, for denne er ikke definert i klassemalen
        String ut = "Navn : "+navn+"\n Adresse : "+adresse+"\n Telefonnummer : "+telefonnummer+"\n Alder : "+alder+" år.";
        showMessageDialog(null, ut);

    }
//Vi har to metoder i denne klassen nå, public in alder (finne alder), og skriUt-metoden

}


public class oppgave3 {
    public static void main (String[] args){
        Person enPerson = new Person();
        String navn = showInputDialog("Navn : ");
        String adresse = showInputDialog("Adresse : ");
        String telefonnummer = showInputDialog("Telefonnummer : ");
        String innFødselsår =showInputDialog("Fødselsår : ");
        int fødselsår = Integer. parseInt(innFødselsår);

        enPerson.navn = navn;
        enPerson.adresse = adresse;
        enPerson.telefonnummer = telefonnummer;
        enPerson.fødselsår = fødselsår;

        int alder = enPerson.alder();
        enPerson.skrivUt(alder);

    }


}
