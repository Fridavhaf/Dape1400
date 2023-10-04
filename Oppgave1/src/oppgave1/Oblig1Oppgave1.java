package oppgave1;

public class Oblig1Oppgave1 {
    public static void main (String [] args){
        double radius = 23.5;

        double diameter = Sirkel.beregnDiameter(radius);
        double omkrets = Sirkel.beregnOmkrets(radius);
        double areal = Sirkel.beregnAreal(radius);

        System.out.println("Diameteren til en sirkel med radius "+radius+" er "+String.format("%.2f", diameter));
        System.out.println("Omkretsen av en sirkel med radius "+radius+" er "+String.format("%.2f", omkrets));
        System.out.println("Arealet til en sirkel med radius "+radius+" er "+String.format("%.2f", areal));


    }
}
