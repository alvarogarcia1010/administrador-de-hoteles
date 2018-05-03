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
    private double precioSencillo;
    private double precioDoble;
    private ArrayList<Cliente> clientesHotel;
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
     *
     * @param idHotel
     * @param nombreHotel
     * @param precioBase
     */
    public Hotel(int idHotel, String nombreHotel, double precioSencillo, double precioDoble) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        this.precioSencillo = precioSencillo;
        this.precioDoble = precioDoble;
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

    public double getPrecioSencillo() {
        return precioSencillo;
    }

    public void setPrecioBase(float precioBase) {
        this.precioSencillo = precioBase;
    }
    
    public double getPrecioDoble() {
        return precioDoble;
    }

    public void setPrecioDoble(float precioDoble) {
        this.precioDoble = precioDoble;
    }
    

    //PARA MANEJAR CLIENTES
    /**
     *
     * @param cliente
     * @throws java.lang.Exception
     */
    public void agregarCliente(Cliente cliente) throws Exception {
        boolean flag = false;
        if (cliente != null) {
            if (this.clientesHotel.isEmpty()) {
                this.clientesHotel.add(cliente);
            } else {
                for (Cliente c : this.clientesHotel) {
                    if (cliente.equals(c)) {
                        System.out.println("El Cliente ya se encuentra registrado");
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    this.clientesHotel.add(cliente);

                } else {
                    throw new Exception("El cliente ya se encuentra registrado");
                }
            }
        } else {
            throw new Exception("Operacion no completada: Cliente Nulo");
        }

    }

    /**
     *
     * @param cliente
     */
    public void removerCliente(Cliente cliente) {

    }

    /**
     *
     * @param cliente
     */
    public void modificarCliente(Cliente cliente) {

    }

    /**
     *
     */
    public void mostrarClientes() {
        for (Cliente cliente : this.clientesHotel) {
            System.out.println( cliente.toString());
            
        }

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
    public void modificarReservacion(Reservacion reservacion) {

    }

    /**
     *
     */
    public void mostrarReservaciones() {

    }

    /**
     *
     */
    public void mostrarReservacionesSemanales() {

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
    public void modificarPiso(String clavePiso) {

    }

    /**
     *
     */
    public void mostrarPisosYHabitaciones() {

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
    public void modificarHabitacion(String claveHabitacion) {

    }

    /**
     *
     */
    public void mostrarHabitacionesDisponibles() {

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
    public void modificarPaquete(Integer clavePaquete) {

    }

    /**
     *
     */
    public void mostrarPaquetes() {

    }

}
