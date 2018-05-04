package com.yonosek;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alvaro García <alvarogarcia1010 at github.com>
 */
public class AdministradorHotel {

    //Formato Moneda   
    static DecimalFormat formatoMoneda = new DecimalFormat("$ #.00");

    public static void main(String[] args) throws Exception {

        System.out.println("Administrador Hotel");

        Hotel villaRafinha = new Hotel(1, "VillaRafinha", 100, 150);

        Menu menu = Menu.getInstance();

        //MENU
        int opcion = 5;
        int opcionSec = 5;
        Scanner leer = new Scanner(System.in);

        while (opcion != 4) {
            menu.opcionesMenu(); //menu.opcionesMenu
            try {
                System.out.print("Elija opcion deseada: ");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("\n");
                        menu.opcionesMenuClientes(); //menu.menuClientes;
                        System.out.print("Elija opcion deseada: ");
                        opcionSec = leer.nextInt();
                        System.out.print("\n");
                        switch (opcionSec) {
                            case 1:
                                /* Registrar Cliente */
                                System.out.println("/* Registrar Cliente */");
                                villaRafinha.agregarCliente(crearCliente());
                                break;
                            case 2:
                                /* Modificar Cliente */
                                System.out.println("/* Modificar Cliente */");
                                break;
                            case 3:
                                /* Eliminar Cliente */
                                System.out.println("/* Eliminar Cliente */");
                                villaRafinha.buscarCliente();
                                //villaRafinha.removerCliente();
                                break;
                            case 4:
                                /* Mostrar Clientes */
                                System.out.println("/* Mostrar Clientes */");
                                villaRafinha.mostrarClientes();
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
                        menu.opcionesMenuReservaciones();
                        System.out.print("Elija opcion deseada: ");
                        opcionSec = leer.nextInt();
                        System.out.print("\n");
                        switch (opcionSec) {
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
                        menu.opcionesMenuServicios();
                        System.out.print("Elija opcion deseada: ");
                        opcionSec = leer.nextInt();
                        System.out.print("\n");
                        switch (opcionSec) {
                            case 1:
                                /* Habilitar habitacion */
                                System.out.println("Ingrese el numero de la habitacion: ");
                                //hablitarHabitacion(leer.nextLine());
                                break;
                            case 2:
                                /* Deshabilitar habitacion */
                                System.out.println("/* Deshabilitar habitacion */");
                                break;
                            case 3:
                                /* Habilitar piso */
                                System.out.println("/* Habilitar piso */");
                                break;
                            case 4:
                                /* Deshabilitar piso */
                                System.out.println("/* Deshabilitar piso */");
                                break;
                            case 5:
                                /* Modificar precio base de habitacion sencilla*/
                                //System.out.println("/* Modificar precio base de habitacion sencilla */");
                                System.out.println("Ingrese el precio sencillo: ");
                                villaRafinha.setPrecioBase(leer.nextFloat());
                                break;
                            case 6:
                                /* Modificar precio de habitacion doble */
                                //System.out.println("/* Modificar precio base de habitacion doble */");
                                System.out.println("Ingrese el precio de la habitacion doble: ");
                                villaRafinha.setPrecioDoble(leer.nextFloat());
                                break;
                            case 7:
                                /* Agregar paquete */
                                System.out.println("/* Agregar paquete */");
                                break;
                            case 8:
                                /* Modificar paquete */
                                System.out.println("/* Modificar paquete */");
                                break;
                            case 9:
                                /* Eliminar paquete */
                                System.out.println("/* Eliminar paquete */");
                                break;
                            case 10:
                                /* Mostrar paquetes */
                                System.out.println("/* Mostrar paquetes */");
                                break;
                            case 11:
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


    public Habitacion crearHabitacion() {

        Habitacion habitacion = new Habitacion();
        Scanner leer = new Scanner(System.in);
        try {
            System.out.println("Ingrese número de habitación: ");
            habitacion.setNumHab(leer.nextInt());
        } catch (InputMismatchException e) {
            //System.err.println("Por favor, ingrese un numero");
            leer.nextInt();
        }
//            habitacion.setPrecioHabitacion();
//            habitacion.setPiso();
        habitacion.generarCodigo();
        habitacion.asignarTipo();

        return habitacion;
    }

    public Piso crearPiso() {

        Piso piso = new Piso();

        return piso;
    }

    public Paquete crearPaquete() {

        Paquete paquete = new Paquete();

        return paquete;
    }

    public Reservacion crearReservacion() {

        Reservacion reservacion = new Reservacion();

        return reservacion;
    }

    public static Cliente crearCliente() {
        Cliente cliente = new Cliente();
        Scanner leer = new Scanner(System.in);
 
            System.out.println("Ingrese el DUI del cliente: ");
            cliente.setDUI(leer.nextLine());
            System.out.println("Ingrese el nombre del cliente: ");
            cliente.setNombre(leer.nextLine());
            System.out.println("Ingrese el apellido del cliente: ");
            cliente.setApellido(leer.nextLine());
            System.out.println("Ingrese el numero de Tarjeta: ");
            cliente.setNumTarjeta(leer.nextInt());
            try{
               System.out.println("Ingrese el codigo de la Tarjeta: ");
               cliente.setCodTarjeta(leer.nextInt());
            } catch (InputMismatchException e){
                System.out.println("Operacion no completada.");
                //cliente.remove();
            }  
        return cliente;
    }
    
    
}
