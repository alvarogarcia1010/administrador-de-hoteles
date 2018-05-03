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
        System.out.println("3. Configuraciones");
        System.out.println("4. Salir");
    }
    
    public void opcionesMenuClientes(){
        System.out.println("----- Menu Clientes -----");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Modificar cliente");
        System.out.println("3. Eliminar cliente");
        System.out.println("4. Mostrar clientes");
        System.out.println("5. Atras");
    }
    
    public void opcionesMenuReservaciones(){
        System.out.println("----- Menu Reservaciones-----");
        System.out.println("1. Agregar reservacion");
        System.out.println("2. Modificar reservacion");
        System.out.println("3. Eliminar reservacion");
        System.out.println("4. Mostrar reservaciones por semana");  
        System.out.println("5. Atras");

    }
    
    public void opcionesMenuServicios(){
        System.out.println("----- Configuraciones -----");
        System.out.println("1. Habilitar/Deshabilitar habitacion");
        System.out.println("2. Habilitar/Deshabilitar piso");
        System.out.println("3. Modificar precio base de habitacion sencilla");
        System.out.println("4. Modificar precio base de habitacion doble");
        System.out.println("5. Agregar paquete");
        System.out.println("6. Modificar paquete");
        System.out.println("7. Eliminar paquete");
        System.out.println("8. Mostrar paquetes");
        System.out.println("9. Atras");
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
                                System.out.println("/* Registrar Cliente */");
                                break;
                            case 2:
                                /* Modificar Cliente */
                                System.out.println("/* Modificar Cliente */");
                                break;
                            case 3:
                                /* Eliminar Cliente */
                                System.out.println("/* Eliminar Cliente */");
                                break;
                            case 4:
                                /* Mostrar Clientes */
                                System.out.println("/* Mostrar Clientes */");
                                break;
                            case 5:
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
                                System.out.println("/* Agregar Reservacion */");
                                break;
                            case 2:
                                /* Modificar Reservacion */
                                System.out.println("/* Modificar Reservacion */");
                                break;
                            case 3:
                                /* Eliminar Reservacion */
                                System.out.println("/* Eliminar Reservacion */");
                                break;
                            case 4:
                                /* Mostrar reservaciones por semana */
                                System.out.println("/* Mostrar reservaciones por semana */");
                                break;
                            case 5:
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
                                System.out.println("/* Habilitar/Deshabilitar habitacion */");
                                break;
                            case 2:
                                /* Habilitar/Deshabilitar piso */
                                System.out.println("/* Habilitar/Deshabilitar piso */");
                                break;
                            case 3:
                                /* Modificar precio base de habitacion sencilla*/
                                System.out.println("/* Modificar precio base de habitacion sencilla */");
                                break;
                            case 4:
                                /* Modificar precio de habitacion doble */
                                System.out.println("/* Modificar precio base de habitacion doble */");
                                break;
                            case 5:
                                /* Agregar paquete */
                                System.out.println("/* Agregar paquete */");
                                break;
                            case 6:
                                /* Modificar paquete */
                                System.out.println("/* Modificar paquete */");
                                break;
                            case 7:
                                /* Eliminar paquete */
                                System.out.println("/* Eliminar paquete */");
                                break;
                            case 8:
                                /* Mostrar paquetes */
                                System.out.println("/* Mostrar paquetes */");
                                break;
                            case 9:
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
