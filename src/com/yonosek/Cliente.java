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
    private int numTarjeta;
    private int codTarjeta;
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

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public int getCodTarjeta() {
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

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public void setCodTarjeta(int codTarjeta) {
        this.codTarjeta = codTarjeta;
    }
    
    public void setPagoCash(String PagoCash) {
        this.PagoCash = PagoCash;
    }

    //public void setFechaVencTarjeta(Fecha fechaVencTarjeta) {
        //this.fechaVencTarjeta = fechaVencTarjeta;}


    @Override
    public String toString() {
        return "Cliente{" + "DUI=" + DUI + ", nombre=" + nombre + ", apellido=" + apellido + ", numTarjeta=" + numTarjeta + ", codTarjeta=" + codTarjeta + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.DUI);
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
        return true;
    }
    
    
    

}
