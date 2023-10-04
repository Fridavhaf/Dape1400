package oppgave1;

public class Sirkel { //Den er public og kan hentes fra en annen klasse


    public static double beregnDiameter(double radius){
        double diameter = radius*2;
        return diameter;
    }

    public static double beregnOmkrets(double radius){
        double omkrets = radius*Math.PI*2; //Math.PI er en konstant for pi
        return omkrets;
    }

    public static double beregnAreal (double radius){
        double areal = Math.PI*Math.pow(radius, 2); //Math.pow opphøyer radiusen i 2.
        return areal;
    }
}
