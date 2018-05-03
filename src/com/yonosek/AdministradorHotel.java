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

    Hotel hotel = new Hotel(1,"hotel",100.00,150.00);

    return hotel;
    }
    
    
    public Habitacion crearHabitacion(){
        
        for (int i = 1; i <= 6 ; i++){
            for (int j = 1 ; j <=10 ; j++){
                //Habitacion var = new Habitacion(j,piso [i]);
            }
        }
        
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
   
}
