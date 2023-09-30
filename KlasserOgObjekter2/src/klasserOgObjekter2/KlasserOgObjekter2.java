package klasserOgObjekter2;

public class KlasserOgObjekter2 {
    public static void main (String[] args){
        Konto sparekonto = new Konto("31789213", "Frida", 200);
        Konto lønnskonto = new Konto("94345433", "Audun", 250);
        sparekonto.setSaldo(2000);
        lønnskonto.setSaldo(1000);
        System.out.println("Sparekontoen tilhører "+sparekonto.getNavn());
        System.out.println("Saldoen til denne er nå "+sparekonto.getSaldo()+" kr.");
        System.out.println("Saldoen til lønnskontoen er "+lønnskonto.getSaldo()+" kr.");

    }
}
