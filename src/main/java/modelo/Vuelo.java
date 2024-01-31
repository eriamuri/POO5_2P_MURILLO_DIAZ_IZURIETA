/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Hp
 */
public class Vuelo implements Comparable<Vuelo>{
   private String codigoVuelo;
   private String origen;
   private String destino;
   private  int  duracion;
   private String horaSalida;
   private String horaLlegada;
   private String codigoAvion;
   private double precio;

    public Vuelo(String codigoVuelo, String origen, String destino, int duracion, String horaSalida, String horaLllegada, String codigoAvion, double precio) {
        this.codigoVuelo = codigoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.codigoAvion = codigoAvion;
        this.precio = precio;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setHLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    /**
    * metodo que permite comparar por duracion entre instancias de Vuelo
    * @param o objeto vuelo
    */
    @Override
    public int compareTo(Vuelo o) {
       return this.getDuracion()-o.getDuracion();
    }
   
   
   
    
}
