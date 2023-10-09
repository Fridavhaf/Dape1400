package oppgaverKlasserOgObjekter2;

import javax.swing.*;

class Konto{
    private String navn;
    private String kontonummer;
    private double saldo;

    public Konto (String navn, String kontonummer, double saldo){
        this.navn = navn;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */
    //Vi skal ha en metode som skal returnere attributenes verdier i et dialogvindu; den skal ikke returnere noe
    public void utskrift(){ //Skal kun ha attributene som ligger inne i klassen
        String ut = "Kontoinnehaver : "+navn+"\nKontonummer : "+ kontonummer +
                "\nSaldo : "+String.format("%.2f", saldo)+" kr.";

        JOptionPane.showMessageDialog(null, ut);

    }
      /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */
    public String settInn (double beløp){ //Vi bruker String fordi det er en String som skal returneres
        saldo += beløp; //ny saldo blir saldo + det vi legger inn i innparameter som tillegg
        return "Den nye saldoen er "+String.format("%.2f", saldo);
    }
        /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */

    public String taUt (double beløp){
        String ut = "";
        if(beløp <=saldo){
            saldo -= beløp;
            ut = "Den nye saldoen er : "+String.format("%.2f", saldo);
        }
        else{
            ut = "Ikke dekning på konto!";
        }
        return ut;
    }
}

public class Oppgave5 {
    public static void main(String[] args) {
        String kontonavn = JOptionPane.showInputDialog("Skriv inn kontonavn");
        String kontonummer = JOptionPane.showInputDialog("Skriv inn kontonummer");
        String innSaldo = JOptionPane.showInputDialog("Skriv inn saldo");
        double saldo = Double.parseDouble(innSaldo);

        Konto nyKonto = new Konto(kontonavn, kontonummer, saldo);
        System.out.println(nyKonto.settInn(1000));
        System.out.println(nyKonto.taUt(10));
        System.out.println(nyKonto.settInn(1000));
        nyKonto.utskrift();
        System.out.println(nyKonto.taUt(5000));
        nyKonto.utskrift();



    }
}