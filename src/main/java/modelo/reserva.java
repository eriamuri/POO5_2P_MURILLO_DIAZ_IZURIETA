/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Hp
 */
public class reserva implements Pagable, Serializable {
    private String codigoReserva;
    private String cedulaCliente;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String fechaSalida;
    private String fechaRegreso;
    private int numeroPasajeros;
    private String numeroVuelo;
    private String numeroVueloRegreso;
    private char tipoTarifaIda;
    private char tipoTarifaRegreso;

    public reserva(String codigoReserva, String cedulaCliente, String ciudadOrigen, String ciudadDestino, String fechaSalida, String fechaRegreso, int numeroPasajeros, String numeroVuelo, String numeroVueloRegreso, char tipoTarifaIda, char tipoTarifaRegreso) {
        this.codigoReserva = codigoReserva;
        this.cedulaCliente = cedulaCliente;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.numeroPasajeros = numeroPasajeros;
        this.numeroVuelo = numeroVuelo;
        this.numeroVueloRegreso = numeroVueloRegreso;
        this.tipoTarifaIda = tipoTarifaIda;
        this.tipoTarifaRegreso = tipoTarifaRegreso;
    }

    
    
    //GETTERS AND SETTERS

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getNumeroVueloRegreso() {
        return numeroVueloRegreso;
    }

    public char getTipoTarifaIda() {
        return tipoTarifaIda;
    }

    public char getTipoTarifaRegreso() {
        return tipoTarifaRegreso;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void setNumeroVueloRegreso(String numeroVueloRegreso) {
        this.numeroVueloRegreso = numeroVueloRegreso;
    }

    public void setTipoTarifaIda(char tipoTarifaIda) {
        this.tipoTarifaIda = tipoTarifaIda;
    }

    public void setTipoTarifaRegreso(char tipoTarifaRegreso) {
        this.tipoTarifaRegreso = tipoTarifaRegreso;
    }
    
    


    
    /**
    * metodo que sobrecribe la generacion de una transaccion 
    * @param idPago String 
    * @param codigoR String
    * @param total double
    * @param descuento int
    * @param formaPago char
    * @param totalPagar double
    */
    @Override
    public Pago GenerarTransaccion(String idPago, String codigoR, double total, int descuento, char formaPago, double totalPagar) {
      Pago pg = new Pago(idPago,codigoR,total,descuento,formaPago,totalPagar);
      return pg;
    }
   
    
}
