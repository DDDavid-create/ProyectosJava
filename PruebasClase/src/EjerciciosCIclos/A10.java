package EjerciciosCIclos;

import javax.swing.*;

public class A10 {
    public static void main(String[] arg){
        int i, tabla, num;
        int res;

        tabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la tabla"));
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de resultados"));

        for (i = 1; i <= num; i++) {
            res = i*tabla;
            String msj = tabla + " x " + i + " = " + res;
            JOptionPane.showMessageDialog(null, msj);
        }

    }
}
