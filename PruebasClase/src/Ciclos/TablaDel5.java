package Ciclos;

import javax.swing.*;

public class TablaDel5 {
    public static void main(String[] args){
        int i;
        int res;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a multiplicar"));
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces a multiplicar"));

        for (i=1; i<=cant;i++){
            res = i*cant;
            String msj = i+"x"+num+"="+res;
            JOptionPane.showMessageDialog(null, msj);
        }
    }
}
