package com.example.uniwork.estacionamiento.modelo;

/**
 * Created by UniWork on 16/02/2018.
 */

public class Usuario {
    protected String nombre;
    protected String apellidoP;
    protected String apellidoM;
    protected String correo;
    protected int telefono;

    public Usuario(String nombre, String apellidoP, String apellidoM, String correo, int telefono) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.correo = correo;
        this.telefono = telefono;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }
}


