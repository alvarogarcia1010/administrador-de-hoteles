package com.yonosek;

import java.util.ArrayList;


public class Paquete {
    private int codigoPaquete;
    private ArrayList <String> servicio;
    private int costoPaquete;
    
    public Paquete(){
        
    }

    public Paquete(int codigoPaquete,  int costoPaquete) {
        this.servicio=new ArrayList<>();
        this.codigoPaquete = codigoPaquete;
        this.costoPaquete = costoPaquete;
    }
  
    public int getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(int codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
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
    public void addServicio(String servicio){
        this.servicio.add(servicio);
        System.out.println("Agregue el servicio: ");
    }
    
    
}

