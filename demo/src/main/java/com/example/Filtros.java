package com.example;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filtros {
    private ArrayList<Piloto> pilotos;

    public Filtros(ArrayList<Piloto> pilotos) {
        this.pilotos = pilotos;
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

}
