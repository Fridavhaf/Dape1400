package klasserOgObjekter2;

//Eksempel statisk metode

class Bil{
    //Kan ha attributter, men ikke som blir brukt i metoden!
    public static double rekkevidde (double tank, double forbruk){ /*Vi har alltid public på en metode hvis den
    skal kalles fra en annen klasse*/
        double rekkevidde = tank/forbruk;
        return rekkevidde;
    }
}
public class Static {
    public static void main (String[] args){
        double rekkevidde = Bil.rekkevidde(80, 0.8); //Vi trenger alts ikke new, men klassenavn.metodenavn
        System.out.println("Bilens rekkevidde er ");
        System.out.println(rekkevidde+" mil");
    }
}
