package kontrollstukturer;

import javax.swing.*;
public class Kontrollstrukturer {
        public static void main(String[] args) {
                //Her trenger vi en for løkke og tab mellom hvert element, pluss \n etter hver runde i løkka


                for (int i = 1; i<5; i++){
                        String formel = "N^"+i;
                        System.out.print(formel);
                        for(int j = 1; j<11; j++){
                                double opphøydeTall = Math.pow(j, i);
                                System.out.println(opphøydeTall+"\t");
                        }
                }
        }

}