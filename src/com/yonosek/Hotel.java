package com.yonosek;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Alvaro García <alvarogarcia1010 at github.com>
 */
public class Hotel {
    private int idHotel;
    private String nombreHotel;
    private float precioBase;
    private ArrayList<Paquete> clientesHotel;
    private HashMap<String, Paquete> pisosHotel;
    private HashMap<Integer, Paquete> habitacionesHotel;
    private HashMap<Integer, Paquete> paquetesHotel;
    
    /**Constructor Vacio*/
    public Hotel(){
        this.clientesHotel = new ArrayList<>();
        this.pisosHotel = new HashMap<>();
        this.habitacionesHotel = new HashMap<>();
        this.paquetesHotel = new HashMap<>();
    }
    
    /**
     * Constructor General
     * @param idHotel
     * @param nombreHotel
     * @param precioBase 
     */
    public Hotel(int idHotel, String nombreHotel, float precioBase) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        this.precioBase = precioBase;
        this.clientesHotel = new ArrayList<>();
        this.pisosHotel = new HashMap<>();
        this.habitacionesHotel = new HashMap<>();
        this.paquetesHotel = new HashMap<>();
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

}
