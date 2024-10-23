package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class PilotoTest {

@Test
void creacion_de_un_piloto(){
    Piloto piloto = new Piloto("Carlos Sainz", "Español");
    assertEquals("Carlos Sainz", piloto.getNombre());
    assertEquals("Español", piloto.getNacionalidad());

    
}

@Test

void se_agrega_un_contrato_de_sponsor(){
   //no debe estar dos veces dos sponsor en la misma ubicacion
   Piloto piloto = new Piloto("Carlos Sainz", "Español");


   LocalDate fechaInicial=LocalDate.of(2024, 10, 21);
   LocalDate fechahasta=LocalDate.of(2026, 10, 21);

   //primer contrato
   SponsorContrato contrato1 = new SponsorContrato(null,"Gorra", (fechaInicial), (fechahasta));

   LocalDate fechaInicial2=LocalDate.of(2024, 10, 22);
 //segundo contrato

 LocalDate fechaInicial3=LocalDate.of(2024, 11, 22);
   SponsorContrato contrato2 = new SponsorContrato(null,"Gorra", (fechaInicial2), (fechaInicial3));
   
   SponsorContrato contrato3 = new SponsorContrato(null,"Remera", (fechaInicial2), null);


assertTrue(piloto.agregar(contrato3)); 
assertTrue(piloto.agregar(contrato2));
assertFalse(piloto.agregar(contrato1));
    

}

@Test

void se_agrega_sponsor_a_contrato(){
    Piloto piloto = new Piloto("Carlos Sainz", "Español");
    Sponsor sponsor = new Sponsor ("Shell");
    Sponsor sponsor2 = new Sponsor ("Santander");
    piloto.agregar(sponsor, "Gorra", LocalDate.now());
    //no se agrega en la misma ubicacion
    assertFalse(piloto.agregar(sponsor2, "Gorra", LocalDate.now()));

}
 
@Test
void se_elimina_sponsor(){
Piloto piloto = new Piloto("Carlos Sainz", "Español");
    Sponsor sponsor = new Sponsor ("Shell");
    Sponsor sponsor2 = new Sponsor ("Santander");
    piloto.agregar(sponsor, "Gorra", LocalDate.now());
    piloto.agregar(sponsor2, "Buzo", LocalDate.now());
    piloto.remover(sponsor);
    assertEquals(1, piloto.getSponsors().size());
    assertEquals("Santander", piloto.getSponsors().get(0).getSponsor().getNombre());
}



@Test
void se_elimina_sponsor_por_ubicacion() {
    Piloto piloto = new Piloto("Carlos Sainz", "Español");
    Sponsor sponsor = new Sponsor("Shell");
    piloto.agregar(sponsor, "Gorra", LocalDate.now());
    piloto.agregar(sponsor, "Remera", LocalDate.now());
    piloto.remover(sponsor, "Gorra");
    assertEquals(1, piloto.getSponsors().size());
    assertEquals("Shell", piloto.getSponsors().get(0).getSponsor().getNombre());
}

@Test
void se_fitra_sponsors_habilitados(){
    Piloto piloto = new Piloto("Carlos Sainz", "Español");
    Sponsor sponsor1 = new Sponsor("Shell");
    Sponsor sponsor2 = new Sponsor("Santander");
    Sponsor sponsor3 = new Sponsor("Pirelli");
    LocalDate fechaDesde1 = LocalDate.of(2024, 11, 21);
    LocalDate fechaHasta1 = LocalDate.of(2026, 11, 22);
    

    piloto.agregar(new SponsorContrato(sponsor1, "Remera", fechaDesde1, fechaHasta1));
    piloto.agregar(new SponsorContrato(sponsor2, "Campera", fechaDesde1, fechaHasta1));
    piloto.agregar(new SponsorContrato(sponsor3, "Gorra", fechaDesde1, null));

    ArrayList<Sponsor> sponsorsHabilitados = piloto.sponsorsHabilitados();
    assertEquals(1, sponsorsHabilitados.size());
    assertTrue(sponsorsHabilitados.contains(sponsor3));
   
    
}

@Test

void pantalla_led_piloto() {
    INombreParaLED  piloto =  new Piloto("Franco Colapinto", "Argentino");
    var pantallaLED = new PantallaLED(piloto);
    assertEquals("Piloto: Franco Colapinto", pantallaLED.getTexto());
}




}