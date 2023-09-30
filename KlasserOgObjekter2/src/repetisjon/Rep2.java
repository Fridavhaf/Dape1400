package repetisjon;

//Metode med to innparametere og returnerer en verdi (double), ingen attributter.

class Bil1 {
    //Ingen attributter
    public double rekkevidde(double tank, double forbruk){
        double rekkevidde = tank/forbruk;
        return rekkevidde; //Må være av samme type som metoden, her en double. Det er denne og den foregående linjen som blir kjørt.
    }

}
public class Rep2 {
    public static void main (String[] args){
        Bil1 volvo = new Bil1();
        double rekkevidde = volvo.rekkevidde(80, 0.8);
        System.out.println("Rekkevidden til bilen er ");
        System.out.println(rekkevidde+" mil");
    }
}
