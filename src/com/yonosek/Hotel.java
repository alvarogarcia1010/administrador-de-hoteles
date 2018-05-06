package com.yonosek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Alvaro García <alvarogarcia1010 at github.com>
 */
public class Hotel {

    private int idHotel;
    private String nombreHotel;
    private float precioSencillo;
    private float precioDoble;
    private ArrayList<Cliente> clientesHotel;
    private ArrayList<Reservacion> reservacionesHotel;
    private TreeMap<String, Piso> pisosHotel;
    private TreeMap<Integer, Paquete> paquetesHotel;

    /**
     * Constructor Vacio
     */
    public Hotel() {
        this.clientesHotel = new ArrayList<>();
        this.reservacionesHotel = new ArrayList<>();
        this.pisosHotel = new TreeMap<>();
        this.paquetesHotel = new TreeMap<>();
    }

    /**
     * Constructor
     *
     * @param idHotel
     * @param nombreHotel
     * @param precioSencillo
     * @param precioDoble
     */
    public Hotel(int idHotel, String nombreHotel, float precioSencillo, float precioDoble) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        this.precioSencillo = precioSencillo;
        this.precioDoble = precioDoble;
        this.clientesHotel = new ArrayList<>();
        this.reservacionesHotel = new ArrayList<>();
        this.pisosHotel = new TreeMap<>();
        this.paquetesHotel = new TreeMap<>();
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

