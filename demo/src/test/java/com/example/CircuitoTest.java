package com.example;

import static org.junit.jupiter.api.Assertions.*;
import java.time.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class CircuitoTest {
    @Test
    void creacion_de_un_circuito(){
        Circuito circuito = new Circuito("Monaco", 3.34, 78);
        assertEquals("Monaco", circuito.getNombre());
        assertEquals(3.34, circuito.getLongitud());
        assertEquals(78, circuito.getVueltas());
    }

    @Test

void se_agrega_un_contrato_de_sponsor(){
   //no debe estar dos veces dos sponsor en la misma ubicacion
   Circuito circuito = new Circuito("Monaco", 3.34, 78);


   LocalDate fechaInicial=LocalDate.of(2024, 10, 21);
   LocalDate fechahasta=LocalDate.of(2026, 10, 21);

   //primer contrato
   SponsorContrato contrato1 = new SponsorContrato(null,"Pista", (fechaInicial), (fechahasta));

   LocalDate fechaInicial2=LocalDate.of(2024, 10, 22);
 //segundo contrato

 LocalDate fechaInicial3=LocalDate.of(2024, 11, 22);
   SponsorContrato contrato2 = new SponsorContrato(null,"Pista", (fechaInicial2), (fechaInicial3));
   
   SponsorContrato contrato3 = new SponsorContrato(null,"Lateral de Pista", (fechaInicial2), null);


assertTrue(circuito.agregar(contrato3)); 
assertTrue(circuito.agregar(contrato2));
assertFalse(circuito.agregar(contrato1));
    

}

@Test

void se_agrega_sponsor_a_contrato(){
    Circuito circuito = new Circuito("Monaco", 3.34, 78);


    Sponsor sponsor = new Sponsor ("Shell");
    Sponsor sponsor2 = new Sponsor ("Santander");
  circuito.agregar(sponsor, "Pista", LocalDate.now());
    //no se agrega en la misma ubicacion
    assertFalse(circuito.agregar(sponsor2, "Pista", LocalDate.now()));

}
 
@Test
void se_elimina_sponsor(){
    Circuito circuito = new Circuito("Monaco", 3.34, 78);


    Sponsor sponsor = new Sponsor ("Shell");
    Sponsor sponsor2 = new Sponsor ("Santander");
    circuito.agregar(sponsor, "Pista", LocalDate.now());
    circuito.agregar(sponsor2, "Bandera", LocalDate.now());
    circuito.remover(sponsor);
    assertEquals(1, circuito.getSponsors().size());
    assertEquals("Santander", circuito.getSponsors().get(0).getSponsor().getNombre());
}



@Test
void se_elimina_sponsor_por_ubicacion() {
    Circuito circuito = new Circuito("Monaco", 3.34, 78);
    Sponsor sponsor = new Sponsor("Shell");
    circuito.agregar(sponsor, "Pista", LocalDate.now());
    circuito.agregar(sponsor, "Bandera", LocalDate.now());
    circuito.remover(sponsor, "Pista");
    assertEquals(1, circuito.getSponsors().size());
    assertEquals("Shell", circuito.getSponsors().get(0).getSponsor().getNombre());
}

@Test
void se_fitra_sponsors_habilitados(){
    Circuito circuito = new Circuito("Monaco", 3.34, 78);

    Sponsor sponsor1 = new Sponsor("Shell");
    Sponsor sponsor2 = new Sponsor("Santander");
    Sponsor sponsor3 = new Sponsor("Pirelli");
    LocalDate fechaDesde1 = LocalDate.of(2024, 11, 21);
    LocalDate fechaHasta1 = LocalDate.of(2026, 11, 22);
    

    circuito.agregar(new SponsorContrato(sponsor1, "Bandera", fechaDesde1, fechaHasta1));
    circuito.agregar(new SponsorContrato(sponsor2, "Pista", fechaDesde1, fechaHasta1));
    circuito.agregar(new SponsorContrato(sponsor3, "Lateral de Pista", fechaDesde1, null));

    ArrayList<Sponsor> sponsorsHabilitados = circuito.sponsorsHabilitados();
    assertEquals(1, sponsorsHabilitados.size());
    assertTrue(sponsorsHabilitados.contains(sponsor3));
   
    
}




















}
