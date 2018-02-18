package com.example.uniwork.estacionamiento.modelo;

/**
 * Created by UniWork on 16/02/2018.
 */

public class Automovilista extends Usuario {
    private int numeroLicencia;
    private int tarjetaAcceso;

    public Automovilista(String nombre, String apellidoP, String apellidoM, String correo, int telefono) {
        super(nombre, apellidoP, apellidoM, correo, telefono);
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public int getTarjetaAcceso() {
        return tarjetaAcceso;
    }

    public void setTarjetaAcceso(int tarjetaAcceso) {
        this.tarjetaAcceso = tarjetaAcceso;
    }
}
