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
    protected TreeMap<String, Habitacion> habitacionesPiso;
    private boolean estaHabilitada;

    
    public Piso(){
        this.habitacionesPiso = new TreeMap<>();
    }
    
    public boolean isEstaHabilitada() {
        return estaHabilitada;
    }

    public void setEstaHabilitada(boolean estaHabilitada) {
        this.estaHabilitada = estaHabilitada;
    }
    
    public Piso(char codigo, Hotel hotel){
        this.habitacionesPiso = new TreeMap<>();
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
            System.err.println("La habitacion ya se encuentra registrado");
        }
    }

    /**
     *
     * @param claveHabitacion
     */
    public void removerHabitacion(String claveHabitacion) {
        if (this.habitacionesPiso.containsKey(claveHabitacion)) {
            this.habitacionesPiso.remove(claveHabitacion);
        } 
        else {
            System.err.println("No hay registros de la habitacion");
        }
    }

    /**
     *
     * @param claveHabitacion
     */

    /**
     *
     */
    public void mostrarHabitacion() {
        for (Map.Entry <String, Habitacion> habitacion : this.habitacionesPiso.entrySet()) {
            String clave = habitacion.getKey();
            Habitacion valor = habitacion.getValue();
            System.out.println(clave + "  ->  " + valor.toString());
        }
    }
}
