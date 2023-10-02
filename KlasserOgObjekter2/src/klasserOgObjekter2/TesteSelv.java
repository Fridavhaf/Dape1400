package klasserOgObjekter2;
//Jeg vil velge min egen klasse, her velger jeg klasse mat
class mat{


    public static String menyNavn (String navnNorsk, String navnEngelsk){
        String menyNavn = navnNorsk+", "+navnEngelsk;
        return menyNavn;
    }

}
public class TesteSelv {
    public static void main(String[] args){
        String menyNavn = mat.menyNavn("kjøttboller", "meatballs");
        System.out.println("Navnet på retten er "+menyNavn);

    }
}
