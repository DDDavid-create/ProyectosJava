package EjerciciosCIclos;

import javax.swing.*;

public class A5 {
    public static void main(String[] arg){
        int n;
        String msj = "Resultado: \n";
        for (n=1;n<=20;n++){
            if (n % 2 != 0){
                msj+= n + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, msj);
    }
}
