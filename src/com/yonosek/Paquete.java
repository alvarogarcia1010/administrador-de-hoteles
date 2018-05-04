package com.yonosek;

import java.util.*;


public class Paquete {
    private String nombre;
    private int codigoPaquete;
    private ArrayList <String> servicios;
    private int costoPaquete;
    
    public Paquete(){
        
    }

    public Paquete(int codigoPaquete,  int costoPaquete, String nombre) {
        this.servicios=new ArrayList<>();
        this.nombre= nombre;
        this.codigoPaquete = codigoPaquete;
        this.costoPaquete = costoPaquete;
    }
  
    public int getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(int codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
        
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    

    public int getCostoPaquete() {
        return costoPaquete;
    }

    public void setCostoPaquete(int costoPaquete) {
        this.costoPaquete = costoPaquete;
    }
    
    /**
     * 
     * @param servicio 
     */
    
    public void mostrarServicio(){
        this.servicios.forEach((servicio) -> {
            System.out.println(servicio);
        });
    }
    
    public void agregarServicio(String servicio) throws Exception {
        boolean flag = false;
        if (servicio != null) {
            if (this.servicios.isEmpty()) {
                this.servicios.add(servicio);
            } else {
                for (String s : this.servicios) {
                    if (servicio.equals(s)) {
                        System.out.println("El Servicio ya está registrado.");
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    this.servicios.add(servicio);

                } else {
                    System.err.println("El servicio ya está registrado.");
                }
            }
        } else {
            System.err.println("Operacion no completada: Servicio Nulo");
        }

    }
    
    public void modifyServicio(){
        
    }
    
    public void removerServicio(String servicio) throws Exception{
        
    }
    
    public void modificarPrecio(){
        
    }
    
        @Override
    public String toString() {
        return "Paquete{" + "nombre=" + nombre + ", codigoPaquete=" + codigoPaquete + ", servicios=" + servicios + ", costoPaquete=" + costoPaquete + '}';
    }
    
    
}

