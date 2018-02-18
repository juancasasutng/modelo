package com.example.uniwork.estacionamiento.modelo;

/**
 * Created by UniWork on 16/02/2018.
 */

public class Vehiculo {
    private String placas;
    private String marca;
    private String color;
    private String modelo;

    public Vehiculo(String placas, String marca, String color, String modelo) {
        this.placas = placas;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
