package oppgaverKlasserOgObjekter2;
/*Oppgave 1
Lag en klasse «Person» med følgende private attributter:

fornavn
etternavn
adresse
telefonnr
Lag en konstruktør som setter disse ved instansiering av klassen. Lag så «get», «set» metoder for disse.

Lag så en metode som skriver ut dataene via Swing sin ShowMessageDialog med linjeskift mellom de ulike feltene.

Skriv så kode i «main» for å lese inn dataene via Swing sin input, opprette et objekt og kalle metoden over for å vise disse.*/

import javax.swing.*;

class Person{
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public Person (String fornavn, String etternavn, String adresse, String telefonnr){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public String getFornavn (){
        return fornavn;
    }

    public void setFornavn (String fornavn){
        this.fornavn = fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }
    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }
    public String getAdresse(){
        return adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getTelefonnr(){
        return telefonnr;
    }
    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }


}
public class Oppgave1 {
    public static void main (String[]args){
        Person Frida = new Person("Frida von","Hafenbrädl", "Seljeveien 37", "45491588");
        JOptionPane.showMessageDialog(null, "Fornavn : "+Frida.getFornavn()+"\nEtternavn : "+Frida.getEtternavn()+
                "\nAdresse : "+Frida.getAdresse()+"\nTelefon : "+Frida.getTelefonnr());

    }
}
