package com.yonosek;


public class Reservacion {
    /*RESERVACION*/
    private int codigo;
    private Cliente cliente;
    private Habitacion habitacion;
    private Paquete paqueteAdquirido;
    private double costoPaquete;
    /*private Fecha fechaInicio;*/
    /*private Fecha fechaFinal;*/
    private int totalDias;
    private double costoNoche;
    private double costoTotal;
    
    public Reservacion(){   
    }

    public Reservacion(int codigo, Cliente cliente, Habitacion habitacion, Paquete paqueteAdquirido, double costoPaquete, int totalDias, double costoNoche, double costoTotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.paqueteAdquirido = paqueteAdquirido;
        this.costoPaquete = costoPaquete;
        this.totalDias = totalDias;
        this.costoNoche = costoNoche;
        this.costoTotal = costoTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Paquete getPaqueteAdquirido() {
        return paqueteAdquirido;
    }

    public void setPaqueteAdquirido(Paquete paqueteAdquirido) {
        this.paqueteAdquirido = paqueteAdquirido;
    }

    public double getCostoPaquete() {
        return costoPaquete;
    }

    public void setCostoPaquete(double costoPaquete) {
        this.costoPaquete = costoPaquete;
    }

    public int getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(int totalDias) {
        this.totalDias = totalDias;
    }

    public double getCostoNoche() {
        return costoNoche;
    }

    public void setCostoNoche(double costoNoche) {
        this.costoNoche = costoNoche;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
   
    public void agregarReservacion(){
     
        
    }
    
    public void modificarReservacion(){
        
    }
    
    public void cancelarReservacion(){
        
    }
    
    public void verReservacionSemmana(){
        
    }
    
    public void validarReservacion(){
        
    }
    
}
