package PruebaSimulacro;

import javax.swing.*;

public class E4 {
    public static void main(String[] arg){
        /*Haga un ejemplo donde use la estructura switch - case y el ciclo while */
        int opcion = 5;

        while (opcion!=0){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n\n \n1.Mostrar Saludo \n2.Mostrar despedida \nOTRO NUMERO PARA SALIR"));

        switch (opcion){
            case 1: JOptionPane.showMessageDialog(null, "HOLAAA"); break;
            case 2: JOptionPane.showMessageDialog(null, "ADIOSSS"); break;
            default:
                JOptionPane.showMessageDialog(null, "ADIOSSS");
                opcion=0;
                break;
        }
        }
    }
}
