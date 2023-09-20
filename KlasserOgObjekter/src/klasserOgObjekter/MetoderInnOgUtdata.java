package klasserOgObjekter;
//Her utvides eksemplet litt for å vise hvordan metoder kan motta og returnere data.

    class Båt {
        private String farge;

        public void visFarge() {
            System.out.println("Fargen til båten er " + farge);

        }

        //Vi oppretter en ny metode som heter settFarge. Den skal motta en parameter/et argument
        public void settFarge(String fargen) { /*Vi setter en variabel inn i parameterlisten til denne metoden.
        Dette settes altså i parantes. Inni parantes må vi alltid ha type og variabelnavn
        Vi har her satt inn en String som heter fargen*/
            farge = fargen;
        }

        public String hentFarge(){ //Her har vi String istedefor void, dvs. den skal returnere noe
            return farge;

        }

    }


    public class MetoderInnOgUtdata {
        public static void main(String[] args) {
            Båt nyBåt = new Båt ();
            //nyBåt.farge = "blå";
            nyBåt.settFarge("blå");
            //nyBåt.visFarge();
            String båtFargen;
            båtFargen = nyBåt.hentFarge(); /*Denne metoden returnerer fargen. Fargen kommer inn i
            variabelen som er opprettet her*/
            System.out.println("Fargen til båten er " + båtFargen);
        }
    }


