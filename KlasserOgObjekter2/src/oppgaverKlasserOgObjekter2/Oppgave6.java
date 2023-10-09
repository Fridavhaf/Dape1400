package oppgaverKlasserOgObjekter2;

/*
Oppgave 6
Det skal lages en klasse kalt Vind. Denne klassen skal beregne ut i fra en oppgitt vindhastighet i km/t om det er
stille (mindre enn 2 km/t) og om det er orkan (mer enn 120 km/t).

Videre skal klassen kunne beregne hvor mye vindhastigheten tilsvarer på Beaufort-skala (1-12).
 Formelen for Beaufort er : (((vindhastighet i km/t) / 3.01)^0.6666)+0.5. ^ betyr opphøyd i.
 Bruk gjerne Math.pow funksjonen for å foreta beregningen.

Til slutt skal det være mulig å regne ut antall knop i en metode. En knop er lik 1852 meter.

Nedenfor illustreres hvordan klassen og metodene skal se ut:
 */

import javax.swing.*;

class Vind{

   private double vindHastighet;
   //Ikke nødvendig å sette den til 0 i utgangspunktet

   public Vind (double vindHastighet){
       this.vindHastighet = vindHastighet;
   }

   //Så skal vi hente vindhastigheten
    public double getVindHastighet(){
       return vindHastighet;
    }
    public boolean erOrkan(){
       if(vindHastighet >= 120){
           return true;
       }
       return false;

    }
    public boolean erVindstille(){
       if(vindHastighet <= 2){
           return true;
       }
       return false;
       //Trenger altså ikke else, dette kjøres uansett hvis if ikke kjøres
    }
    public double getKnop(){
       double knop = vindHastighet / 1.852;
       return knop;

    }
    public int getBeaufort(){
       int beaufort = (int)(Math.pow(vindHastighet/3.01, 0.6666)+0.5);
       //denne ble ikke en int automatisk, men vi tvingte den til å bli det med (int); såkalt casting.
        if(beaufort > 12){
            beaufort = 12;
            //Skalaen går bare til 12, så er tallet høyere blir det 12 uansett
        }
        return beaufort;

    }
}
public class Oppgave6 {
    public static void main (String []args){
        String innVind = JOptionPane.showInputDialog("Oppgi vindhastigheten");
        double vind = Double.parseDouble(innVind);
        Vind sjekkVind = new Vind(vind);
        String ut = "vindhastigheten er "+sjekkVind.getVindHastighet()+"\n";
        if(sjekkVind.erOrkan()){
            ut+="Det er orkan.\n";
            }
        if(sjekkVind.erVindstille()){
            ut+="Det er vindstille.\n";
        }
        String knop = String.format("%.2f", sjekkVind.getKnop());
        ut += "Det er "+knop+" knop.\n";
        ut += "Og det tilsvarer "+sjekkVind.getBeaufort()+" på beaufort skalaen.";
        JOptionPane.showMessageDialog(null, ut);
    }
}
