package forelesningVariabler2;


import static javax.swing.JOptionPane.*; //Stjerne gjør at vi får med alle, denne kommandoen er grå før den brukes

public class ForelesningVariabler2 {
    public static void main (String [] args){
       /* int alderPer =23;
        int alderLine, sumAlder;
        alderLine = 22;
        sumAlder = alderLine + alderPer;
        System.out.println("Summen av alderen til Per og Line er "+sumAlder);
        String innNavn=showInputDialog("Skriv inn navnet");
        String innAlder=showInputDialog("skriv inn alderen");
        int alder = Integer.parseInt(innAlder);
        int fødselsår = 2023 - alder;
        showMessageDialog(null, innNavn+" er født "+fødselsår);
        */

        double tall;
        String innStreng = showInputDialog("Skriv inn et tall");
        try{
            tall = Double.parseDouble(innStreng);
        }
        catch (Exception e){ //kan defineres som man vil, men vanlig med e
            tall = 0;

    }
        showMessageDialog(null, "Tallet er "+tall);
}}
