package com.example;
import static org.junit.jupiter.api.Assertions.*;
import java.time.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
public class VueltasTest {
    @Test


    void se_registra_vuelta_de_piloto_en_un_circuito(){
        Circuito circuito = new Circuito("Interlagos", 4.309, 71);
        LocalDate fechaInicial = LocalDate.of(2024, 11, 17);
        Carrera carrera = new Carrera("Gran Premio de Brasil", fechaInicial, circuito,new ArrayList<>());
       
        Piloto piloto1 = new Piloto("Carlos Sainz", "Español");
        Ingeniero ingPrincipal1 = new Ingeniero("Bryan Bozzi", "Italiano");
        Equipo ferrari = new Equipo("Ferrari", ingPrincipal1);

        Vueltas vuelta1 = new Vueltas (piloto1, ferrari, circuito,95.5);
        Vueltas vuelta2 = new Vueltas (piloto1, ferrari, circuito,90.5);
        Vueltas vuelta3 = new Vueltas (piloto1, ferrari, circuito,85.5);

        carrera.getVueltas().add(vuelta1);
        carrera.getVueltas().add(vuelta2);
        carrera.getVueltas().add(vuelta3);


      assert (carrera != null);
        assert (carrera.getVueltas().size() == 3);
        assertEquals(piloto1, vuelta1.getPiloto());
        assertEquals(ferrari, vuelta1.getEquipo());
        assertEquals(circuito, vuelta1.getCircuito());
        assertEquals(95.5, vuelta1.getDuracionVuelta());



     assertEquals(piloto1, vuelta2.getPiloto());
     assertEquals(ferrari, vuelta2.getEquipo());
    assertEquals(circuito, vuelta2.getCircuito());
    assertEquals(90.5, vuelta2.getDuracionVuelta());


    assertEquals(piloto1, vuelta3.getPiloto());
    assertEquals(ferrari, vuelta3.getEquipo());
    assertEquals(circuito, vuelta3.getCircuito());
    assertEquals(85.5, vuelta3.getDuracionVuelta());
    






    }
}
