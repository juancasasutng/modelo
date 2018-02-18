package com.example.uniwork.estacionamiento.modelo;

/**
 * Created by UniWork on 18/02/2018.
 */

public class Administrador extends Usuario {
    public Administrador(String nombre, String apellidoP, String apellidoM, String correo, int telefono) {
        super(nombre, apellidoP, apellidoM, correo, telefono);

        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.correo = correo;
        this.telefono = telefono;
    }

}
