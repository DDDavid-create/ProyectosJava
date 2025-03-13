package Metodos.Prueba;

import javax.swing.*;

public class Procesos {
    //Variables globales para el programa
    int anio, dia, mes;
    int anioAct, mesAct, diaAct;

    public Procesos() {
        System.out.println("Iniciando programa"); //Solo es para garantizar que se conecta la clase principal con esta clase
        iniciar(); //Inicia el programa
    }

    //Linea que empieza el programa de acuerdo a una cantidad de veces
    public void iniciar(){
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de usuarios a calcular edad"));

        for (int i = 0; i<cant; i++){
            solicitarDatos();
            calcularEdad();
        }
    }

    public void solicitarDatos(){
        anioAct = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año actual"));
        mesAct  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes actual"));
        diaAct  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia actual"));

        int anioNac = validarNegativos("Ingrese el año de nacimieto");
        int mesNac = validarMeses();
        int diaNac = validarDias();

        //Formula para calcular los años, meses y dias del usuario
        anio = anioAct-anioNac;
        mes = mesAct-mesNac;
        dia = diaAct-diaNac;
    }

    public int validarNegativos(String msj){
        int dato;
        do {
            dato = Integer.parseInt(JOptionPane.showInputDialog(msj));
            if (dato<0){
                JOptionPane.showMessageDialog(null, "No se puede ingresar datos negativos");
            }
        }while (dato<0);
        return dato;
    }



    public int validarMeses(){
        int mes;

        do {
            mes = validarNegativos("Ingrese el mes de nacimiento");
            if (mes == 0 || mes > 12){
                JOptionPane.showMessageDialog(null, "Mes no válido");
            }
        }while (mes == 0 || mes > 12);
        return mes;
    }

    public int validarDias(){
        int dia;

        do {
            dia = validarNegativos("Ingrese su dia de nacimiento");
            if (dia == 0 || dia > 31){
                JOptionPane.showMessageDialog(null, "Dia no válido");
            }
        }while (dia == 0 || dia > 31);
        return dia;
    }

    public void calcularEdad(){
        if (anio>18){
            JOptionPane.showMessageDialog(null, "Usted es mayor de edad :D");
        } else if (anio == 18 && mes >=0) {
            JOptionPane.showMessageDialog(null, "Usted es mayor de edad :D");
        } else if (anio == 18 && mes == 0 && dia>=0) {
            JOptionPane.showMessageDialog(null, "Usted es mayor de edad :D");
        }else {
            JOptionPane.showMessageDialog(null, "Usted es menor de edad :((");
        }
    }
}
