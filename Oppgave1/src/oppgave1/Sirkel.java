/*
Levert av gruppe 102
Eda Gulcan: 385395
Frida von Hafenbrädl: 385353
*/

package oppgave1;

public class Sirkel { //Jeg lager en public class for Sirkel, public betyr at den kan hentes fra en annen klasse


/*Vi trenger ikke å definere variablene diameter, omkrets og areal her, det gjør vi inne i metodene */



    //Metode som beregner diameteren til sirkelen. Innparameteren vi trenger for å kjøre koden er radius:
    public static double beregnDiameter(double radius){ //Innparameter radius er av type double, fordi vi skal regne med den
        double diameter = radius*2; //Vi definerer diameter av typen double med formelen for å beregne diameter
        return diameter; /*Vi vil at metoden skal returnere svaret for hva som blir diameteren, når radius er definert i den andre klassen,
        og vi kjører System.out.println*/
    }

    //Så oppretter vi en metode for å beregne omkrets, vi trenger innparameter radius av type double:
    public static double beregnOmkrets(double radius){
        double omkrets = radius*Math.PI*2; //Math.PI er en konstant for pi. omkrets defineres her av typen double med formelen for omkrets.
        return omkrets; //Vi vil at metoden skal returnere svaret for hva som blir omkrets når radius er oppgitt
    }

    //Neste er metode for å beregne areal, med innparameter radius av type double:
    public static double beregnAreal (double radius){
        double areal = Math.PI*Math.pow(radius, 2); //Math.pow opphøyer radiusen i 2. Variabel areal defineres
        return areal; //denne koden oppgir hva arealet av en sirkel er, ut i fra sirkelens radius
    }
}
