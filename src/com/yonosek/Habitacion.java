/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yonosek;

import java.util.Objects;

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
    private boolean estaHabilitada;
    private boolean estaDisponible;
    
    public Habitacion(){
        
    }

    public boolean isEstaHabilitada() {
        return estaHabilitada;
    }

    public void setEstaHabilitada(boolean estaHabilitada) {
        this.estaHabilitada = estaHabilitada;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }
    
    
    public Habitacion(int numHab, Piso piso, String tipoHabitacion, float precioHabitacion){
        this.numHab = numHab;
        this.piso = piso;
        this.tipoHabitacion = tipoHabitacion;
        this.precioHabitacion = precioHabitacion;
        
    }
    
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.codigoHab);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Habitacion other = (Habitacion) obj;
        if (this.numHab != other.numHab) {
            return false;
        }
        if (!Objects.equals(this.codigoHab, other.codigoHab)) {
            return false;
        }
        return true;
    }
    
    
    /**
     * 
     */
    
    /*
    public void generarCodigo(){
        this.codigoHab = this.piso.getCodigo() + this.numHab;
    }
    */
}
