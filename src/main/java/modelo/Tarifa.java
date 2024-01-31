    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Hp
 */
public class Tarifa {
    private String nombre;
    private char tipo;
    private String listaC;
    private double porcentaje;

    public Tarifa(String nombre, char tipo, String listaC, double porcentaje) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.listaC = listaC;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public String getListaC() {
        return listaC;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setListaC(String listaC) {
        this.listaC = listaC;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
    
}
