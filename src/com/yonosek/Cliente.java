/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yonosek;

/**
 *
 * @author ryane
 */
public class Cliente extends Persona {
    String formaPago;
    int numTarjeta;
    int codTarjeta;
    Fecha fechaVencTarjeta;

    public Cliente(String formaPago, int numTarjeta, int codTarjeta, Fecha fechaVencTarjeta, String DUI, String nombre, String apellido) {
        super(DUI, nombre, apellido);
        this.formaPago = formaPago;
        this.numTarjeta = numTarjeta;
        this.codTarjeta = codTarjeta;
        this.fechaVencTarjeta = fechaVencTarjeta;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public int getCodTarjeta() {
        return codTarjeta;
    }

    public Fecha getFechaVencTarjeta() {
        return fechaVencTarjeta;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public void setCodTarjeta(int codTarjeta) {
        this.codTarjeta = codTarjeta;
    }

    public void setFechaVencTarjeta(Fecha fechaVencTarjeta) {
        this.fechaVencTarjeta = fechaVencTarjeta;
    }
    
    public void mostrarCliente(){
        
    }
    
    public void modificarCliente(){
        
    }
}
