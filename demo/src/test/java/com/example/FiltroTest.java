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
Carrera carrera = new Carrera ("Gran Premio de Brasil", (fechaInicial), interlagos,null);
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

Filtros filtros = new Filtros(carrera.getParticipantes(), null);
Predicate<Piloto> filtroNacioanlidadFrances = filtros.filtroPorNacionalidad("Frances");
ArrayList<Piloto> pilotosFranceses = filtros.filtrarPilotos(filtroNacioanlidadFrances);
assertEquals(2, pilotosFranceses.size());
assertTrue(pilotosFranceses.contains(piloto5));
assertTrue(pilotosFranceses.contains(piloto6));



    }

@Test
void filtro_pilotos_de_un_equipo_en_una_carrera(){
    Ingeniero ingPrincipal1 = new Ingeniero("Bryan Bozzi", "Italiano");
    Ingeniero ingPrincipal2 = new Ingeniero("James Vowles ", "Britanico");

Equipo ferrari = new Equipo("Ferrari", ingPrincipal1);
Equipo williams = new Equipo("Williams", ingPrincipal2);
Piloto piloto1 = new Piloto("Carlos Sainz", "Español");
Piloto piloto2 = new Piloto("Charles Leclerc", "Monegasco");
Piloto piloto3 = new Piloto("Franco Colapinto", "Argentino");
Piloto piloto4 = new Piloto("Alex Albon", "Britanico");
Circuito interlagos = new Circuito("Interlagos", 4.309, 71);
LocalDate fechaInicial = LocalDate.of(2024, 11, 17);
Carrera carrera = new Carrera("Gran Premio de Brasil", fechaInicial, interlagos,null);
carrera.añadirParticipantes(piloto1);
carrera.añadirParticipantes(piloto2);
carrera.añadirParticipantes(piloto3);
carrera.añadirParticipantes(piloto4);

ferrari.añadirPiloto(piloto1);
ferrari.añadirPiloto(piloto2);
piloto1.setEquipo(ferrari);
piloto2.setEquipo(ferrari);
piloto1.setCarrera(carrera);
piloto2.setCarrera(carrera);

williams.añadirPiloto(piloto3);
williams.añadirPiloto(piloto4);
piloto3.setEquipo(williams);
piloto4.setEquipo(williams);
piloto3.setCarrera(carrera);
piloto4.setCarrera(carrera);

Filtros filtros = new Filtros(carrera.getParticipantes(), null);
Predicate<Piloto> filtroPilotosFerrari = filtros.filtroPorEquipoenCarrera(ferrari, carrera);
ArrayList<Piloto> pilotosFerrari = filtros.filtrarPilotos(filtroPilotosFerrari);

assertEquals(2, pilotosFerrari.size());
assertTrue(pilotosFerrari.contains(piloto1));
assertTrue(pilotosFerrari.contains(piloto2));
assertFalse (pilotosFerrari.contains(piloto3));

}


@Test

void filtro_de_circuitos_mayores_a__una_logitud(){
    Circuito circuito1 = new Circuito("Monaco", 3.34, 78);
    Circuito circuito2 = new Circuito("Silverstone", 5.891, 52);
    Circuito circuito3 = new Circuito("Spa-Francorchamps", 7.004, 44);
    Circuito circuito4 = new Circuito("Interlagos", 4.309, 71);
    ArrayList<Circuito> circuitos = new ArrayList<>();
    circuitos.add(circuito1);
    circuitos.add(circuito2);
    circuitos.add(circuito3);
    circuitos.add(circuito4);

Filtros filtros = new Filtros(new ArrayList<>(), circuitos);
        Predicate<Circuito> filtroLongitudMayorA = filtros.filtroPorLongitudMayorA(5.0);
        ArrayList<Circuito> circuitosFiltrados = filtros.filtrarCircuitos(filtroLongitudMayorA);

        assertEquals(2, circuitosFiltrados.size());
        assertTrue(circuitosFiltrados.contains(circuito2));
        assertTrue(circuitosFiltrados.contains(circuito3));





}






}
