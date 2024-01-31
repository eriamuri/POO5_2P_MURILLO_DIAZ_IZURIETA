/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Promocion {
    double cX;
    double cY;
    String pais;
    String codigo;
    int descuento;

    public Promocion(double cX, double cY, String codigo, String pais, int descuento) {
        this.cX = cX;
        this.cY = cY;
        this.pais = pais;
        this.codigo = codigo;
        this.descuento = descuento;
    }

    public double getcX() {
        return cX;
    }

    public double getcY() {
        return cY;
    }

    public String getPais() {
        return pais;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setcX(double cX) {
        this.cX = cX;
    }

    public void setcY(double cY) {
        this.cY = cY;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    
    
}
