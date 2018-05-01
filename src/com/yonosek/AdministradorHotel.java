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
}
