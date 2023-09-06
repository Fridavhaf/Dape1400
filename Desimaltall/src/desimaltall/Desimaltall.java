package desimaltall;

import javax.swing.*;

public class Desimaltall {
    public static void main(String []args){
        String innStreng1= JOptionPane.showInputDialog("Skriv inn et desimaltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et desimaltall");
        double tall1 = Double.parseDouble(innStreng1); /*Konverterer inntallet til et deismaltall*/
        double tall2 = Double.parseDouble(innStreng2);
        double divisjon = tall1 / tall2;
        System.out.println("Divisjonen ble "+divisjon);
}}