package oppgaverKlasserOgObjekter2;

/*
Oppgave 3
Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin. Klassen skal ha 5 private attributter:

Bensinstasjonens sted (en streng)
Type bensin (en streng)
Antall liter fylt (et desimaltall)
Prisen pr. liter (et desimaltall)
Tidspunkt fylt (en streng)
Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
Lag så en metode finnTotalPrisen. Denne skal ikke ha noen parametere inn, men skal returnere prisen som et desimaltall.
Metoden skal da multiplisere antall liter fylt med prisen pr. liter.

Lag så kode i main for å teste ut denne klassen. Bruk String.format("%.2f", prisen); for å få to desimaler.
 */

class BensinKjøp{
    private String navnBensinstasjon;
    private String typeBensin;
    private double antallLiterFylt;
    private double prisPerLiter;
    private String tidspunktFylt;

    public BensinKjøp(String navnBensinstasjon, String typeBensin, double antallLiterFylt, double prisPerLiter, String tidspunktFylt){
        this.navnBensinstasjon=navnBensinstasjon;
        this.typeBensin = typeBensin;
        this.antallLiterFylt = antallLiterFylt;
        this.prisPerLiter = prisPerLiter;
        this.tidspunktFylt = tidspunktFylt;
    }

    public void setNavnBensinstasjon(String navnBensinstasjon){
        this.navnBensinstasjon = navnBensinstasjon;
    }
    public String getNavnBensinstasjon(){
        return navnBensinstasjon;
    }

    public void setTypeBensin(String typeBensin){
        this.typeBensin = typeBensin;
    }
    public String getBensin(){
        return typeBensin;
    }

    public void setAntallLiterFylt(double antallLiterFylt){
        this.antallLiterFylt=antallLiterFylt;
    }
    public double getAntallLiterFylt(){
        return antallLiterFylt;
    }

    public void setPrisPerLiter(double prisPerLiter){
        this.prisPerLiter = prisPerLiter;
    }
    public double getPrisPerLiter(){
        return prisPerLiter;
    }

    public void setTidspunktFylt(String tidspunktFylt){
        this.tidspunktFylt=tidspunktFylt;
    }
    public String getTidspunktFylt(){
        return tidspunktFylt;
    }

    public double finnTotalPrisen(){
        double totalPris = antallLiterFylt*prisPerLiter;
        return totalPris;
    }
}
public class Oppgave3 {
    public static void main (String []args){
        BensinKjøp frida = new BensinKjøp("Esso", "Blyfri",10, 20.9, "12:40");
        frida.finnTotalPrisen();
        System.out.println("Prisen blir "+String.format("%.2f", frida.finnTotalPrisen()));
    }
}
