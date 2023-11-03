package arrays;

import java.util.ArrayList;

public class Oppgave1 {
    public static void main (String [] args) {
        int[] liste = {45, 34, 5, 8, 10, 2, 13, 25};
        ArrayList.

        //Vi definerer en int teller på oddetall og partall, og setter til null
        int partall = 0;
        int oddetall = 0;

        //forenklet for-løkke som går gjennom hele listen

        for (int i : liste){
            if (i % 2 == 0){
                partall +=1;
            }
            else{
                oddetall++;
            }
        }
        System.out.println("Listen inneholder "+partall+" partall"+"\n"+"Listen inneholder "+oddetall+" oddetall");

    }}
