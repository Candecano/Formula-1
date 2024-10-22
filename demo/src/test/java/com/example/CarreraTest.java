package com.example;

import static org.junit.jupiter.api.Assertions.*;
import java.time.*;
import org.junit.jupiter.api.Test;





public class CarreraTest {
    @Test

void se_establece_fecha_de_carrera_sin_circuito(){
    LocalDate fechaInicial=LocalDate.of(2024, 10, 21);
    Carrera carrera = new Carrera ("Gran Premio de Las Vegas", (fechaInicial), null);
 
    //fecha correcta
    assertEquals(fechaInicial, carrera.getFecha());
    assertEquals("Gran Premio de Las Vegas", carrera.getNombreCarrera());



}

@Test
void se_cambia_la_fecha_de_una_carrera(){
    LocalDate fechaInicial=LocalDate.of(2024, 10, 21);
    Carrera carrera = new Carrera ("Gran Premio de Las Vegas", (fechaInicial), null);
    LocalDate fechaNueva=LocalDate.of(2024, 10, 22);
    carrera.setFecha(fechaNueva);
    assertEquals(fechaNueva, carrera.getFecha());
    assertEquals("Gran Premio de Las Vegas", carrera.getNombreCarrera());
}

@Test 

void se_crea_el_Gran_Premio_de_Brasil(){
    LocalDate fechaInicial=LocalDate.of(2024, 10, 21);
   Circuito interlagos = new Circuito("Interlagos", 4.309, 71);
   Carrera carrera = new Carrera ("Gran Premio de Brasil", (fechaInicial), interlagos);
   Piloto piloto1 = new Piloto("Carlos Sainz", "Español");
   Piloto piloto2 = new Piloto("Charles Leclerc", "Monegasco");
   Piloto piloto3 = new Piloto("Franco Colapinto", "Argentino");
   Piloto piloto4 = new Piloto("Max Verstappen", "Neerlandes");

   
carrera.añadirParticipantes(piloto4);
carrera.añadirParticipantes(piloto3);
carrera.añadirParticipantes(piloto2);
carrera.añadirParticipantes(piloto1);




    assertEquals("Gran Premio de Brasil", carrera.getNombreCarrera());
    assertEquals("Interlagos", carrera.getCircuito().getNombre());
    assertEquals(4.309, carrera.getCircuito().getLongitud());
    assertEquals(71, carrera.getCircuito().getVueltas());
    assertEquals(4, carrera.getParticipantes().size());
    assertEquals(2024,(carrera.getFecha().getYear()));


}

@Test

void se_agrega_más_pilotos_a_la_carrera_y_se_saca_uno(){
    LocalDate fechaInicial=LocalDate.of(2024, 10, 21);
   Circuito interlagos = new Circuito("Interlagos", 4.309, 71);
   Carrera carrera = new Carrera ("Gran Premio de Brasil", (fechaInicial), interlagos);
   Piloto piloto1 = new Piloto("Carlos Sainz", "Español");
   Piloto piloto2 = new Piloto("Charles Leclerc", "Monegasco");
   Piloto piloto3 = new Piloto("Logan Sargeant", "NorteAmericano");
   Piloto piloto4 = new Piloto("Max Verstappen", "Neerlandes");

   carrera.añadirParticipantes(piloto4);
  carrera.añadirParticipantes(piloto3);
   carrera.añadirParticipantes(piloto2);
   carrera.añadirParticipantes(piloto1);

carrera.sacarPiloto(piloto3);

Piloto piloto5 = new Piloto("Franco Colapinto", "Argentino");
Piloto piloto6 = new Piloto("Alex Albon", "Britanico");

carrera.añadirParticipantes(piloto5);
carrera.añadirParticipantes(piloto6);

assertEquals(5, carrera.getParticipantes().size());
assertTrue(carrera.getParticipantes().contains(piloto1));
assertTrue(carrera.getParticipantes().contains(piloto2));
assertTrue(carrera.getParticipantes().contains(piloto4));
assertTrue(carrera.getParticipantes().contains(piloto5));
assertTrue(carrera.getParticipantes().contains(piloto6));
assertFalse(carrera.getParticipantes().contains(piloto3));


}
}