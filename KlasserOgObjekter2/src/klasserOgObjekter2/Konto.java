package klasserOgObjekter2;

public class Konto { //En public class per java-fil
    private String personnummer;
    private String navn;
    private double saldo;
    //Disse må ha get/set-metoder siden de er private, også må vi ha en konstruktør:

    public Konto(String personnummer, String navn, double saldo) {
        this.personnummer = personnummer;
        this.navn = navn;
        this.saldo = saldo;
    }

    public String getPersonnummer(){
        return personnummer;
    }

    public void setPersonnummer(String personnummer){
        this.personnummer=personnummer;
    }

    public String getNavn(){
        return navn;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
