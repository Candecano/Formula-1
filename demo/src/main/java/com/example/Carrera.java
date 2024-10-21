package com.example;
import java.time.*;
public class Carrera {
    private String nombreCarrera;
    private LocalDate fechaCarrera;
    

    public Carrera(String nombreCarrera, LocalDate fechaCarrera) {
        this.nombreCarrera = nombreCarrera;
        this.fechaCarrera = fechaCarrera;
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
}
