package klasserOgObjekter2;
//Jeg vil velge min egen klasse, her velger jeg klasse mat
class mat{
    String navnNorsk;
    String navnEngelsk;

    public String menyNavn (String navnNorsk, String navnEngelsk){
        String menyNavn = navnNorsk+", "+navnEngelsk;
        return menyNavn;
    }

}
public class TesteSelv {
    public static void main(String[] args){
        mat Kjøttboller = new mat();
        String menyNavn = Kjøttboller.menyNavn("kjøttboller", "meatballs");
        System.out.println("Navnet på retten er "+menyNavn);

    }
}
