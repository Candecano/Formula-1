package com.example;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filtros {
    private ArrayList<Piloto> pilotos;
    private ArrayList<Circuito> circuitos;

    public Filtros(ArrayList<Piloto> pilotos , ArrayList<Circuito> circuitos) {
        this.pilotos = pilotos;
        this.circuitos = circuitos;
    }
     
   
    

    public ArrayList<Piloto> filtrarPilotos(Predicate<Piloto> filtro) {
        return pilotos.stream()
                .filter(filtro)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public Predicate<Piloto> filtroPorNacionalidad(String nacionalidad) {
        Predicate<Piloto> filtro= e -> e.getNacionalidad().equalsIgnoreCase(nacionalidad);
        return filtro;
}
 public Predicate<Piloto> filtroPorEquipoenCarrera(Equipo equipo, Carrera carrera){
    Predicate<Piloto> filtro = e -> e.getEquipo().equals(equipo) && e.getCarrera().equals(carrera);
    return filtro;
 }
 public ArrayList<Circuito> filtrarCircuitos(Predicate<Circuito> filtro) {
    return circuitos.stream()
            .filter(filtro)
            .collect(Collectors.toCollection(ArrayList::new));
}

public Predicate<Circuito> filtroPorLongitudMayorA(double longitud) {
    Predicate<Circuito> filtro = c -> c.getLongitud() > longitud;
    return filtro;
}








}
