import javax.swing.*;
import java.util.Scanner;

public class EjemploEntrada {
    public static void main (String[] args){

        JOptionPane.showMessageDialog(null, "Hola a todos");
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));

        String msj = "Hola "+ nombre + ", su edad es: " + edad;
        JOptionPane.showMessageDialog(null, msj);

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        nombre=in.next();
        System.out.println("Hola "+nombre);
        System.out.print("Ingrese su edad:");
        edad=Integer.parseInt(in.next());
        System.out.println("Su edad es: "+edad);
    }
}
