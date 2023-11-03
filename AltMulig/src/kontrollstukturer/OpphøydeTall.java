package kontrollstukturer;

import javax.swing.*;

public class OpphøydeTall {
    public static void main (String [] args){
        //Først vil jeg printe formel
        String formel = "N^";
        String ut = "";
        for(int i=1; i<5; i++){
            String konvertertTall = Integer.toString(i);
            System.out.print(formel+i+"\t"+"\t");
        }
        System.out.print("\n");

        //Nå vil jeg printe første linje, her jobber vi først med tallet 1 som skal være opphøyd i 1-4
        double opphøydeTall;
        for (int i = 1; i<11; i++){
            opphøydeTall = Math.pow(i, 1);
            System.out.print(String.format("%.0f", opphøydeTall)+"\t"+"\t");
            opphøydeTall = Math.pow(i, 2);
            System.out.print(String.format("%.0f", opphøydeTall)+"\t"+"\t");
            opphøydeTall = Math.pow(i, 3);
            System.out.print(String.format("%.0f", opphøydeTall)+"\t"+"\t");
            opphøydeTall = Math.pow(i, 4);
            System.out.print(String.format("%.0f", opphøydeTall));
            System.out.print("\n");
        }


    }
}
