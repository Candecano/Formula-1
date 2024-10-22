package com.example;
import java.time.*;
import java.util.ArrayList;
public class Carrera {
    private String nombreCarrera;
    private LocalDate fechaCarrera;
    private Circuito circuito;
    private ArrayList<Piloto> participantes = new ArrayList<>();

    public Carrera(String nombreCarrera, LocalDate fechaCarrera, Circuito circuito) {
        this.nombreCarrera = nombreCarrera;
        this.fechaCarrera = fechaCarrera;
        this.circuito = circuito;
    }
    public LocalDate getFecha() {
        return fechaCarrera;
    }

    public void setFecha(LocalDate fecha) {
        this.fechaCarrera = fecha;
    }



    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    public ArrayList<Piloto> getParticipantes() {
        return participantes;
    }

    public ArrayList<Piloto> setParticipantes() {
        return participantes;
    }




    public void añadirParticipantes(Piloto piloto) {
        participantes.add(piloto);
    }
    public void sacarPiloto(Piloto piloto) {
        participantes.remove(piloto);
    }






}
