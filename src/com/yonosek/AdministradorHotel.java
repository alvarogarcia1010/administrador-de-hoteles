package com.yonosek;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alvaro García <alvarogarcia1010 at github.com>
 */
public class AdministradorHotel {

    //Formato Moneda   
    static DecimalFormat formatoMoneda = new DecimalFormat("$ #.00");

    public static void main(String[] args) throws Exception{

        System.out.println("Hotel Villa Rafinha");

        Hotel villaRafinha = new Hotel(1, "VillaRafinha", 100, 150);
        
        //Clientes      
        Cliente cliente1 = new Cliente("09789023-9", "Daniel Alberto", "Alcoleas", "1234567890123456", 990);
        Cliente cliente2 = new Cliente("67892738-9", "Juan Pablo", "Acosta", "1234542334489234", 356);
        Cliente cliente3 = new Cliente("45678987-9", "Raul David", "Yanes", "345678966792039", 789);
        Cliente cliente4 = new Cliente("67898778-9", "Alvaro Francisco", "Garcia", "567898790699", 567);
        villaRafinha.agregarCliente(cliente1);
        villaRafinha.agregarCliente(cliente2);
        villaRafinha.agregarCliente(cliente3);
        villaRafinha.agregarCliente(cliente4);

        //PARA PISOS
        
        //Creando objetos pisos
        Piso [] pisos = new Piso[6];
        for(int i=0 ; i<6; i++){
            pisos[i] = new Piso(Character.toString((char)(65+i)),villaRafinha,true);
        }
        //Agregando los pisos a Hotel
        for(int i=0 ; i<6; i++){
            villaRafinha.agregarPiso(pisos[i].getCodigo(), pisos[i]);
        }
        System.out.println("Pisos Ingresados");
        villaRafinha.mostrarPisoYHabitaciones();
        
        //PARA HABITACIONES
        
        //Creando objetos habitaciones
        Habitacion [][] habitaciones = new Habitacion [6][10];
        for(int i=0; i<6; i++){
            for(int j=0; j<10; j++){
                habitaciones[i][j] = new Habitacion(j,pisos[i],true, true);
                habitaciones[i][j].generarCodigo();
                habitaciones[i][j].asignarTipo();
                if ("Simple".equals(habitaciones[i][j].getTipoHabitacion())){
                    habitaciones[i][j].setPrecioHabitacion(villaRafinha.getPrecioSencillo());
                }else{
                    habitaciones[i][j].setPrecioHabitacion(villaRafinha.getPrecioDoble());
                }
            }
        }
        
        //Asignar habitaciones a Pisos
        for(int i=0; i<6; i++){
            for(int j=0; j<10; j++){
                pisos[i].agregarHabitacion(habitaciones[i][j].getCodigoHab(), habitaciones[i][j]);
            }
        }
        
        Paquete basico = new Paquete(1,10.00f,"Básico");
        basico.agregarServicio("Acceso a internet ilimitado");
        basico.agregarServicio("Acceso a piscina ilimitado");
        villaRafinha.agregarPaquete(1, basico);
        
        Paquete premium = new Paquete(2,150.00f,"Premium");
        premium.agregarServicio("Acceso a internet ilimitado");
        premium.agregarServicio("Acceso a piscina ilimitado");
        premium.agregarServicio("Acceso a bufet de desayuno");
        premium.agregarServicio("Acceso a minibar ilimitado");
        premium.agregarServicio("Servicio a la habitacion");
        villaRafinha.agregarPaquete(2, premium);
        
        villaRafinha.mostrarPaquetes();
        
        
        
        Menu menu = Menu.getInstance();

        //MENU
        int opcion = 7;
        int opcionSec = 5;
        int opcionMod = 0;
        Scanner leer = new Scanner(System.in);

        while (opcion != 6) {
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
                                System.out.println("/* Registro de Clientes */");
                                villaRafinha.agregarCliente(crearCliente());
                                break;
                            case 2:
                                /* Modificar Cliente */
                                System.out.println("/* Modificar Cliente */");
                                System.out.print("\n");
                                menu.opcionesModificarCliente(); //menu.menuClientes;
                                System.out.print("Elija opcion deseada: ");
                                opcionMod = leer.nextInt();
                                System.out.print("\n");
                                Cliente cliente = villaRafinha.buscarCliente();
                                villaRafinha.modificarCliente(cliente, opcionMod);
                                break;
                            case 3:
                                /* Eliminar Cliente */
                                System.out.println("/* Eliminar Cliente */");
                                cliente = villaRafinha.buscarCliente();
                                villaRafinha.removerCliente(cliente);
                                break;
                            case 4:
                                /* Mostrar Clientes */
                                System.out.println("/* Mostrar Clientes */");
                                System.out.printf("%-10s   ->       %-15s%-15s%-20s%-10s \n","DUI","NOMBRE","APELLIDO","NUM TARJETA", "CODIGO TARJETA" );

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
                                villaRafinha.agregarReservacion();
                                break;
                            case 2:
                                /* Modificar Reservacion */
                                System.out.println("/* Modificar Reservacion */");
                                System.out.print("\n");
                                menu.opcionesModificarReservacion();
                                System.out.print("Elija opcion deseada: ");
                                opcionMod = leer.nextInt();
                                System.out.print("\n");
                                
                                Reservacion reservacion = villaRafinha.buscarReservacion();
                                villaRafinha.modificarReservacion(reservacion, opcionMod);
                                break;
                            case 3:
                                /* Eliminar Reservacion */
                                System.out.println("/* Eliminar Reservacion */");
                                reservacion = villaRafinha.buscarReservacion();
                                villaRafinha.removerReservacion(reservacion);
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
                        menu.opcionesMenuPaquetes();
                        System.out.print("Elija opcion deseada: ");
                        opcionSec = leer.nextInt();
                        System.out.print("\n");
                        switch(opcionSec){
                            case 1:
                                /* Agregar paquete */
                                //System.out.println("Ingrese el codigo del paquete: ");
                                Paquete p = crearPaquete();
                                villaRafinha.agregarPaquete(p.getCodigoPaquete(),p);
                                break;
                            case 2:
                                /* Modificar paquete */
                                System.out.println("/* Modificar paquete */");
                                System.out.print("\n");
                                menu.opcionesModificarPaquete();
                                System.out.print("Elija opcion deseada: ");
                                opcionMod = leer.nextInt();
                                System.out.print("\n");
                                if(opcionMod == 4){
                                    break;
                                }                               
                                System.out.println("Ingrese el codigo del paquete: ");
                                int codigo = leer.nextInt();
                                villaRafinha.modificarPaquete(codigo, opcionMod);
                                break;                                
                            case 3:
                                /* Eliminar paquete */
                                System.out.println("/* Eliminar paquete */");
                                System.out.println("Ingrese el codigo del paquete: ");
                                villaRafinha.removerPaquete(leer.nextInt());
                                break;
                            case 4:
                                /* Mostrar paquetes */
                                System.out.println("/* Mostrar paquetes */");
                                System.out.println("CODIGO      NOMBRE      SERVICIOS       PRECIO");
                                villaRafinha.mostrarPaquetes();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Por favor ingrese una opcion valida");
                                System.out.print("\n");
                        }
                        
                        break;
                        
                    case 4:
                        System.out.print("\n");
                        menu.opcionesMantenimiento();
                        System.out.print("Elija opcion deseada: ");
                        opcionSec = leer.nextInt();
                        System.out.print("\n");
                        switch(opcionSec){
                             case 1:
                                /* Habilitar habitacion */
                                System.out.println("Ingrese el numero de la habitacion: ");
                                leer.nextLine();
                                villaRafinha.habilitarHabitacion(leer.nextLine());
                                break;
                            case 2:
                                /* Deshabilitar habitacion */
                                System.out.println("Ingrese el numero de la habitacion: ");
                                leer.nextLine();
                                villaRafinha.DeshabilitarHabitacion(leer.nextLine());
                                break;
                            case 3:
                                /* Habilitar piso */
                                System.out.println("Ingrese el codigo del piso: ");
                                leer.nextLine();
                                villaRafinha.habilitarPiso(leer.nextLine());
                                break;
                            case 4:
                                /* Deshabilitar piso */
                                System.out.println("Ingrese el codigo del piso: ");
                                leer.nextLine();
                                villaRafinha.DeshabilitarPiso(leer.nextLine());
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Por favor ingrese una opcion valida");
                                System.out.print("\n");
                        } 
                        break;
                        
                    case 5:
                        System.out.print("\n");
                        menu.opcionesMenuServicios();
                        System.out.print("Elija opcion deseada: ");
                        opcionSec = leer.nextInt();
                        System.out.print("\n");
                        switch (opcionSec) {
                            case 1:
                                /* Agregar Habitacion */
                                System.out.println("Agregar Habitacion");                                
                                break;
                                
                            case 2:
                                /* Eliminar Habitacion*/
                                System.out.println("Eliminar Habitacion");
                                //villaRafihna.eliminarHab;
                                break;
                                
                            case 3:
                                /* Agregar Piso */
                                System.out.println("Agregar Piso");
                                //villaRafinha.agregarPiso(clavePiso, piso);
                                break;
                            case 4:
                                /* Eliminar Piso */
                                System.out.println("Eliminar Piso");
                                //villaRafinha.elimanarPiso;
                                break;

                            case 5:
                                /* Modificar precio base de habitacion sencilla*/
                                //System.out.println("/* Modificar precio base de habitacion sencilla */");
                                System.out.println("Ingrese el precio sencillo: ");
                                villaRafinha.setPrecioSencillo(leer.nextFloat());
                                break;
                            case 6:
                                /* Modificar precio de habitacion doble */
                                //System.out.println("/* Modificar precio base de habitacion doble */");
                                System.out.println("Ingrese el precio de la habitacion doble: ");
                                villaRafinha.setPrecioDoble(leer.nextFloat());
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Por favor ingrese una opcion valida");
                                System.out.print("\n");
                        }
                        break;
                    case 6:
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
            System.out.print("Ingrese número de habitación: ");
            habitacion.setNumHab(leer.nextInt());
        } catch (InputMismatchException e) {
            System.err.print("Por favor, ingrese un numero");
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

    public static Paquete crearPaquete() {
        Paquete paquete = new Paquete();
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del paquete: ");
        paquete.setNombre(leer.nextLine());
        System.out.print("Ingrese el codigo del paquete: ");
        paquete.setCodigoPaquete(leer.nextInt());
        System.out.print("Ingrese el costo del paquete: ");
        paquete.setCostoPaquete(leer.nextFloat());
        System.out.print("Cuantos servicios desea ingresar: ");
        int x = leer.nextInt();
        leer.nextLine();
        for(int i=1;i<=x;i++){
        System.out.print("Ingrese los servicios del paquete: ");
        String m = leer.nextLine();
        paquete.agregarServicio(m);
        }
        
        return paquete;
    }

    public Reservacion crearReservacion() {

        Reservacion reservacion = new Reservacion();

        return reservacion;
    }
    
    

    public static Cliente crearCliente() {
        Cliente cliente = new Cliente();
        Scanner leer = new Scanner(System.in);
 
            System.out.print("Ingrese el DUI del cliente (00000000-0): ");
            cliente.setDUI(leer.nextLine());
            System.out.print("Ingrese el nombre del cliente: ");
            cliente.setNombre(leer.nextLine());
            System.out.print("Ingrese el apellido del cliente: ");
            cliente.setApellido(leer.nextLine());
            System.out.print("Ingrese el numero de Tarjeta: ");
            cliente.setNumTarjeta(leer.nextLine());
            try{
               System.out.print("Ingrese el codigo de la Tarjeta: ");
               cliente.setCodTarjeta(leer.nextInt());
            } catch (InputMismatchException e){
                System.out.print("Operacion no completada.");
                //cliente.remove();
            }  
        return cliente;
    }
     
}
