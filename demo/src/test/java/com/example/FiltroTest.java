package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;

public class FiltroTest {

    @Test
    void filtro_pilotos_por_nacionalidad_en_una_carrera() {
Circuito interlagos = new Circuito("Interlagos", 4.309, 71);
LocalDate fechaInicial = LocalDate.of(2024, 11, 17);
Carrera carrera = new Carrera ("Gran Premio de Brasil", (fechaInicial), interlagos);
   Piloto piloto1 = new Piloto("Carlos Sainz", "Español");
   Piloto piloto2 = new Piloto("Charles Leclerc", "Monegasco");
   Piloto piloto3 = new Piloto("Franco Colapinto", "Argentino");
   Piloto piloto4 = new Piloto("Max Verstappen", "Neerlandes");
   Piloto piloto5 = new Piloto("Pierre Gasly", "Frances");
    Piloto piloto6 = new Piloto("Esteban Ocon", "Frances");
   
carrera.añadirParticipantes(piloto1);
carrera.añadirParticipantes(piloto2);
carrera.añadirParticipantes(piloto3);
carrera.añadirParticipantes(piloto4);
carrera.añadirParticipantes(piloto5);
carrera.añadirParticipantes(piloto6);

Filtros filtros = new Filtros(carrera.getParticipantes());
Predicate<Piloto> filtroNacioanlidadFrances = filtros.filtroPorNacionalidad("Frances");
ArrayList<Piloto> pilotosFranceses = filtros.filtrarPilotos(filtroNacioanlidadFrances);
assertEquals(2, pilotosFranceses.size());
assertTrue(pilotosFranceses.contains(piloto5));
assertTrue(pilotosFranceses.contains(piloto6));

//FILTRO COMPUESTO
//Predicate<Piloto> filtroNacionalidadYNombre = filtroNacioanlidadFrances.and(e -> e.getNombre().startsWith("P"));
//ArrayList<Piloto> pilotosFrancesesYP = filtros.filtrarPilotos(filtroNacionalidadYNombre);
//assertEquals(1, pilotosFrancesesYP.size());
//assertTrue(pilotosFrancesesYP.contains(piloto5));








    }
}
