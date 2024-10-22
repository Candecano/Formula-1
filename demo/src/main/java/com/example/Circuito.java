package com.example;

public class Circuito implements ISponsoreable {
    private String nombre;
    private double longitud;
    private int vueltasCantidad;
    

    public Circuito(String nombre, double longitud, int vueltasCantidad) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.vueltasCantidad = vueltasCantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public int getVueltas() {
        return vueltasCantidad;
    }
    public void setVueltas(int vueltas) {
        this.vueltasCantidad = vueltas;
    }
    
    //@Override
  //  public String patrocinar() {
  //      return "Circuito " + nombre + " patrocinado por " + "Mercedes";
  //  }






}
