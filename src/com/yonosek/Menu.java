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
        System.out.println("1. Modificar paquete adquirido");
        System.out.println("2. Modificar total de dias");
    }
    
    public void opcionesMenuServicios(){
        System.out.println("----- Configuraciones -----");
        System.out.println("1. Habilitar habitacion");
        System.out.println("2. Deshabilitar habitacion");
        System.out.println("3. Agregar Habitacion");
        System.out.println("4. Elminar Habitacion");
        System.out.println("5. Agregar Piso");
        System.out.println("6. Elminar Piso");
        System.out.println("7. Habilitar piso");
        System.out.println("8. Deshabilitar piso ");
        System.out.println("9. Modificar precio base de habitacion sencilla");
        System.out.println("10. Modificar precio base de habitacion doble");
        System.out.println("11. Agregar paquete");
        System.out.println("12. Modificar paquete");
        System.out.println("13. Eliminar paquete");
        System.out.println("14. Mostrar paquetes");
        System.out.println("15. Atras");
    }

}
