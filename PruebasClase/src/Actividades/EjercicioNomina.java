package src.Actividades;

import javax.swing.*;

public class EjercicioNomina {
    public static void main(String[] arg){

        double salario, total = 0;
        double porc1 = 0.02, porc2 = 0.04, porc3 = 0.08, porc4 = 0.1;
        int estrato, opcion;
        do{
            JOptionPane.showMessageDialog(null, "BIENVENIDO");
            salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
            estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estrato (1-6)"));

            if (estrato > 0) {
                if (estrato == 1 || estrato == 2) {
                    total = salario - (salario * porc1);
                } else if (estrato == 3 || estrato == 4) {
                    total = salario - (salario * porc2);
                } else if (estrato == 5) {
                    total = salario - (salario * porc3);
                } else if (estrato == 6) {
                    total = salario - (salario * porc4);
                }
                JOptionPane.showMessageDialog(null, "Su salario con el descuento segun tu estrato es de: " + total);
            }else{
                JOptionPane.showMessageDialog(null,"No es valido");
            }
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué deseas hacer?\n 0. SALIR\n 1. Calcular otro salario"));

        }while(opcion!=0);
}
}