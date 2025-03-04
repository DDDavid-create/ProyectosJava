package Actividades;

import javax.swing.*;

public class EjercicioCiclos {
    public static void main (String [] arg){
        /*
        * RERGLAS:
        * - Deben ser finitos, garantizar que finalice. Para garantizarlo, existe la condicion de parada, un ciclo se repite, cuando la condicion da true y finaliza cuando sea false
        * */

        int opcionUsuario = 0, opcionMenuTipico = 0, opcionMenuCarta = 0, opcionMenuInter = 0;
        int cantPlatos = 0, cantPlatoTipico = 0, cantPlatoCarta = 0, cantPlatoInter = 0 ;
        double cuenta = 0;

        String nombreUsuario = JOptionPane.showInputDialog("Ingresa tu nombre de usuario");

        do {
            String menu = "MENU RESTAURANTE \n\n";
            menu += "1. Plato típico \n";
            menu += "2. Plato a la carta \n";
            menu += "3. Plato Internacional \n";
            menu += "4. Salir \n\n";
            menu += "Por favor seleccione una opcion \n";
            opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcionUsuario){
                case 1:
                    do {
                        String menuTipico = "MENU TIPICO\n";
                        menuTipico+= "1. Frijoles \n";
                        menuTipico+= "2. Sopa de verduras \n";
                        menuTipico+= "3. Regresar \n\n";
                        menuTipico+= "Por favor seleccione una opción\n";

                        opcionMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));
                        switch (opcionMenuTipico){
                            case 1:
                                JOptionPane.showMessageDialog(null, "Has seleccionado un plato de frijoles. El costo es de: $" + 12000);
                                cantPlatoTipico+=1;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Has seleccionado un plato de sopa de verduras. El costo es de: $" + 8000);
                                cantPlatoTipico+=1;
                                break;
                            case 3:

                                break;
                            default: JOptionPane.showMessageDialog(null, "No corresponde a un código valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE); break;
                        }
                        opcionMenuTipico = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1 si desea repetir el menú anterior, de lo contrario será enviado al menú principal"));

                        if (opcionMenuTipico != 1){
                            opcionMenuTipico = 3;
                        }
                    }while (opcionMenuTipico !=3);
                    break;

                case 2:
                    do {
                        String menuCarta = "MENU CARTA\n";
                        menuCarta+= "1. Churrasco \n";
                        menuCarta+= "2. Baby Beef \n";
                        menuCarta+= "3. Regresar \n\n";
                        menuCarta+= "Por favor selecciona una opción \n";

                        opcionMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));
                        switch (opcionMenuCarta){
                            case 1:
                                JOptionPane.showMessageDialog(null, "Has seleccionado un Churrasco. El costo es de: $" + 32000);
                                cantPlatoCarta+=1;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Has seleccionado un Baby Beef. El costo es de: $" + 40000);
                                cantPlatoCarta+=1;
                                break;
                            case 3:

                                break;
                            default: JOptionPane.showMessageDialog(null, "No corresponde a un código valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE); break;
                        }
                        opcionMenuCarta = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1 si desea repetir el menú anterior, de lo contrario será enviado al menú principal"));

                        if (opcionMenuCarta != 1){
                            opcionMenuCarta = 3;
                        }
                    }while (opcionMenuCarta !=3);
                    break;
                case 3:
                    do {
                        String menuInter = "MENU INTER\n";
                        menuInter+= "1. Pulpo en salsa \n";
                        menuInter+= "2. Arroz con pollo \n";
                        menuInter+= "3. Regresar \n\n";
                        menuInter+= "Por favor seleccione una opción \n";

                        opcionMenuInter = Integer.parseInt(JOptionPane.showInputDialog(menuInter));
                        switch (opcionMenuInter){
                            case 1:
                                JOptionPane.showMessageDialog(null, "Has seleccionado un Pulpo en salsa. El costo es de: $" + 50000);
                                cantPlatoInter+=1;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Has seleccionado un Arroz con pollo. El costo es de: $" + 40000);
                                cantPlatoInter+=1;
                                break;
                            case 3:

                                break;
                            default: JOptionPane.showMessageDialog(null, "No corresponde a un código valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE); break;
                        }
                        opcionMenuInter = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1 si desea repetir el menú anterior, de lo contrario será enviado al menú principal"));

                        if (opcionMenuInter != 1){
                            opcionMenuInter = 3;
                        }
                    }while (opcionMenuInter !=3);
                    break;
                case 4:

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }
        while (opcionUsuario!=4);

        cantPlatos+= cantPlatoTipico + cantPlatoCarta + cantPlatoInter;

        String msj = "FACTURA\n\n";
        msj+= "Nombre: " + nombreUsuario + "\n";
        msj+= "Cantidad platos tipicos: " + cantPlatoTipico + "\n";
        msj+= "Cantidad platos a la carta: " + cantPlatoCarta + "\n";
        msj+= "Cantidad platos internacionales: " + cantPlatoInter + "\n";
        msj+= "Cantidad platos procesados: " + cantPlatos + "\n";

        JOptionPane.showMessageDialog(null, msj);
    }
}
