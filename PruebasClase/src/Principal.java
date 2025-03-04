import javax.swing.*;

public class Principal {
    public static void main (String arg[]){
        //La proxima linea es para imprimir una cadena
        String nombre=JOptionPane.
                showInputDialog("Ingrese su nombre, so zorrita");
        System.out.println("Hola, "+nombre);

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad, sapito:"));
        System.out.println("Tu edad es: "+ edad);

        //La proxima es un operador relacional simple
        boolean valida=5<edad;
        System.out.println("Su resultado es: "+valida);

        //La proxima es para operadores logicos
        boolean valida2=(edad<5) && (2<6) && (12<6);
        System.out.println("Su resultado es: "+valida2);

        /*
        * Algoritmo para validar si una persona pueda entrar a una discoteca teniendo en cuenta si es mayor de edad
        * Si la persona presenta la cédula puede entrar
        * */
        int edad2 = Integer.parseInt(JOptionPane.
                showInputDialog("Ingrese su edad"));

        int cedula=Integer.parseInt(JOptionPane.
                showInputDialog("Tiene cedula?: 1=Si 2=No"));

        if (edad2>=18 && cedula==1){
            System.out.println("La persona es mayor y puede ingresar");
        } else{
            System.out.println("Ternurita, no puedes ingresar");
        }
    }
}