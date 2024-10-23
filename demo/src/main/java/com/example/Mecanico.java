package com.example;

public class Mecanico extends Persona{

    public Mecanico(String nombre, String nacionalidad) {
        super(nombre, nacionalidad);    
    }
   
    public Mecanico(String nombre) {
        super(nombre, nombre);
    }
    
    @Override
    public String getNombreParaLED() {
        return "Mecanico: " + super.getNombreParaLED();
    }
    




}
