/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

/**
 *
 * @author Hp
 */
public interface Pagable {
    public Pago GenerarTransaccion(String idpago, String codigoR, double total, int descuento, char formaPago, double totalPagar);
    
}
