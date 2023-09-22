package statiske1;

import java.text.DecimalFormat;

public class Statiske1 {

    /* public static void main (String[] args){ /*main er en statisk metode. Da kan metoden kalles
    uten at man tar "new" på klassen først. statiske metoder kan man bruker når metoden ikke er
    avhengig av noen attributer i klassen.
    }*/
    private static double beregnAreal(double radius) { /*denne metoden vil bare være mulig å kalle
    inni denne klassen, derav private. Denne metoden skal beregne arealet til en sirkel.
    Den skal returnere en double og ha inndata radius som er en double*/
        double areal = Math.PI*Math.pow(radius, 2);
        return areal; //lurt å ha i flere setninger slik som dette, først definere, så returnere
    }
    public static void main(String[] args){
        double radius = 23.23;
        double areal = beregnAreal(radius);
        DecimalFormat df2 = new DecimalFormat(".##");
        System.out.print("Arealet til en sirkel med radius "+radius+" er "+df2.format(areal));


    }
}