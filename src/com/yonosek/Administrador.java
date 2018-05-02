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
public class Administrador extends Persona {
    private String username;
    private String password;

    public Administrador(String username, String password, String DUI, String nombre, String apellido) {
        super(DUI, nombre, apellido);
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
