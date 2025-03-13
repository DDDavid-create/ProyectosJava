package PruebaSimulacro;

import javax.swing.*;

public class E2 {
    public static void  main(String[] arg){
        double area, base, altura;
        int opcion;

        do {
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura"));

        area = (base*altura)/2;
            if (base>0 && altura>0){
                String msj = "El area es: " + area;
                JOptionPane.showMessageDialog(null, msj);
                    if (area>200){
                        JOptionPane.showMessageDialog(null, "Es un gran area");
                    }
            }else{
            JOptionPane.showMessageDialog(null, "No se permiten datos negativos");
            }
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n\n 0.SALIR \n1.Ingresar nuevos datos"));
        }while (opcion!=0);

    }
}
