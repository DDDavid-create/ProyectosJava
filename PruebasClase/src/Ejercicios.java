import javax.swing.*;

public class Ejercicios {
     public static void main (String [] args){
         /*
          *Ejercio 2
         int a, b, c;

         a=8;
         b=2;
         c=-2;

         c=(a*b) + 2;
         a= a-2+b*(b+3)-c;
         b=c;

         JOptionPane.showMessageDialog(null, "El resultado de b: " + b);
          */

         /*
         * Ejercicio 3-4

         final int VALOR = 500;
         double calculo;

         calculo = VALOR * 0.15;
         System.out.println("Su resultado es: "+calculo);
         */

         //EJERCICIO 5
         /*
         double salario, calculo, salarioTotal;
         final double INCREMENTO = 0.25;

         salario=Double.parseDouble(JOptionPane.
                 showInputDialog("Ingrese su salario"));

         calculo = INCREMENTO * salario;
         salarioTotal = salario + calculo;

         String msj = "El salario con el aumento es de: "+salarioTotal;

         JOptionPane.showMessageDialog(null, msj);
         * */

         //EJERCICIO 6
         /*
         double salario, calculo, salarioTotal;
         int c_hrs;
         final double H_EXTRA = 3000;

         salario = Double.parseDouble(JOptionPane.
                 showInputDialog("Ingrese su salario"));
         c_hrs = Integer.parseInt(JOptionPane.
                 showInputDialog("Ingrese la cantidad de horas extras trabajadas"));

         calculo =  H_EXTRA * c_hrs;
         salarioTotal = salario + calculo;

         String msj = "Su salario es: " + salario + "\n";
         msj+= "Horas trabajadas: "+ c_hrs + "\n";
         msj+= "Su salario total es de: " + salarioTotal;

         JOptionPane.showMessageDialog(null, msj);
         */

         //EJERCICIO 7
         /*
         double costo_tratamiento, costo_medi;
         int dias_hosp;
         final double COSTO_DIA=100000;

         costo_tratamiento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del tratamiento"));
         dias_hosp = Integer.parseInt(JOptionPane.
                 showInputDialog("Ingrese la cantidad de días hospitalizado"));
         costo_medi = Double.parseDouble(JOptionPane.
                 showInputDialog("Ingrese el costo de los medicamentos"));

         double costo_dias = dias_hosp * COSTO_DIA;
         double totalPagar = costo_tratamiento + costo_dias + costo_medi;

         String msj = "El total a pagar es: " + totalPagar;
         JOptionPane.showMessageDialog(null, msj);
          */

         //EJERCICIO 8
         /*
         double base, altura, area;

         base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base"));
         altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"));

         area = (base * altura)/2;

         String msj = "El area del triangulo es de: " + area;
         JOptionPane.showMessageDialog(null,msj);
          */

         //EJERCICIO 9

         //EJERCCIO 10
         /*
         double n1, n2, n3, total;

         n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
         n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
         n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer numero"));

         total = n1 + n2 + n3;
         String msj = "El resultado total es "+ total;
         JOptionPane.showMessageDialog(null, msj);

          */

         //EJERCICIO 11

         //EJERCICIO EXTRA
         /*
         double vlr_hora = 2000, imp=0.10;
         double salarioActual;
         int hrs_trabajadas, id;

         String nombre = JOptionPane.showInputDialog("Ingrese su nombre");

         id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id"));

         hrs_trabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajadas"));

         salarioActual = hrs_trabajadas * vlr_hora;
         double descuento = (salarioActual * imp);
         double salarioTotal = salarioActual - descuento;

         String msj = "Nombre: " + nombre + "\n";
         msj+= "Id: " + id + "\n";
         msj+= "Salario: " + salarioActual + "\n";
         msj+= "Descuento: " + descuento+ "\n";
         msj+= "Total: " + salarioTotal + "\n";

         JOptionPane.showMessageDialog(null, msj);
          */

         //EJERCICIO 12
         /*
         double n1, n2, n3, promedio;

         n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la primera nota:"));
         n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la segundo nota:"));
         n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la tercera nota:"));

         promedio = (n1 + n2 + n3)/3;

         String msj = "El promedio de las 3 notas es: " + promedio;
         JOptionPane.showMessageDialog(null, msj);

          */

         //EJERCICIO 13
         /*
         String nombreCompleto, profesion, msj;
         int id, edad;

         nombreCompleto = JOptionPane.showInputDialog("Ingrese su nombre completo");
         id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su documento de identidad"));
         edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
         profesion = JOptionPane.showInputDialog("Ingrese su profesion");

         msj = "Datos ingresados:" + "\n";
         msj += "Nombre completo: "+ nombreCompleto + "\n";
         msj += "Documento: "+ id + "\n";
         msj += "Edad: "+ edad + "\n";
         msj += "Profesion: "+ profesion;

         JOptionPane.showMessageDialog(null, msj);

          */

         //EJERCICIO 16
         /*
         double precioArt, cantPago, cuenta, devuelta;
         int cantProd;
         String msj;

         JOptionPane.showMessageDialog(null, "----BIENVENIDO----");
         precioArt = Double.parseDouble(
                 JOptionPane.showInputDialog("Ingrese el precio del articulo"));
         cantProd = Integer.parseInt(
                 JOptionPane.showInputDialog("Ingrese la cantidad de producto"));
         cantPago = Double.parseDouble(
                 JOptionPane.showInputDialog("Ingrese el valor a cancelar"));

         cuenta = cantProd * precioArt;
         devuelta = cantPago-cuenta;

         msj = "";

         if (devuelta < 0){
             msj+= "Te falta dinero para cancelar";
         }else{
             msj+= "Todo correcto :D" + "\n";
             msj+= "Tu devuelta es:" + devuelta;
         }

         JOptionPane.showMessageDialog(null, msj);
          */

         //------EJERCICIOS ESTRUCTURAS DE CONTROL ---------------

         //EJERCICIO 1
         /*
         double salario;
         int c_hrs, cedula, cat;
         double vlrHora = 2000,
                 impuesto = 0.10,
                 calculoImpuesto,
                 calculoAumento = 0,
                 salarioTotal,
                 aumento = 0;
         double catA = 0.30, catB = 0.20, catC = 0.10;
         String nombre, msj, tipo = "";

         nombre = JOptionPane.showInputDialog("Ingrese su nombre");
         cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cedula"));
         cat = Integer.parseInt(
                 JOptionPane.showInputDialog("Ingrese su categoria:\n 1. A\n 2. B\n 3. C"));
         c_hrs = Integer.parseInt(JOptionPane.
                 showInputDialog("Ingrese la cantidad de horas trabajadas"));

         salario =  vlrHora * c_hrs;
         calculoImpuesto = salario - (salario * impuesto);

         //Switch para calcular el aumento de acuerdo a la categoria
         switch (cat){
             case 1: calculoAumento = calculoImpuesto *  catA; break;
             case 2: calculoAumento = calculoImpuesto *  catB; break;
             case 3: calculoAumento = calculoImpuesto *  catC; break;
             default:
         };

         //Switch para determinar qué aumento mostrar
         switch (cat){
             case 1: aumento = catA * 100; break;
             case 2: aumento = catB * 100; break;
             case 3: aumento = catC * 100; break;
             default:
         }

         //Switch para determinar que categoría mostrar
         switch (cat){
             case 1: tipo = "A"; break;
             case 2: tipo = "B"; break;
             case 3: tipo = "C"; break;
             default:
         }

         salarioTotal = calculoImpuesto + calculoAumento;

         msj = "Cedula: "+ cedula +"\n";
         msj += "Nombre: "+ nombre +"\n";
         msj += "Tipo: "+ tipo +"\n";
         msj += "Aumento: "+ aumento +"%"+"\n";
         msj += "Salario Anterior: "+ salario + "\n";
         msj += "Salario Final: "+salarioTotal;

         JOptionPane.showMessageDialog(null, msj);

          */
     }
}
