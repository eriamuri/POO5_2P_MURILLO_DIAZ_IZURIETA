/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Josué
 */
public class Pago {
    String idpago;
    String codigoReserva;
    double totalReserva;
    int descuento;
    char formaPago;
    double total;
    double totalPagar;

    public Pago(String idpago, String codigoReserva,double totalReserva, int descuento, char formaPago, double totalPagar) {
        this.total=totalReserva;
        this.idpago = idpago;
        this.codigoReserva = codigoReserva;
        this.totalReserva = totalReserva;
        this.descuento = descuento;
        this.formaPago = formaPago;
        this.totalPagar = totalPagar;
    }

    public String getIdpago() {
        return idpago;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public double getTotalReserva() {
        return totalReserva;
    }

    public int getDescuento() {
        return descuento;
    }

    public char getFormaPago() {
        return formaPago;
    }

    public double getTotal() {
        return total;
    }

    public double getTotalPagar() {
        return totalPagar;
    }
    
    
}
