import javax.swing.*;

public class Secundario {
    public static void main (String arg[]){
        /*
        *La tienda "Mis Zapatos"

        double compra,desc;
        double valorPago;
        final double PORC_DESCUENTO = 0.10;

        compra = Double.parseDouble(JOptionPane.
                showInputDialog("Ingrese el valor de la compra :D"));

        if (compra > 100000){
            //Tiene descuento
            desc = compra * PORC_DESCUENTO;
        }else{
            //No tiene descuento
            desc = 0;
        }
        valorPago = compra-desc;

        System.out.println("Su descuento es de: "+desc);
        System.out.println("Su valor a pagar es de: "+valorPago);

         */

        /*
        * Calcule y solicite el nombre y la materia de un estudiante, asi como 3 notas parciales y con esto calcule el promedio de notas, valide que si el estudiante saca un promedio menor que 3.5 indique que el estudiante perdió la materia.
        * El mensaje debe mencionar el nombre y la materia del estudiante*/

        String nombre, materia, mensaje;
        double nota1, nota2, nota3;
        double promedio;

        //Entradas de datos
        nombre = JOptionPane.
                showInputDialog("Ingrese su nombre");
        materia = JOptionPane.
                showInputDialog("Ingrese la materia");

        nota1 = Double.parseDouble(JOptionPane.
                showInputDialog("Ingrese la nota 1"));
        nota2 = Double.parseDouble(JOptionPane.
                showInputDialog("Ingrese la nota 2"));
        nota3 = Double.parseDouble(JOptionPane.
                showInputDialog("Ingrese la nota 3"));

        //Funcion para sacar promedio
        promedio = (nota1 + nota2 + nota3)/3;

        //Mensaje de salida
        mensaje = "Su promedio es: "+ promedio + "\n";
        mensaje+= "Nombre: " + nombre + "\n";
        mensaje+= "Materia: " + materia + "\n";

        JOptionPane.showMessageDialog(null, mensaje);

        //Estructura de control
        if (promedio<3.5){
            JOptionPane.showMessageDialog(null, "Perdiste la materia");
        }else{
            JOptionPane.showMessageDialog(null, "Ganaste la materia");
        }

    }
}