package PruebaSimulacro;

import javax.swing.*;

public class E1 {
    public static void main(String[] arg){
        int n_dias_hosp, cant_pacientes = 0;
        int opcion_u;
        double c_trat, c_medi, c_dia_hosp = 100000;
        double costo_total_dias_h;
        double total_pagar = 0;

        do {
            n_dias_hosp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dias hospitalzados"));
            c_trat = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del tratamiento"));
            c_medi = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del medicamento"));

            if (n_dias_hosp > 0 && c_trat > 0 && c_medi > 0){
                costo_total_dias_h = n_dias_hosp * c_dia_hosp;
                total_pagar += costo_total_dias_h + c_trat + c_medi;

                cant_pacientes++;
            }else{
                JOptionPane.showMessageDialog(null, "NO SE PERMITEN DATOS NEGATIOS");
            }
            opcion_u = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n\n 0.SALIR \n1.INGRESAR NUEVO PACIENTE"));
        }while (opcion_u!=0);
        String msj = "TOTAL A PAGAR: $" + total_pagar;
        msj+= "\nCantidad de pacientes procesados: "+ cant_pacientes;
        JOptionPane.showMessageDialog(null, msj);


    }
}
