/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yonosek;

import java.util.Objects;

/**
 *
 * @author ryane
 */
public class Cliente{
    private String DUI;
    private String nombre;
    private String apellido;
    private String formaPago;
    private String numTarjeta;
    private String codTarjeta;
    private String PagoCash;
    //private Fecha fechaVencTarjeta;

    public Cliente(){
    }

    public String getDUI() {
        return DUI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public String getCodTarjeta() {
        return codTarjeta;
    }
    
    public String getPagoCash() {
        return PagoCash;
    }

    //public Fecha getFechaVencTarjeta() {
        //return fechaVencTarjeta;}

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public void setCodTarjeta(String codTarjeta) {
        this.codTarjeta = codTarjeta;
    }
    
    public void setPagoCash(String PagoCash) {
        this.PagoCash = PagoCash;
    }

    //public void setFechaVencTarjeta(Fecha fechaVencTarjeta) {
        //this.fechaVencTarjeta = fechaVencTarjeta;}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.DUI);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.apellido);
        hash = 79 * hash + Objects.hashCode(this.numTarjeta);
        hash = 79 * hash + Objects.hashCode(this.codTarjeta);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.DUI, other.DUI)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.numTarjeta, other.numTarjeta)) {
            return false;
        }
        if (!Objects.equals(this.codTarjeta, other.codTarjeta)) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "Cliente{" + "DUI=" + DUI + ", nombre=" + nombre + ", apellido=" + apellido + ", formaPago=" + formaPago + ", numTarjeta=" + numTarjeta + ", codTarjeta=" + codTarjeta + '}';
    }
    
    
    

}
