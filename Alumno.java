package com.example.uniwork.estacionamiento.modelo;

/**
 * Created by UniWork on 16/02/2018.
 */

public class Alumno extends Automovilista {
    private int numComtrol;
    private String grupo;
    public Alumno(String nombre, String apellidoP, String apellidoM, String correo, int telefono) {
        super(nombre, apellidoP, apellidoM, correo, telefono);
    }

}