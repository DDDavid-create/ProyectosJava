package Actividades;

import javax.swing.*;

public class EjercicioPagoEmpleado {
    public static void main(String[] arg){

        double bon1=1.5, bon2=0.1, bon3=0.08;
        double desc1=0.02, desc2=0.015, desc3=0.1;
        double salario, bonificacion = 0, descuento = 0, total = 0;
        int cat, opcion;

        do {
            JOptionPane.showMessageDialog(null, "BIENVENIDO");
            salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
            cat = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su categoria: (1-4)"));

            if (salario > 0 && cat > 0){
                switch (cat){
                    case 1:
                        bonificacion+= salario * bon1;
                        descuento+= salario * desc1;
                        total+= (salario + bonificacion) - descuento;
                        break;
                    case 2:
                        bonificacion+= salario * bon2;
                        descuento+= salario * desc2;
                        total+= (salario + bonificacion) - descuento;
                        break;
                    case 3:
                        bonificacion+= salario * bon3;
                        descuento+= salario * desc3;
                        total+= (salario + bonificacion) - descuento;
                        break;
                    default:
                        total+= salario;
                        break;
                }
                String msj = "Salario actual: "+salario+"\n";
                msj+= "Categoría: "+cat+"\n";
                msj+= "Bonificación "+bonificacion+"\n";
                msj+= "Descuento: "+descuento+"\n";
                msj+= "Salario actualizado: "+total;
                JOptionPane.showMessageDialog(null, msj);
            }else{
                JOptionPane.showMessageDialog(null, "No se aceptan números negativos");
            }
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n 0. SALIR\n 1. CALCULAR NUEVO SALARIO\n\n Por favor selecione una opción"));

        }while(opcion!=0);
        JOptionPane.showMessageDialog(null, "VUELVA PRONTO");
    }
}
