package com.yonosek;

import static com.yonosek.AdministradorHotel.formatoMoneda;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alvaro García <alvarogarcia1010 at github.com>
 */
public class Menu {

    private static Menu menu;

    private Menu() {}

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void opcionesMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Opcion Uno");
        System.out.println("2. Opcion Dos");
        System.out.println("3. Salir");
    }

    public void mostrar() {
        int opcion = 4;
        Scanner leer = new Scanner(System.in);

        while (opcion != 3) {
            opcionesMenu();
            try {
                System.out.print("Elija opcion deseada: ");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        float numero1 = 3.3f;
                        System.out.println(formatoMoneda.format(numero1)); // Resultado => 3,30
                        break;
                    case 2:
                        double numero2 = 3.33333d;
                        System.out.println(formatoMoneda.format(numero2)); // Resultado => 3,30
                        break;
                    case 3:
                        System.out.println("Adios :(");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número");
                leer.nextLine();
            }
        }
    }
}
