package com.yonosek;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Objects;

public class Reservacion {
    /*RESERVACION*/
    private int codigo;
    private Cliente cliente;
    private Habitacion habitacion;
    private Paquete paqueteAdquirido;
    private float costoPaquete;
    private Calendar fechaInicio;
    private Calendar fechaFinal;
    private int totalDias;
    private float costoNoche;
    private float costoTotal;
    
    SimpleDateFormat formatoFechaLarga = new SimpleDateFormat("EEEEEEEEE dd 'de' MMMMM 'de' yyyy HH:mm:ss");
    SimpleDateFormat formatoFechaCorta = new SimpleDateFormat("'Fecha:' dd/MM/yyyy 'Hora:' HH:mm:ss");
    
    public Reservacion(){   
    }

    public Reservacion(int codigo, Cliente cliente, Habitacion habitacion, Paquete paqueteAdquirido, float costoPaquete, Calendar fechaInicio, Calendar fechaFinal, int totalDias, float costoNoche, float costoTotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.paqueteAdquirido = paqueteAdquirido;
        this.costoPaquete = costoPaquete;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
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

    public float getCostoPaquete() {
        return costoPaquete;
    }

    public void setCostoPaquete(float costoPaquete) {
        this.costoPaquete = costoPaquete;
    }

    public int getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(int totalDias) {
        this.totalDias = totalDias;
    }

    public float getCostoNoche() {
        return costoNoche;
    }

    public void setCostoNoche(float costoNoche) {
        this.costoNoche = costoNoche;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Calendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.habitacion);
        hash = 97 * hash + Objects.hashCode(this.fechaInicio);
        hash = 97 * hash + Objects.hashCode(this.fechaFinal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservacion other = (Reservacion) obj;
        if (!Objects.equals(this.habitacion, other.habitacion)) {
            return false;
        }
        if (!Objects.equals(this.fechaInicio, other.fechaInicio)) {
            return false;
        }
        if (!Objects.equals(this.fechaFinal, other.fechaFinal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  codigo + "-" + cliente.getNombre() + "-" + cliente.getApellido() + "-" + habitacion.getCodigoHab() + "-" + paqueteAdquirido.getNombre() + "-" + AdministradorHotel.formatoMoneda.format(costoPaquete) + "-" + formatoFechaLarga.format(fechaInicio.getTime()) + "-" + formatoFechaLarga.format(fechaFinal.getTime()) + "-" + totalDias + "-" + AdministradorHotel.formatoMoneda.format(costoNoche) + "-" + AdministradorHotel.formatoMoneda.format(costoTotal);
    }
    
    
    
}
