package com.example;
import java.util.ArrayList;
public class Equipo {
    private String scuderia;
    private Ingeniero ingenieroPrincipal;
    private ArrayList<Piloto> pilotos = new ArrayList<>();
    private ArrayList<Mecanico> mecanicos = new ArrayList<>();
 
    public Equipo(String scuderia, Ingeniero ingenieroPrincipal) {
        this.scuderia = scuderia;
        this.ingenieroPrincipal = ingenieroPrincipal;
    }
   

    //añadir piloto y mecanico
   
    public void añadirPiloto(Piloto piloto) {
        pilotos.add(piloto);
    }
    public void añadirMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }
   
    public String getNombre() {
        return scuderia;

    }

    public void setNombre(String scuderia) {
        this.scuderia = scuderia;
    }


    public Ingeniero getIngenieroPrincipal() {
        return ingenieroPrincipal;
    }


    public void setIngenieroPrincipal(Ingeniero ingenieroPrincipal) {
        this.ingenieroPrincipal = ingenieroPrincipal;
    }
    public ArrayList<Piloto> getPilotos() {
        return pilotos;
    }
    public ArrayList<Mecanico> getMecanicos() {
        return mecanicos;
    }


public ArrayList<Piloto> setPilotos() {
        return pilotos;
    }
    public ArrayList<Mecanico> setMecanicos() {
        return mecanicos;
    }


//sacar pilotos, mecanicos
   
    public void sacarPiloto(Piloto piloto) {
        pilotos.remove(piloto);
    }
    public void sacarMecanico(Mecanico mecanico) {
        mecanicos.remove(mecanico);
    }
   



}
