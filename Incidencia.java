package com.example.uniwork.estacionamiento.modelo;

import java.util.Date;

/**
 * Created by UniWork on 18/02/2018.
 */

public class Incidencia {
    private String descripcion;
    private Date fecha;
    private Date hora;
    private String nombrePersona;

    public Incidencia(String descripcion, Date fecha, Date hora, String nombrePersona) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.nombrePersona = nombrePersona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
}
