/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yonosek;

import java.util.*;

/**
 *
 * @author franc
 */
public class Piso {
    private char codigo;
    private Hotel hotel;
    private HashMap<String, Habitacion> habitacionesPiso;

    
    
    public Piso(){
        this.habitacionesPiso = new HashMap<>();
    }
    
    public Piso(char codigo, Hotel hotel){
        this.habitacionesPiso = new HashMap<>();
        this.codigo = codigo;
        this.hotel = hotel;
    }

    public char getCodigo() {
        return codigo;
    }

    public void setCodigo(char codigo) {
        this.codigo = codigo;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

        //PARA MANEJAR HABITACIONES
    /**
     *
     * @param claveHabitacion
     * @param habitacion
     * @throws java.lang.Exception
     */
    public void agregarHabitacion(String claveHabitacion, Habitacion habitacion) throws Exception {
        if (!this.habitacionesPiso.containsKey(claveHabitacion)){
            this.habitacionesPiso.put(claveHabitacion, habitacion);
        }else{
            throw new Exception("La habitacion ya se encuentra registrado");
        }
    }

    /**
     *
     * @param claveHabitacion
     */
    public void removerHabitacion(String claveHabitacion) {

    }

    /**
     *
     * @param claveHabitacion
     */
    public void modificarHabitacion(String claveHabitacion) {

    }
}
