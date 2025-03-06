package EjerciciosCIclos;

import javax.swing.*;

public class A9 {
    public static void main(String[]arg){
        int n = 1, num = 5;
        int res;

        while (n<=10){
            res = n*num;
            String msj = num + " x " + n +" = " + res;
            JOptionPane.showMessageDialog(null, msj);
            n++;
        }
    }
}
