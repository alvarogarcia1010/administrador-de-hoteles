package com.yonosek;

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
        System.out.println("1. Administrar clientes");
        System.out.println("2. Administrar reservaciones");
        System.out.println("3. Administrar servicios");
        System.out.println("4. Salir");
    }
    
    public void opcionesMenuClientes(){
        System.out.println("----- Menu -----");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Mostrar clientes");
    }
    
    public void opcionesMenuReservaciones(){
        System.out.println("----- Menu -----");
        System.out.println("1. Agregar reservacion");
        System.out.println("2. Modificar reservacion");
        System.out.println("3. Eliminar reservacion");
        System.out.println("4. Mostrar reservaciones por semana");   
    }
    
    public void opcionesMenuServicios(){
        System.out.println("----- Menu -----");
        System.out.println("1. Habilitar/Deshabilitar habitacion");
        System.out.println("2. Habilitar/Deshabilitar piso");
        System.out.println("3. Modificar precio base de habitacion");
        System.out.println("4. Agregar paquete");
        System.out.println("5. Modificar paquete");
        System.out.println("6. Eliminar paquete");
    }

    public void mostrar() {
        int opcion = 5;
        int opcionSec = 5;
        Scanner leer = new Scanner(System.in);

        while (opcion != 4) {
            opcionesMenu();
            try {
                System.out.print("Elija opcion deseada: ");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("\n");
                        opcionesMenuClientes();
                        System.out.print("Elija opcion deseada: ");
                        opcionSec = leer.nextInt();
                        System.out.print("\n");
                        switch (opcionSec) {
                            case 1:
                                /* Registrar Cliente */
                                break;
                            case 2:
                                /* Mostrar Clientes */
                                break;
                            default:
                                System.out.println("Por favor ingrese una opcion valida");
                                System.out.print("\n");
                        }
                        break;
                    case 2:
                        System.out.print("\n");
                        opcionesMenuReservaciones();
                        System.out.print("Elija opcion deseada: ");
                        opcionSec = leer.nextInt();
                        System.out.print("\n");
                        switch(opcionSec){
                            case 1:
                                /* Agregar Reservacion */
                                break;
                            case 2:
                                /* Modificar Reservacion */
                                break;
                            case 3:
                                /* Eliminar Reservacion */
                                break;
                            case 4:
                                /* Mostrar reservaciones por semana */
                                break;
                            default:
                                System.out.println("Por favor ingrese una opcion valida");
                                System.out.print("\n");
                        }
                        break;
                    case 3:
                        System.out.print("\n");
                        opcionesMenuServicios();
                        System.out.print("Elija opcion deseada: ");
                        opcionSec = leer.nextInt();
                        System.out.print("\n");
                        switch(opcionSec){
                            case 1:
                                /* Habilitar/Deshabilitar habitacion */
                                break;
                            case 2:
                                /* Habilitar/Deshabilitar piso */
                                break;
                            case 3:
                                /* Modificar precio base de habitacion */
                                break;
                            case 4:
                                /* Agregar paquete */
                                break;
                            case 5:
                                /* Modificar paquete */
                                break;
                            case 6:
                                /* Eliminar paquete */
                                break;    
                            default:
                                System.out.println("Por favor ingrese una opcion valida");
                                System.out.print("\n");
                        }
                        break;
                    case 4:
                        System.out.print("\n");
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                        System.out.print("\n");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un numero");
                leer.nextLine();
            }
        }
    }
}
