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
public class Persona {
    private String DUI;
    private String nombre;
    private String apellido;
    
     public Persona(String DUI, String nombre, String apellido) {
        this.DUI = DUI;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    
    public void modificarPersona(){
        
    }
}
