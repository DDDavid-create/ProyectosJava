package Actividades;

import javax.swing.*;

public class EjercicioNomina {
    public static void main(String[] arg){

        double salario, total = 0, desc = 0;
        double porc1 = 0.02, porc2 = 0.04, porc3 = 0.08, porc4 = 0.1;
        int estrato, opcion;
        do{
            JOptionPane.showMessageDialog(null, "BIENVENIDO");
            salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
            estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estrato (1-6)"));

            if (estrato > 0) {
                if (estrato == 1 || estrato == 2) {
                    desc += salario * porc1;
                    total += salario - desc;
                } else if (estrato == 3 || estrato == 4) {
                    desc += salario * porc2;
                    total += salario - desc;
                } else if (estrato == 5) {
                    desc += salario * porc3;
                    total += salario - desc;
                } else if (estrato == 6){
                    desc += salario * porc4;
                    total += salario - desc;
                }
                String msj = "Salario: "+salario+"\n";
                msj += "Estrato: "+estrato+"\n";
                msj += "Descuento: "+desc+"\n";
                msj += "Salario con descuento incluido "+total+"\n";
                JOptionPane.showMessageDialog(null, msj);
            }else{
                JOptionPane.showMessageDialog(null,"No es valido");
            }
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué deseas hacer?\n 0. SALIR\n 1. Calcular otro salario"));

        }while(opcion!=0);
}
}