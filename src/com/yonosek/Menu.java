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
        System.out.println("1. Habilitar habitacion");
        System.out.println("2. Deshabilitar habitacion");
        System.out.println("2. Habilitar piso");
        System.out.println("4. Deshabilitar piso ");
        System.out.println("5. Modificar precio base de habitacion sencilla");
        System.out.println("6. Modificar precio base de habitacion doble");
        System.out.println("7. Agregar paquete");
        System.out.println("8. Modificar paquete");
        System.out.println("9. Eliminar paquete");
        System.out.println("10. Mostrar paquetes");
        System.out.println("11. Atras");
    }

}
