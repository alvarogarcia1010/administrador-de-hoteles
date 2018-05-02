package com.yonosek;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Alvaro García <alvarogarcia1010 at github.com>
 */
public class Hotel {

    private int idHotel;
    private String nombreHotel;
    private float precioBase;
    private ArrayList<Paquete> clientesHotel;
    private ArrayList<Reservacion> reservacionesHotel;
    private HashMap<String, Piso> pisosHotel;
    private HashMap<String, Habitacion> habitacionesHotel;
    private HashMap<Integer, Paquete> paquetesHotel;

    /**
     * Constructor Vacio
     */
    public Hotel() {
        this.clientesHotel = new ArrayList<>();
        this.reservacionesHotel = new ArrayList<>();
        this.pisosHotel = new HashMap<>();
        this.habitacionesHotel = new HashMap<>();
        this.paquetesHotel = new HashMap<>();
    }

    /**
     * Constructor
     * @param idHotel
     * @param nombreHotel
     * @param precioBase 
     */
    public Hotel(int idHotel, String nombreHotel, float precioBase) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        this.precioBase = precioBase;
        this.clientesHotel = new ArrayList<>();
        this.reservacionesHotel = new ArrayList<>();
        this.pisosHotel = new HashMap<>();
        this.habitacionesHotel = new HashMap<>();
        this.paquetesHotel = new HashMap<>();
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
    
    //PARA MANEJAR CLIENTES
    
    /**
     * 
     * @param cliente 
     */
    public void agregarCliente(Paquete cliente) {

    }
    
    /**
     * 
     * @param cliente 
     */
    public void removerCliente(Paquete cliente) {

    }
    
    /**
     * 
     * @param cliente 
     */
    public void modificarCliente(Paquete cliente){
        
    }
    
    /**
     * 
     */
    public void mostrarClientes(){
        
    }
    
    //PARA MANEJAR RESERVACIONES
    
    /**
     * 
     * @param reservacion
     */
    public void agregarReservacion(Reservacion reservacion) {

    }
    
    /**
     * 
     * @param reservacion
     */
    public void removerReservacion(Reservacion reservacion) {

    }
    
    /**
     * 
     * @param reservacion
     */
    public void modificarReservacion(Reservacion reservacion){
        
    }
    
    /**
     * 
     */
    public void mostrarReservaciones(){
        
    }
    
    /**
     * 
     */
    public void mostrarReservacionesSemanales(){
        
    }   
    
    //PARA MANEJAR PISOS
    
    /**
     * 
     * @param clavePiso
     */
    public void agregarPiso(String clavePiso) {

    }
    
    /**
     * 
     * @param clavePiso
     */
    public void removerPiso(String clavePiso) {

    }
    
    /**
     * 
     * @param clavePiso
     */
    public void modificarPiso(String clavePiso){
        
    }
    
    /**
     * 
     */
    public void mostrarPisosYHabitaciones(){
        
    }
    
    //PARA MANEJAR HABITACIONES
    
    /**
     * 
     * @param claveHabitacion
     */
    public void agregarHabitacion(String claveHabitacion) {

    }
    
    /**
     * 
     * @param claveHabitacion
     */
    public void removerHabitacion(String claveHabitacion) {

    }
    
    /**
     * 
     * @param claveHabitacion
     */
    public void modificarHabitacion(String claveHabitacion){
        
    }
    
    /**
     * 
     */
    public void mostrarHabitacionesDisponibles(){
        
    }    
    
    //PARA MANEJAR PAQUETES
    
    /**
     * 
     * @param clavePaquete
     */
    public void agregarPaquete(Integer clavePaquete) {

    }
    
    /**
     * 
     * @param clavePaquete
     */
    public void removerPaquete(Integer clavePaquete) {

    }
    
    /**
     * 
     * @param clavePaquete
     */
    public void modificarPaquete(Integer clavePaquete){
        
    }
    
    /**
     * 
     */
    public void mostrarPaquetes(){
        
    }

}
