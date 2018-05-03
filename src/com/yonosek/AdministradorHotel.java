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
    



    public static void main(String[] args) {
        System.out.println("Administrador Hotel!!!");
        
        Menu menu = Menu.getInstance();
       
        menu.mostrar();
                
        
    }
    
    public Hotel crearHotel(){

    Hotel avergers = new Hotel(1,"avergers",100.00,150.00);

    return avergers;
    }
    
    
    public Habitacion crearHabitacion(){
        
        Habitacion habitacion = new Habitacion();
        Scanner leer = new Scanner(System.in);
        try{
            System.out.println("Ingrese número de habitación: ");
            habitacion.setNumHab(leer.nextInt());
        } catch(InputMismatchException e){
            System.err.println("Por favor, ingrese un numero");
            leer.nextInt();
        }
//            habitacion.setPrecioHabitacion();
//            habitacion.setPiso();
            habitacion.generarCodigo();
            habitacion.asignarTipo();
            
        return habitacion;
    }
    
    public Piso crearPiso(){
        
        Piso piso = new Piso();
        
        return piso;
    }
        
    public Paquete crearPaquete(){
        
        Paquete paquete = new Paquete();
        
        return paquete;
    }
        
    public Reservacion crearReservacion(){

    Reservacion reservacion = new Reservacion();

    return reservacion;
    }
    
    public Cliente crearCliente(){
        Cliente cliente = new Cliente();
        Scanner leer = new Scanner(System.in);
        try{
            System.out.println("Ingrese el DUI del cliente: ");
            cliente.setDUI(leer.nextLine());
            System.out.println("Ingrese el nombre del cliente: ");
            cliente.setNombre(leer.nextLine());
            System.out.println("Ingrese el apellido del cliente: ");
            cliente.setApellido(leer.nextLine());
            System.out.println("Ingrese la forma de pago(1.Tarjeta 2.Efectivo: )");
            if(leer.nextInt()==1){
                System.out.println("Ingrese el numero de Tarjeta: ");
                cliente.setNumTarjeta(leer.nextLine());
                System.out.println("Ingrese el codigo de la Tarjeta: ");
                cliente.setCodTarjeta(leer.nextLine());
            }else{
                System.out.println("Ingrese el monto a pagar: ");
                cliente.setPagoCash(leer.nextLine());
            }
            } catch(InputMismatchException e) {
                System.err.println("Por favor, ingrese un numero");
                leer.nextInt();
            }
        
        //cliente.mostrarCliente();
        
        return cliente;
     
    }
}
