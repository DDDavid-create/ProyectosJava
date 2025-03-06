package EjerciciosCIclos;

import javax.swing.*;

public class A6 {
    public static void main(String[] arg){
        int num;
        String msj = "Resultado: \n";

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: (0. CANCELAR)"));
            msj+= num + "\n";
        }while (num!=0);
        JOptionPane.showMessageDialog(null, msj);
    }
}
