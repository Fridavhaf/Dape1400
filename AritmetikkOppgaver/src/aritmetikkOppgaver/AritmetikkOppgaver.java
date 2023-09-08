package aritmetikkOppgaver;

import static javax.swing.JOptionPane.*;

public class AritmetikkOppgaver {

   public static void main(String [] args){
       String innTall = showInputDialog("Skriv inn et tall fra 0 til 1000");

       int tall = Integer.parseInt(innTall);

       if (tall<10) {
           showMessageDialog(null, "Tverrsummen av tallet er " + tall);
       }
       if (tall>=10 & tall<100){
           int førsteTverrsum = tall/10;
           int andreTverrsum = tall%10;
           showMessageDialog(null, "tallets tverrsum er "+førsteTverrsum+" + "+andreTverrsum);

       }
       if (tall>=100 & tall<1000){
           int førsteTverrsum = tall/100;
           int andreTverrsum = (tall/10)%10;
            int tredjeTverrsum = tall%10;
            showMessageDialog(null, "Tallets tverrsum er "+førsteTverrsum+" + "+andreTverrsum+" + "
            +tredjeTverrsum+".");
       }

       if (tall == 1000){
           int førsteTverrsum = tall/1000;
           int andreTverrsum = (tall/100)%10;
           int tredjeTverrsum = (tall/10)%10;
           int fjerdeTverrsum = tall%10;
           showMessageDialog(null, "Tallets tverrsum er "+førsteTverrsum+" + "+andreTverrsum+" + "
                   +tredjeTverrsum+" + "+fjerdeTverrsum+".");
       }
    }
}