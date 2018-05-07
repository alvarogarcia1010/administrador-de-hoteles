package com.yonosek;

import java.util.*;


public class Paquete {
    private String nombre;
    private int codigoPaquete;
    private ArrayList <String> servicios;
    private float costoPaquete;
    
    public Paquete(){
        this.servicios=new ArrayList<>();
    }

    public Paquete(int codigoPaquete,  float costoPaquete, String nombre) {
        this.servicios=new ArrayList<>();
        this.nombre= nombre;
        this.codigoPaquete = codigoPaquete;
        this.costoPaquete = costoPaquete;
    }
  
    public int getCodigoPaquete() {
        return codigoPaquete;
    }

    public ArrayList<String> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<String> servicios) {
        this.servicios = servicios;
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
    

    public float getCostoPaquete() {
        return costoPaquete;
    }

    public void setCostoPaquete(float costoPaquete) {
        this.costoPaquete = costoPaquete;
    }
    
    /**
     * 
     * @param servicio 
     */
    
//    public void mostrarServicio(){
//        this.servicios.forEach((servicio) -> {
//            System.out.println(servicio);
//        });
//    }
    
    public void agregarServicio(String servicio) {
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
    
    public void modificarServicio(){
        
    }
    
    public void removerServicio(String servicio) throws Exception{
        if (servicios.contains(servicio)) {
            servicios.remove(servicio);
        } else {
            System.err.println("El servicio no se encuentra registrada");
        }
    }
    
    public void modificarPrecio(){
        
    }
    
    @Override
    public String toString() {
        return "    " + nombre + "       " + servicios + "       " + "$" + costoPaquete;
    }
    
    
}

