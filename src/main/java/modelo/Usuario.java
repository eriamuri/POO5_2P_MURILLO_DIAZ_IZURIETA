/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Hp
 */
public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;

    public Usuario(String cedula, String nombre, String apellido, String usuario, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContra(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
     
    
}
