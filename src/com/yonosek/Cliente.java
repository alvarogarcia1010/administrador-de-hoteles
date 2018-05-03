/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yonosek;

import java.util.InputMismatchException;
import java.util.Scanner;

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
    
    public void mostrarCliente(){
        
    }
}
