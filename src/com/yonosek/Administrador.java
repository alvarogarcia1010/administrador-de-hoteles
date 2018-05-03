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
public class Administrador extends Cliente {
    private String username;
    private String password;
    //private String DUI;
    //private String nombre;
    //private String apellido;

    public Administrador(String username, String password, String DUI, String nombre, String apellido, String formaPago, int numTarjeta, int codTarjeta, Fecha fechaVencTarjeta) {
        super(DUI, nombre, apellido, formaPago, numTarjeta, codTarjeta, fechaVencTarjeta);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void changePassword(){
        
    }
    
    public void changeUsername(){
        
    }
}
