package com.example.uniwork.estacionamiento.modelo;

import java.util.Date;

/**
 * Created by UniWork on 16/02/2018.
 */

public class Lector {

    protected Date fecha;
    private Date horaEntrada;
    private Date horaSalida;
    private int codigoTarjeta;
    private Date entradaGuardia;
    private Date salidaGuardia;

    public Lector(String nombre, String apellidoP, String apellidoM, String correo, int telefono, Date fecha, Date horaEntrada, Date horaSalida) {
        super(nombre, apellidoP, apellidoM, correo, telefono,);
    }

    public Lector(Date fecha, Date horaEntrada, Date horaSalida, int codigoTarjeta, Date entradaGuardia, Date salidaGuardia) {
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.codigoTarjeta = codigoTarjeta;
        this.entradaGuardia = entradaGuardia;
        this.salidaGuardia = salidaGuardia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setCodigoTarjeta(int codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public Date getEntradaGuardia() {
        return entradaGuardia;
    }

    public void setEntradaGuardia(Date entradaGuardia) {
        this.entradaGuardia = entradaGuardia;
    }

    public Date getSalidaGuardia() {
        return salidaGuardia;
    }

    public void setSalidaGuardia(Date salidaGuardia) {
        this.salidaGuardia = salidaGuardia;
    }
}

