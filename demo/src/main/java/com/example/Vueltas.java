package com.example;

public class Vueltas {

    private Piloto piloto;
    private Equipo equipo;
 private Circuito circuito;
private double duracionVuelta;

    public Vueltas(Piloto piloto, Equipo equipo, Circuito circuito, double duracionVuelta) {
        this.piloto = piloto;
        this.equipo = equipo;
        this.circuito = circuito;
        this.duracionVuelta = duracionVuelta;
       
    }

   
    public Piloto getPiloto() {
        return piloto;
    }
    public Equipo getEquipo() {
        return equipo;
    }
public Circuito getCircuito() {
    return circuito;
    
}


public Double getDuracionVuelta() {
    return duracionVuelta;
}



    

}