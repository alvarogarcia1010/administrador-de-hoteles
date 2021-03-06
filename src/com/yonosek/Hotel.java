package com.yonosek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.lang.Integer;

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

    public float getPrecioSencillo() {
        return precioSencillo;
    }

    public void setPrecioSencillo(float precioSencillo) {
        this.precioSencillo = precioSencillo;
    }

    public float getPrecioDoble() {
        return precioDoble;
    }

    public void setPrecioDoble(float precioDoble) {
        this.precioDoble = precioDoble;
    }

    public ArrayList<Cliente> getClientesHotel() {
        return clientesHotel;
    }

    public void setClientesHotel(ArrayList<Cliente> clientesHotel) {
        this.clientesHotel = clientesHotel;
    }

    public ArrayList<Reservacion> getReservacionesHotel() {
        return reservacionesHotel;
    }

    public void setReservacionesHotel(ArrayList<Reservacion> reservacionesHotel) {
        this.reservacionesHotel = reservacionesHotel;
    }

    public TreeMap<String, Piso> getPisosHotel() {
        return pisosHotel;
    }

    public void setPisosHotel(TreeMap<String, Piso> pisosHotel) {
        this.pisosHotel = pisosHotel;
    }

    public TreeMap<Integer, Paquete> getPaquetesHotel() {
        return paquetesHotel;
    }

    public void setPaquetesHotel(TreeMap<Integer, Paquete> paquetesHotel) {
        this.paquetesHotel = paquetesHotel;
    }



    //PARA MANEJAR CLIENTES
    /**
     * Agregar cliente a la lista
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
     * Remover cliente de la lista
     * @param cliente
     * @throws java.lang.Exception
     */
    public void removerCliente(Cliente cliente) {
        if (clientesHotel.contains(cliente)) {
            clientesHotel.remove(cliente);
            System.out.println("Cliente removido con exito! :)");
        } else {
            System.err.println("El cliente no se encuentra registrado");
        }
    }

    /**
     * Modifica la informacion del cliente
     * @param cliente
     * @param opc
     */
    public void modificarCliente(Cliente cliente, int opc) {
        if (clientesHotel.contains(cliente)){
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
                String numeroTarjeta = leer.nextLine();
                
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
    } else {
            System.err.println("El cliente no se encuentra registrado");
        } 
    }

    /**
     * Muestra los clientes que han sido agregados
     * 
     */
    public void mostrarClientes() {
        for (Cliente cliente : this.clientesHotel) {
            String[] parts = cliente.toString().split("-");
            System.out.printf("%-5s   ->  %-20s%-10s%-20s%-20s \n",(cliente.getDUI()),parts[0],parts[1],parts[2],parts[3] );
        }
    }
    /**
     * Busca un cliente en especifico en la lista de clientes
     * @return 
     */
    public Cliente buscarCliente() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el DUI del cliente: ");
        String DUI = leer.nextLine();
        for (Cliente c : this.clientesHotel) {
            if (DUI.equals(c.getDUI())) {
                System.out.println("Cliente encontrado.");
                return c;
            }
        }
        return null;
    }
    /**
     * Valida que un cliente no tenga mas de dos ocurrencias en las reservaciones
     * @param cont
     * @return 
     */
    public boolean validarCliente(int cont){
        return cont <= 1;
    }

    //PARA MANEJAR RESERVACIONES
    /**
     * Valida que un cliente no tenga mas de dos ocurrencias en las reservaciones
     * @param reservacion
     */
    public void validacionGlobalClientes(Reservacion reservacion){
            boolean flag = true;
            int cont = 0;
            System.out.println("Clientes disponibles: ");
            this.mostrarClientes();
            reservacion.setCliente(this.buscarCliente());
            while(flag){
                if (reservacion.getCliente() != null){
                    cont = 0;
                    for (Reservacion r : this.reservacionesHotel){
                        
                        if(reservacion.getCliente().equals(r.getCliente())){
                            cont++;
                        }
                    }
                    if(this.validarCliente(cont)){
                        flag = false;
                    }
                } else{
                    System.err.println("El cliente no se encuentra registrado o ya tiene un maximo de reservaciones.");
                    System.out.println("Clientes disponibles: ");
                    this.mostrarClientes();
                    reservacion.setCliente(this.buscarCliente());
                }
            }
    }
    /**
     * Busca una Habitacion en la lista de habitaciones
     * @return 
     */
    public Habitacion buscarHabitacion(){
    Habitacion habitacion= new Habitacion();
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la habitación que desea buscar: ");
    String hab = leer.nextLine().toUpperCase();
    for (Map.Entry <String, Piso> piso : this.pisosHotel.entrySet()) {
         habitacion = piso.getValue().buscarHabitacion(hab);
         
         if(habitacion != null){
             break;
         }
    }
    return habitacion;
}
    /**
     * Agrega una reservacion 
     */
    public void agregarReservacion() {
            Reservacion reservacion = new Reservacion();
            Scanner leer = new Scanner(System.in);
            
            //PARA LLENAR CODIGO DE RESERVACION
            try{
                System.out.print("Ingrese el codigo de reservacion: ");
                reservacion.setCodigo(leer.nextInt());
            }catch (InputMismatchException e) {
                System.err.print("Por favor, ingrese un numero");
                reservacion.setCodigo(leer.nextInt());
            }
            
            //PARA LLENAR CLIENTE (Falta probar)
            this.validacionGlobalClientes(reservacion);

            
            //PARA LLENAR FECHAS y DIAS 
            reservacion.setFechaInicio(ingresarFecha());
            reservacion.setTotalDias(ingresarDias());
            reservacion.setFechaFinal(generarFechaFinal(reservacion.getTotalDias(),reservacion.getFechaInicio()));
            
            
            //PARA LLENAR HABITACION
            System.out.println("Habitaciones disponibles: ");
            this.mostrarHabitacionesDisponibles();
            reservacion.setHabitacion(this.buscarHabitacion());
            reservacion.getHabitacion().setEstaDisponible(false);

            //PARA ADQUIRIR PAQUETE
            leer.nextLine();
            int opc;
            System.out.print("Desea adquirir un paquete? (s/n): ");
            String op = leer.nextLine();
            if("s".equals(op)){
                this.mostrarPaquetes();
                System.out.println("Seleccione el paquete que desea: ");
                opc = leer.nextInt();
                reservacion.setPaqueteAdquirido(this.paquetesHotel.get(opc));
            }else{
               System.out.println("No seleccionó ningun paquete.");
               reservacion.setPaqueteAdquirido(null);
            }
            
            //PARA LLENAR COSTO PAQUETE
            if(reservacion.getPaqueteAdquirido()!= null){
                reservacion.setCostoPaquete(reservacion.getPaqueteAdquirido().getCostoPaquete());
            }else{
                reservacion.setCostoPaquete(0);
            }
            

            //PARA LLENAR COSTO POR NOCHE
            reservacion.setCostoNoche(reservacion.getHabitacion().getPrecioHabitacion());
            
            //PARA LLENAR COSTO TOTAL
            reservacion.setCostoTotal((reservacion.getCostoNoche()+reservacion.getCostoPaquete()) * reservacion.getTotalDias());
            
            //PARA AGREGAR A LA LISTA
            boolean flag = false;
            if (this.reservacionesHotel.isEmpty()) {
                this.reservacionesHotel.add(reservacion);
                
            } else {
                for (Reservacion r : this.reservacionesHotel) {
                    if (reservacion.equals(r)) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    this.reservacionesHotel.add(reservacion);

                } else {
                    System.err.println("La reservacion ya se encuentra registrada");
                }
            }
            System.out.println("Su reservacion ha sido creada con éxito!");
            this.mostrarUnaReservacion(reservacion);
    }

    /**
     * Remueve una reservacion de la lista
     * @param reservacion
     */
    public void removerReservacion(Reservacion reservacion) {
        if (reservacionesHotel.contains(reservacion)) {
            reservacionesHotel.remove(reservacion);
            System.out.println("Reservación eliminada con éxito! :)");
            reservacion.getHabitacion().setEstaDisponible(false);

        } else {
            System.err.println("La reservacion no se encuentra registrada");
        }
    }

    /**
     * Modifica la informacion de una reservacion
     * @param reservacion
     * @param opc
     */
    public void modificarReservacion(Reservacion reservacion, int opc) {
        switch(opc){
            case 1:
                //Cambiar paquete adquirido
                System.out.println("-----------------------");
                mostrarPaquetes();
                System.out.println("-----------------------");
                System.out.println("Paquete de la reservacion actual: " + reservacion.getPaqueteAdquirido().getNombre());
                System.out.print("Ingrese el numero del paquete al que desea cambiarse: ");
                /*Scanner leer = new Scanner(System.in);
                int opcion = leer.nextInt();
                cambioPaquete = */
                
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
    /**
     * Busca una reservacion en la lista de reservaciones
     * @return 
     */
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
     *Muestra las reservaciones agregadas
     * 
     */
    public void mostrarReservaciones() {
        for (Reservacion r : this.reservacionesHotel) {
            String[] parts = r.toString().split("-");
            System.out.println("--------------------------------------");
            System.out.println("Reservación. ");
            System.out.println("Código: " + parts[0]);
            System.out.println("Nombre: " + parts[1]);
            System.out.println("Apellido: " + parts[2]);
            System.out.println("Numero Habitación: " + parts[3]);
            System.out.println("Paquete Adquirido: "+ parts[4]);
            System.out.println("Costo Paquete Adquirido: "+ parts[5]);
            System.out.println("Fecha Inicial: " + parts[6]);
            System.out.println("Fecha Final: " + parts[7]);
            System.out.println("Total de dias: "+ parts[8]);
            System.out.println("Costo por noche: "+ parts[9]);
            System.out.println("Costo total: "+ parts[10]);
            System.out.println("--------------------------------------");
            
        }

    }
    

    /**
     *Muestra una reservacion en especifico
     * 
     */
    public void mostrarUnaReservacion(Reservacion r) {
        String[] parts = r.toString().split("-");
            System.out.println("--------------------------------------");
            System.out.println("Reservación: ");
            System.out.println("Código: " + parts[0]);
            System.out.println("Nombre: " + parts[1]);
            System.out.println("Apellido: " + parts[2]);
            System.out.println("Numero Habitación: " + parts[3]);
            System.out.println("Paquete Adquirido: "+ parts[4]);
            System.out.println("Costo Paquete Adquirido: "+ parts[5]);
            System.out.println("Fecha Inicial: " + parts[6]);
            System.out.println("Fecha Final: " + parts[7]);
            System.out.println("Total de dias: "+ parts[8]);
            System.out.println("Costo por noche: "+ parts[9]);
            System.out.println("Costo total: "+ parts[10]);
            System.out.println("--------------------------------------");

    }

    //PARA MANEJAR PISOS
    /**
     * Agrega un piso al hotel
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
     * Remueve un piso
     * @param clavePiso
     * @throws java.lang.Exception
     */
    public void removerPiso(String clavePiso) {
        if (this.pisosHotel.containsKey(clavePiso)) {
            this.pisosHotel.remove(clavePiso);
            System.out.println("El cliente ha sido eliminado con éxito! :)");
        } else {
            System.err.println("No hay registros del piso " + clavePiso);

        }
    }

    /**
     * Muestra todos lis pisos y sus habitciones
     */
    public void mostrarPisoYHabitaciones() {
        for (Map.Entry<String, Piso> piso : this.pisosHotel.entrySet()) {
            String clave = piso.getKey();
            Piso valor = piso.getValue();
            System.out.println(clave + "  ->  " + valor.toString());
        }
    }

    /**
     * Muestra todas las habitaciones que estan disponibles
     * 
     */
    public void mostrarHabitacionesDisponibles() {
       for (Map.Entry <String, Piso> piso : this.pisosHotel.entrySet()) {
           piso.getValue().mostrarHabitacionDiponibles();
       }
    }
    /**
     * Muestra solo las habitaciones de todos los pisos
     */
    public void mostrahabitaciones(){
        for (Map.Entry <String, Piso> piso : this.pisosHotel.entrySet()){
            piso.getValue().mostrarHabitacion();
        }
    }

    //PARA MANEJAR PAQUETES
    /**
     * Agrega un paquete
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
     * Remueve un paquete
     * @param clavePaquete
     * @throws java.lang.Exception
     */
    public void removerPaquete(Integer clavePaquete) {
        if (this.paquetesHotel.containsKey(clavePaquete)) {
            this.paquetesHotel.remove(clavePaquete);
            System.out.println("El paquete ha sido eliminado con éxito! :)");
        } else {
            System.err.println("No hay registros del paquete");

        }
    }

    /**
     * Modifiva la informacion de un paquete
     * @param num
     * @param opc
     */
    public void modificarPaquete(int num, int opc) throws Exception {
        switch(opc){
            case 1:
                //Modificar precio base
                Paquete paquete;
                Scanner leer = new Scanner(System.in);
                paquete = paquetesHotel.get(num);
                System.out.print("Ingrese el nuevo precio base: ");
                float precio = leer.nextFloat();
                paquete.setCostoPaquete(precio);                
                break;
            case 2:
                //Agregar un servicio
                leer = new Scanner(System.in);
                paquete = paquetesHotel.get(num);
                System.out.print("Ingrese el servicio que desea agregar: ");
                String servicio = leer.nextLine();
                paquete.agregarServicio(servicio);                
                break;
            case 3:
                //Eliminar un servicio
                leer = new Scanner(System.in);
                paquete = paquetesHotel.get(num);
                System.out.println("---------------");
                for(int i = 0; i<paquete.getServicios().size(); i++){
                    System.out.println(i+1 + ".)" + paquete.getServicios().get(i));
                }
                System.out.println("---------------");
                System.out.print("Ingrese el servicio que desea remover: ");
                int opcion = leer.nextInt();;
                paquete.getServicios().remove(opcion-1);
                break;
            case 4:
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }
    /**
     * Revisa si una habitacion esta habilitada y si no lo esta la habilita
     * @param hab 
     */
    public void habilitarHabitacion(String hab) {
          String P = hab.substring(0,1).toUpperCase();
            //System.out.println(P + hab); 
            //System.out.println(this.pisosHotel.get(P).getHabitacionesPiso().get(hab).isEstaHabilitada());
        if (this.pisosHotel.get(P).getHabitacionesPiso().get(hab).isEstaHabilitada() == true) {
            System.out.println("La habitacion ya esta hablitada");
        } else {
            this.pisosHotel.get(P).getHabitacionesPiso().get(hab).setEstaHabilitada(true);
            System.out.println("La habitacion ha sido habilitada");
        }
    }
    /**
     * Revisa si una habitacion esta deshabilitada y si no lo esta la deshabilita
     * @param hab 
     */
    public void DeshabilitarHabitacion(String hab) {
        String P = hab.substring(0, 1).toUpperCase();

        if (this.pisosHotel.get(P).getHabitacionesPiso().get(hab).isEstaHabilitada() == false) {
            System.out.println("La habitacion ya esta deshabilitada");
        } else {
            this.pisosHotel.get(P).getHabitacionesPiso().get(hab).setEstaHabilitada(false);
            System.out.println("La habitacion ha sido deshabilitada");
        }
    }
    /**
     * Revisa si un piso esta habilitado y si no lo esta los habilita
     * @param piso 
     */
    public void habilitarPiso(String piso) {
        String p = piso.toUpperCase();

        if (this.pisosHotel.get(p).isEstaHabilitada() == true) {
            System.out.println("El piso ya esta habilitado");
        } else {
            this.pisosHotel.get(p).setEstaHabilitada(true);
            System.out.println("El piso ha sido habilitado");
        }
    }
    /**
     * Resvis si un piso esta deshabilitado y si no lo esta lo deshabilita
     * @param piso 
     */
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
     * Muestra la informacion de un paquete agregado
     */
    public void mostrarPaquetes() {
        for (Map.Entry<Integer, Paquete> paquete : this.paquetesHotel.entrySet()) {
            Integer clave = paquete.getKey();
            Paquete valor = paquete.getValue();
            System.out.println("  " + Integer.toString(clave) + "  ->  " + valor.toString());
        }
    }
    
    
    //MANEJO DE FECHAS

    /**
     * Valid la fecha
     * @param fecha
     * @return boolean
     */
    public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
    /**
     * Convierte la fecha
     * @param fecha
     * @return 
     */
    public static Calendar convertirFecha(String fecha){
        Calendar fechaFinal;
        fechaFinal = Calendar.getInstance();
        
        int dia, mes, year;
        String[] partes = fecha.split("/");
        
        dia = Integer.parseInt(partes[0]);
        mes = Integer.parseInt(partes[1]);
        year = Integer.parseInt(partes[2]);
        
        if(year<=99){
            year = 2000 + year;
        }
        
        fechaFinal.set(year,(mes-1),dia, 14,0,0);
        
        return fechaFinal;
    }
    
    
    /**
     * Guarda la fecha ingresada
     * @return 
     */
    public static Calendar ingresarFecha(){
        String fecha;
        Calendar fechaInicial;
        fechaInicial = Calendar.getInstance();


        Scanner leer=new Scanner(System.in);
        boolean validador, flag=true;
        
        System.out.print("Ingrese fecha para reservacion (dd/mm/aaaa): ");
        fecha=leer.next();
        while(flag){

            validador = validarFecha(fecha);
            if(validador){
                fechaInicial = convertirFecha(fecha);
                flag=false;
            }else{
                System.err.println("La fecha no es valida");
                System.out.print("Ingrese fecha para reservacion (dd/mm/aaaa): ");
                fecha=leer.next();
            }
        } 
        return fechaInicial; 
    }
    
    /**
     * Guarda los dias ingresados
     * @return 
     */
    public static int ingresarDias(){
        Scanner leer = new Scanner(System.in);
        boolean flag = true;
        int dias = 8;
        
        while(dias>7){
            try {
                System.out.print("Dias que desea reservar habitacion (Max: 7 dias): ");
                dias = leer.nextInt();
            }catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese un numero de dias valido");
                System.out.print("Dias que desea reservar habitacion (Max: 7 dias): ");
                dias = leer.nextInt();
            }
        } 
        return dias;
    }
    
    /**
     * Muestra la fecha con el formato
     * @param dias
     * @param fechaInicial
     * @return 
     */
    public static Calendar generarFechaFinal(int dias, Calendar fechaInicial){  
        Calendar fechaFinal = Calendar.getInstance();
        fechaFinal.set(Calendar.YEAR, fechaInicial.get(Calendar.YEAR));
        fechaFinal.set(Calendar.MONTH, fechaInicial.get(Calendar.MONTH));
        fechaFinal.set(Calendar.DATE, fechaInicial.get(Calendar.DATE));
        fechaFinal.set(Calendar.HOUR, (fechaInicial.get(Calendar.HOUR)-1));
        fechaFinal.set(Calendar.SECOND, 0);
        fechaFinal.set(Calendar.MINUTE, 0);

        fechaFinal.add(Calendar.DAY_OF_MONTH, dias);
        
        return fechaFinal;
    }
    /**
     * Revisa si las habitaciones estan en uno de los dos ultimos pisos
     * y agrega el 10% al precio base
     */
    public void incrementoPrecioBase(){
        int numPisos = this.pisosHotel.size();
            for (Map.Entry <String, Piso> piso : this.pisosHotel.entrySet()) {
                if(piso.getKey().equals(Character.toString((char)(64 + numPisos)))){
                    this.pisosHotel.get((Character.toString((char)(64 + numPisos)))).setNuevoPrecioTodasHabitaciones();
                }else if(piso.getKey().equals(Character.toString((char)(63 + numPisos)))){
                    this.pisosHotel.get((Character.toString((char)(63 + numPisos)))).setNuevoPrecioTodasHabitaciones();
                }else{
                    this.pisosHotel.get((Character.toString((char)(63 + numPisos)))).setPrecioTodasHabitaciones();
                }
            }
    }
}
