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
    private HashMap<Integer, Paquete> paquetesHotel;

    /**
     * Constructor Vacio
     */
    public Hotel() {
        this.clientesHotel = new ArrayList<>();
        this.reservacionesHotel = new ArrayList<>();
        this.pisosHotel = new HashMap<>();
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
     * @param piso
     * @throws java.lang.Exception
     */
    public void agregarPiso(String clavePiso, Piso piso) throws Exception {
        if (!this.pisosHotel.containsKey(clavePiso)){
            this.pisosHotel.put(clavePiso, piso);
        }else{
            throw new Exception("El piso ya se encuentra registrado");
        }
    }

    /**
     *
     * @param clavePiso
     */
    public void removerPiso(String clavePiso) throws Exception {
        if(this.pisosHotel.containsKey(clavePiso)){
            this.pisosHotel.remove(clavePiso);
        }else{
            throw new Exception("No hay registros del piso "+ clavePiso);

        }
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

    /**
     *
     */
    public void mostrarHabitacionesDisponibles() {

    }

    //PARA MANEJAR PAQUETES
    /**
     *
     * @param clavePaquete
     * @param paquete
     * @throws java.lang.Exception
     */
    public void agregarPaquete(Integer clavePaquete, Paquete paquete)throws Exception {
        if (!this.paquetesHotel.containsKey(clavePaquete)){
            this.paquetesHotel.put(clavePaquete, paquete);
        }else{
            throw new Exception("El paquete ya se encuentra registrado");
        }
    }

    /**
     *
     * @param clavePaquete
     * @throws java.lang.Exception
     */
    public void removerPaquete(Integer clavePaquete)throws Exception {
        if(this.paquetesHotel.containsKey(clavePaquete)){
            this.paquetesHotel.remove(clavePaquete);
        }else{
            throw new Exception("No hay registros del paquete");

        }
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
