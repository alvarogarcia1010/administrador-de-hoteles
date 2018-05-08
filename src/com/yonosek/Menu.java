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
        System.out.println("3. Administrar paquetes");
        System.out.println("4. Mantenimiento");
        System.out.println("5. Configuraciones");
        System.out.println("6. Salir");
    }
    
    public void opcionesMenuPaquetes(){
        System.out.println("----- Menu Paquetes -----");
        System.out.println("1. Agregar paquete");
        System.out.println("2. Modificar paquete");
        System.out.println("3. Eliminar paquete");
        System.out.println("4. Mostrar paquetes");
        System.out.println("5. Atras");
    }
    
    public void opcionesModificarPaquete(){
        System.out.println("----- Menu Modificar Paquete -----");
        System.out.println("1. Modificar precio base");
        System.out.println("2. Agregar Servicio");
        System.out.println("3. Eliminar Servicio");
        System.out.println("4. Atras");
    }
    
    public void opcionesMantenimiento(){
        System.out.println("----- Mantenimiento -----");
        System.out.println("1. Habilitar habitacion");
        System.out.println("2. Deshabilitar habitacion");
        System.out.println("3. Habilitar piso");
        System.out.println("4. Deshabilitar piso ");
        System.out.println("5. Atras");
        
    }
    
    public void opcionesMenuClientes(){
        System.out.println("----- Menu Clientes -----");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Modificar cliente");
        System.out.println("3. Eliminar cliente");
        System.out.println("4. Mostrar clientes");
        System.out.println("5. Atras");
    }
    
    public void opcionesModificarCliente(){
        System.out.println("----- Menu Modificar Clientes -----");
        System.out.println("1. Modificar nombre");
        System.out.println("2. Modificar apellido");
        System.out.println("3. Modificar numero de tarjeta");
        System.out.println("4. Modificar codigo de tarjeta");        
    }
    
    public void opcionesMenuReservaciones(){
        System.out.println("----- Menu Reservaciones-----");
        System.out.println("1. Agregar reservacion");
        System.out.println("2. Modificar reservacion");
        System.out.println("3. Eliminar reservacion");
        System.out.println("4. Mostrar reservaciones por semana");  
        System.out.println("5. Atras");

    }
    
    public void opcionesModificarReservacion(){
        System.out.println("----- Menu Modificar Reservacion -----");
        System.out.println("1. Cambiar paquete adquirido");
        System.out.println("2. Modificar total de dias");
    }
    
    public void opcionesMenuServicios(){
        System.out.println("----- Configuraciones -----");
        System.out.println("1. Agregar Habitacion");
        System.out.println("2. Eliminar Habitacion");
        System.out.println("3. Mostrar Precio Habitacion");
        System.out.println("4. Agregar Piso");
        System.out.println("5. Eliminar Piso");
        System.out.println("6. Modificar precio base de habitacion sencilla");
        System.out.println("7. Modificar precio base de habitacion doble");
        System.out.println("8. Finalizar Reservacion");
        System.out.println("9. Atras");
    }
}
