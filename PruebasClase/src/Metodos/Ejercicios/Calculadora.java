package Metodos.Ejercicios;

import javax.swing.*;

public class Calculadora {

    int opcion;
    double n1, n2;

    public Calculadora() {
        menu();
    }

    public void menu() {
        System.out.println("Iniciando");

        opcion = Integer.parseInt(JOptionPane.showInputDialog("--------BIENVENIDO---------------\n\n" +
                "1.Sumar \n" +
                "2.Restar \n" +
                "3.Multiplicar \n" +
                "4.Dividir \n" +
                "5.Calcular modulo \n" +
                "Otro numero para salir \n\n" +
                "Elige una opcion por favor"));

        switch (opcion){
            case 1: sumarNum(); break;
            case 2: restarNum(); break;
            case 3: multiplicarNum(); break;
            case 4: dividirNum(); break;
            case 5: moduloNum(); break;
            default:
                JOptionPane.showMessageDialog(null, "Ayiossssss");
                break;
        }
    }

    public void solicitarDatos(){
        n1 = validarNegativos("Ingrese el primer numero");
        n2 = validarNegativos("Ingrese el segundo numero");
    }

    public double sumarNum(){
        solicitarDatos();
        double res = n1 + n2;
        mostrarMsj(res);
        return res;
    }

    public double restarNum(){
        solicitarDatos();
        double res = n1 - n2;
        mostrarMsj(res);
        return res;
    }

    public double multiplicarNum(){
        solicitarDatos();
        double res = n1 * n2;
        mostrarMsj(res);
        return res;
    }

    public double dividirNum(){
        double res;

        do {
        solicitarDatos();
            if (n1 == 0 || n2 == 0) {
                JOptionPane.showMessageDialog(null, "No se puede divir por 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while (n1 == 0 || n2 == 0);
        res = n1/n2;
        mostrarMsj(res);
        return res;
    }

    public double moduloNum(){
        solicitarDatos();
        double res = n1%n2;
        mostrarMsj(res);
        return res;
    }

    public void mostrarMsj(double num){
        String msj = "El resultado es: " + num;
        JOptionPane.showMessageDialog(null, msj);
    }

    public double validarNegativos(String msj){
        double dato;
        do {
            dato = Double.parseDouble(JOptionPane.showInputDialog(msj));
            if (dato<0){
                JOptionPane.showMessageDialog(null, "No se permiten datos negativos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while (dato<0);
        return dato;
    }

}
