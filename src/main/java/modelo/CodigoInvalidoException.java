/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Hp
 */
public class CodigoInvalidoException extends Exception {
   private String mensaje;
   
    public CodigoInvalidoException(String mensaje ) {
        super(mensaje);
        this.mensaje = mensaje;
    }
   
    
}
