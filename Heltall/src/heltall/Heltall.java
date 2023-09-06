package heltall;

import javax.swing.*;

public class Heltall {
    public static void main(String [] args){
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et heltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et heltall til");
        int tall1 = Integer.parseInt(innStreng1);
        int tall2 = Integer.parseInt(innStreng2);
        int sum = tall1 + tall2;
        System.out.println("Summen av de to tallene er "+sum);
    }
}

