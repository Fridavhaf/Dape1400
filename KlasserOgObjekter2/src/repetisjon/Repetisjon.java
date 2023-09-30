package repetisjon;

//Metode med en innparameter og en ut, begge desimaltall

class Bil{
    public int tank; //attributt
    public double rekkevidde(double forbruk){
        double rekkevidde = tank/forbruk;
        return rekkevidde; //vi kan returnere rekkevidde som et desimaltall siden vi definerte det i metoden
    }
}
public class Repetisjon {
    public static void main (String[] args){
        Bil volvo = new Bil();
        volvo.tank = 80; //Kan settes her fordi tank er en public attributt
        double literPerMil = 0.8; //vi definerer en ny variabel
        double rekkevidde = volvo.rekkevidde(literPerMil);
        System.out.print("Rekkevidden til bilen er ");
        System.out.println(rekkevidde+" mil");


    }
}