    public void setPrecioBase(float precioSencillo) {
        this.precioSencillo = precioSencillo;
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
    public void agregarCliente(Cliente cliente) {
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
                    System.err.println("El cliente ya se encuentra registrado");
                }
            }
        } else {
            System.err.println("Operacion no completada: Cliente Nulo");
        }

    }

    /**
     *
     * @param cliente
     * @throws java.lang.Exception
     */
    public void removerCliente(Cliente cliente) {
        if (clientesHotel.contains(cliente)) {
            clientesHotel.remove(cliente);
        } else {
            System.err.println("El cliente no se encuentra registrado");
        }
    }

    /**
     *
     * @param cliente
     * @param opc
     */
    public void modificarCliente(Cliente cliente, int opc) {
        switch(opc){
            case 1:
                /*Modificar nombre */
                System.out.print("Ingrese el nuevo nombre: ");
                Scanner leer = new Scanner(System.in);
                String nombre = leer.nextLine();
                
                int i = clientesHotel.indexOf(cliente);
                clientesHotel.get(i).setNombre(nombre);
                break;
            case 2:
                /*Modificar apellido */
                System.out.print("Ingrese el nuevo apellido: ");
                leer = new Scanner(System.in);
                String apellido = leer.nextLine();
                
                i = clientesHotel.indexOf(cliente);
                clientesHotel.get(i).setApellido(apellido);
                break;
            case 3:
                /*Modificar numero de tarjeta */
                System.out.print("Ingrese el nuevo numero de tarjeta: ");
                leer = new Scanner(System.in);
                int numeroTarjeta = leer.nextInt();
                
                i = clientesHotel.indexOf(cliente);
                clientesHotel.get(i).setNumTarjeta(numeroTarjeta);
                break;
            case 4:
                /*Modificar codigo de tarjeta */
                System.out.print("Ingrese el nuevo codigo de tarjeta: ");
                leer = new Scanner(System.in);
                int codigoTarjeta = leer.nextInt();
                
                i = clientesHotel.indexOf(cliente);
                clientesHotel.get(i).setCodTarjeta(codigoTarjeta);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }

    /**
     *
     */
    public void mostrarClientes() {
        for (Cliente cliente : this.clientesHotel) {
            System.out.println(cliente.toString());
        }
    }

    public Cliente buscarCliente() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el DUI del cliente que desea buscar: ");
        String DUI = leer.nextLine();
        for (Cliente c : this.clientesHotel) {
            if (DUI.equals(c.getDUI())) {
                System.out.println("Cliente encontrado.");
                return c;
            }
        }
        return null;
    }

    //PARA MANEJAR RESERVACIONES
    /**
     *
     * @param reservacion
     */
    public void agregarReservacion(Reservacion reservacion) {
            Scanner leer = new Scanner(System.in);
            System.out.print("Ingrese el codigo de reservacion: ");
            reservacion.setCodigo(leer.nextInt());
            System.out.println("Clientes disponibles: ");
            mostrarClientes();
            System.out.println("Seleccione uno de ellos: ");
            //reservacion.setCliente(leer.algo);
            System.out.println("Habitaciones disponibles: ");
            //habilitarHabitacion();
            //mostrarHabitaciones();
            //reservacion.setHabitacion(leer.algo);
            System.out.println("Desea adquirir un paquete? (s/n)");
            String op = leer.nextLine();
            if(op == "s"){
                mostrarPaquetes();
                System.out.println("Seleccione el paquete que desea: ");
                //reservacion.setPaquete(leer.algo);
            }else{
                System.out.println("No seleccionó ningun paquete.");
            }
            System.out.println("Ingrese el dia que hará la reservacion formato (dd): ");
            //reservacion.setDia(leer.algo);
            System.out.println("Ingrese el mes que hará la reservacion (formato mm): ");
            //reservacion.setMes(leer.algo);
            System.out.println("Ingrese el año que hará la reservacion (formato aaaa): ");
            //reservacion.setAnio(leer.algo);
            System.out.println("Cuantos dias se quedará? (Lo mas son 7 dias)");
            int op1 = leer.nextInt();
            if(op1 <= 7){
                System.out.println("Usted sequedará: " + op1 + "dias");
            }else{
                System.out.println("Le dije que eran 7 dias o menos. Hoy la cagó.");
            }
            //validarReservacion
            //costo x noche = habitacion.getPrecioHabitacion(float);
            //costo paquete = paqueteAdquirido.getCostoPaquete(float);
            //costo total = (costo paquete  mas costo noche ) * int total dias;
            
        
    }

    /**
     *
     * @param reservacion
     */
    public void removerReservacion(Reservacion reservacion) {
        if (reservacionesHotel.contains(reservacion)) {
            reservacionesHotel.remove(reservacion);
        } else {
            System.err.println("La reservacion no se encuentra registrada");
        }
    }

    /**
     *
     * @param reservacion
     */
    public void modificarReservacion(Reservacion reservacion, int opc) {
        switch(opc){
            case 1:
                //Modificar paquete adquirido
                break;
            case 2:
                //Modificar total de dias
                System.out.println("Ingrese el nuevo total de dias: ");
                Scanner leer = new Scanner(System.in);
                int totalDias = leer.nextInt();
                
                int i = reservacionesHotel.indexOf(reservacion);
                reservacionesHotel.get(i).setTotalDias(totalDias);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }
    
    public Reservacion buscarReservacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el codigo de la reservacion que desea buscar: ");
        int codigo = leer.nextInt();
        for (Reservacion r : this.reservacionesHotel) {
            if (codigo == r.getCodigo()) {
                System.out.println("Reservacion encontrada");
                return r;
            }
        }
        return null;
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
    public void agregarPiso(String clavePiso, Piso piso) {
        if (!this.pisosHotel.containsKey(clavePiso)) {
            this.pisosHotel.put(clavePiso, piso);
        } else {
            System.err.println("El piso ya se encuentra registrado");
        }
    }

    /**
     *
     * @param clavePiso
     * @throws java.lang.Exception
     */
    public void removerPiso(String clavePiso) {
        if (this.pisosHotel.containsKey(clavePiso)) {
            this.pisosHotel.remove(clavePiso);
        } else {
            System.err.println("No hay registros del piso " + clavePiso);

        }
    }

    /**
     * 3
     */
    public void mostrarPisoYHabitaciones() {

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
    public void agregarPaquete(Integer clavePaquete, Paquete paquete) {
        if (!this.paquetesHotel.containsKey(clavePaquete)) {
            this.paquetesHotel.put(clavePaquete, paquete);
        } else {
            System.err.println("El paquete ya se encuentra registrado");
        }
    }

    /**
     *
     * @param clavePaquete
     * @throws java.lang.Exception
     */
    public void removerPaquete(Integer clavePaquete) {
        if (this.paquetesHotel.containsKey(clavePaquete)) {
            this.paquetesHotel.remove(clavePaquete);
        } else {
            System.err.println("No hay registros del paquete");

        }
    }

    /**
     *
     * @param clavePaquete
     */
    public void modificarPaquete() {

    }

    public void habilitarHabitacion(String hab) {
        String P = hab.substring(0, 1).toUpperCase();

        if (this.pisosHotel.get(P).habitacionesPiso.get(hab).isEstaHabilitada() == true) {
            System.out.println("La habitacion ya esta hablitada");
        } else {
            this.pisosHotel.get(P).habitacionesPiso.get(hab).setEstaHabilitada(true);
            System.out.println("La habitacion ha sido habilitada");
        }
    }

    public void DeshabilitarHabitacion(String hab) {
        String P = hab.substring(0, 1).toUpperCase();

        if (this.pisosHotel.get(P).habitacionesPiso.get(hab).isEstaHabilitada() == false) {
            System.out.println("La habitacion ya esta deshabilitada");
        } else {
            this.pisosHotel.get(P).habitacionesPiso.get(hab).setEstaHabilitada(false);
            System.out.println("La habitacion ha sido deshabilitada");
        }
    }

    public void habilitarPiso(String piso) {
        String p = piso.toUpperCase();

        if (this.pisosHotel.get(p).isEstaHabilitada() == true) {
            System.out.println("El piso ya esta habilitado");
        } else {
            this.pisosHotel.get(p).setEstaHabilitada(true);
            System.out.println("El piso ha sido habilitado");
        }
    }

    public void DeshabilitarPiso(String piso) {
        String p = piso.toUpperCase();

        if (this.pisosHotel.get(p).isEstaHabilitada() == false) {
            System.out.println("El piso ya esta deshabilitado");
        } else {
            this.pisosHotel.get(p).setEstaHabilitada(false);
            System.out.println("El piso ha sido deshabilitado");
        }
    }

    /**
     *
     */
    public void mostrarPaquetes() {
        for (Map.Entry<Integer, Paquete> paquete : this.paquetesHotel.entrySet()) {
            Integer clave = paquete.getKey();
            Paquete valor = paquete.getValue();
            System.out.println(Integer.toString(clave) + "  ->  " + valor.toString());
        }
    }

}
