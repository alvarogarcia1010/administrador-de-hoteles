package com.yonosek;

import java.util.*;


public class Paquete {
    private String servicioInicial;
    private int codigoPaquete;
    private ArrayList <String> servicios;
    private int costoPaquete;
    
    public Paquete(){
        
    }

    public Paquete(int codigoPaquete,  int costoPaquete, String servicioInicial) {
        this.servicios=new ArrayList<>();
        this.servicioInicial= servicioInicial;
        this.codigoPaquete = codigoPaquete;
        this.costoPaquete = costoPaquete;
    }
  
    public int getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(int codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
        
    }
    public String getServicioInicial(){
        return servicioInicial;
    }
    
    public void setServicioInicial(String servicioInicial){
        this.servicioInicial = servicioInicial;
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
                    throw new Exception("El servicio ya está registrado.");
                }
            }
        } else {
            throw new Exception("Operacion no completada: Servicio Nulo");
        }

    }
    
    public void modifyServicio(){
        
    }
    
    public void removerServicio(){
        
    }
    
    public void modificarPrecio(){
        
    }
    
    
}

