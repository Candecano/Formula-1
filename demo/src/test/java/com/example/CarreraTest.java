package com.example;

import static org.junit.jupiter.api.Assertions.*;
import java.time.*;
import org.junit.jupiter.api.Test;





public class CarreraTest {
    @Test

void se_establece_fecha_de_carrera(){
    LocalDate fechaInicial=LocalDate.of(2024, 10, 21);
    Carrera carrera = new Carrera ("Gran Premio de Las Vegas", (fechaInicial));
 
    //fecha correcta
    assertEquals(fechaInicial, carrera.getFecha());
    assertEquals("Gran Premio de Las Vegas", carrera.getNombreCarrera());



}

@Test
void se_cambia_la_fecha_de_una_carrera(){
    LocalDate fechaInicial=LocalDate.of(2024, 10, 21);
    Carrera carrera = new Carrera ("Gran Premio de Las Vegas", (fechaInicial));
    LocalDate fechaNueva=LocalDate.of(2024, 10, 22);
    carrera.setFecha(fechaNueva);
    assertEquals(fechaNueva, carrera.getFecha());
    assertEquals("Gran Premio de Las Vegas", carrera.getNombreCarrera());
}


}
