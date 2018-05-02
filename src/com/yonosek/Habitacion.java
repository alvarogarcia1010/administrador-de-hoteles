/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yonosek;

/**
 *
 * @author franc
 */
public class Habitacion {
    private int numHab;
    private Piso piso;
    private String codigoHab;
    private String tipoHabitacion;
    private float precioHabitacion;
    
    /** Asigna el tipo de la habitacion.
     *
     * @param numHab El numero de la habitacion.
     */
    public void asignarTipo(){
        if(this.numHab % 2 == 0){
            setTipoHabitacion("Doble");
        }
        else{
            setTipoHabitacion("Simple");
        }
    }
    
    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public Piso getPiso() {
        return piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }

    public String getCodigoHab() {
        return codigoHab;
    }

    public void setCodigoHab(String codigoHab) {
        this.codigoHab = codigoHab;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public float getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(float precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
    
    /**
     * 
     */
    public void generarCodigo(){
        
    }
    
}
