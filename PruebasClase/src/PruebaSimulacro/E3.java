package PruebaSimulacro;

import javax.swing.*;

public class E3 {
    public static void main(String[] arg){
        double n;

        n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));

        if (n<-2){
            JOptionPane.showMessageDialog(null, "Es menor a -2");
        } else if (n>=-2 && n<2) {
            JOptionPane.showMessageDialog(null, "Es mayor o igual a -2 pero menor a 2");
        } else if (n>=2 && n<5) {
            JOptionPane.showMessageDialog(null, "Es mayor o igual a 2 pero menor a 5");
        } else{
            JOptionPane.showMessageDialog(null, "Es mayor o igual a 5");
        }

    }
}
