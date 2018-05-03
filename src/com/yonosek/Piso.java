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
    private ArrayList <Habitacion> habitaciones;
    
    
    public Piso(){
        
    }
    
    public Piso(char codigo, Hotel hotel){
        this.habitaciones = new ArrayList<>();
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

}
