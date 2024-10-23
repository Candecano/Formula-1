package com.example;

public class Sponsor implements INombreParaLED {
    private String nombre;
    public Sponsor(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
