package EjerciciosCIclos;

import javax.swing.*;

public class A7 {
    public static void main(String [] arg){
        double n1, n2, n3, promedio;
        int opcion;
        String msj ;

        JOptionPane.showMessageDialog(null, "---------BIENVENIDO----------", "BIENVENIDO", JOptionPane.INFORMATION_MESSAGE);
        do {
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota"));
            n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota"));

            promedio = (n1 + n2 + n3)/3;

            msj = "Su promedio de notas es: " + promedio;
            JOptionPane.showMessageDialog(null, msj);

            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n \n0.SALIR \n1.INGRESAR NUEVAS NOTAS\n\n Elija una opcion por favor"));
        }while (opcion !=0);


    }
}
