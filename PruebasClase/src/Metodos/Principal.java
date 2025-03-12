package Metodos;

import javax.swing.*;

public class Principal {
    public static void main(String[] arg){

        int anioNac, mesNac, diaNac;
        int anioAct = 2025, mesAct = 3, diaAct = 11;
        int anios, meses, dias;

        anioNac = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento"));
        mesNac = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su mes de nacimiento"));
        diaNac = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dia de nacimiento"));



        anios = anioAct - anioNac;
        meses = mesAct - mesNac;
        dias = diaAct - diaNac;

        if (diaNac>0 && diaNac <=31 )
            if (anios>18){
                JOptionPane.showMessageDialog(null, "Eres mayor de edad");
            } else if (anios == 18 && meses >0) {
                JOptionPane.showMessageDialog(null, "Es mayor de edad");
            }else if (anios == 18 && meses == 0 && dias >=0){
                JOptionPane.showMessageDialog(null, "Es mayor de edad");
            }else {
                JOptionPane.showMessageDialog(null, "ES MENOR CANSON");
            }

    }
}