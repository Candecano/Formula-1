package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
public class EquipoTest {
    @Test 
void creacion_de_un_equipo_con_ingeniero_principal(){
  Ingeniero ingPrincipal = new Ingeniero("Bryan Bozzi", "Italiano");

  Equipo equipo = new Equipo("Ferrari", ingPrincipal);
    assertEquals("Ferrari", equipo.getNombre());
   assertEquals(ingPrincipal, equipo.getIngenieroPrincipal());

}


@Test 

void creacion_equipo_completo(){
 Ingeniero ingPrincipal = new Ingeniero("Bryan Bozzi", "Italiano");
    Piloto piloto1 = new Piloto("Carlos Sainz", "Español");
    Piloto piloto2 = new Piloto("Charles Leclerc", "Monegasco");
    Mecanico mecanico1 = new Mecanico("Juan Perez", "Español");
    Mecanico mecanico2 = new Mecanico("Pedro Martinez", "Italiano");
    


    Equipo equipo = new Equipo("Ferrari", ingPrincipal);
    equipo.añadirPiloto(piloto1);
    equipo.añadirPiloto(piloto2);
    equipo.añadirMecanico(mecanico1);
    equipo.añadirMecanico(mecanico2);
    

    assertEquals(2, equipo.getPilotos().size());
    assertEquals(2, equipo.getMecanicos().size());
    assertTrue(equipo.getPilotos().contains(piloto1));
    assertTrue(equipo.getPilotos().contains(piloto2));
    assertTrue(equipo.getMecanicos().contains(mecanico1));
    assertTrue(equipo.getMecanicos().contains(mecanico2));
    assertEquals(ingPrincipal, equipo.getIngenieroPrincipal());
}


@Test

void sale_Logan_Sargeant_entra_Colapinto_a_Williams(){
    Ingeniero ingPrincipal = new Ingeniero("James Vowles", "Britanico");
    Piloto piloto1 = new Piloto("Alex Albon", "Britanico");
    Piloto piloto2 = new Piloto("Logan Sargeant", "Estadounidense");
    Mecanico mecanico1 = new Mecanico("Juan Perez", "Español");
    Mecanico mecanico2 = new Mecanico("Pedro Martinez", "Italiano");
    
    Equipo equipo = new Equipo("Williams", ingPrincipal);
    equipo.añadirPiloto(piloto1);
    equipo.añadirPiloto(piloto2);
    equipo.añadirMecanico(mecanico1);
    equipo.añadirMecanico(mecanico2);
    assertEquals(2, equipo.getPilotos().size());
    assertTrue(equipo.getPilotos().contains(piloto1));
    assertTrue(equipo.getPilotos().contains(piloto2));

    //sale Logan Sargeant y entra Franco Colapinto
    equipo.sacarPiloto(piloto2);
    Piloto piloto3 = new Piloto("Franco Colapinto", "Argentino");
    equipo.añadirPiloto(piloto3);

    assertEquals(2, equipo.getPilotos().size());
    assertTrue(equipo.getPilotos().contains(piloto1));
    assertTrue(equipo.getPilotos().contains(piloto3));
    assertFalse(equipo.getPilotos().contains(piloto2));
  
    

}

@Test

void eliminar_piloto_y_mecanico() {
    Ingeniero ingPrincipal = new Ingeniero("Bryan Bozzi", "Italiano");
    Piloto piloto1 = new Piloto("Carlos Sainz", "Español");
    Piloto piloto2 = new Piloto("Charles Leclerc", "Monegasco");
    Mecanico mecanico1 = new Mecanico("Juan Perez", "Español");
    Mecanico mecanico2 = new Mecanico("Pedro Martinez", "Italiano");

    Equipo equipo = new Equipo("Ferrari", ingPrincipal);
    equipo.añadirPiloto(piloto1);
    equipo.añadirPiloto(piloto2);
    equipo.añadirMecanico(mecanico1);
    equipo.añadirMecanico(mecanico2);

    equipo.sacarPiloto(piloto1);
    equipo.sacarMecanico(mecanico1);

    assertEquals(1, equipo.getPilotos().size());
    assertEquals(1, equipo.getMecanicos().size());
    assertFalse(equipo.getPilotos().contains(piloto1));
    assertTrue(equipo.getPilotos().contains(piloto2));
    assertFalse(equipo.getMecanicos().contains(mecanico1));
    assertTrue(equipo.getMecanicos().contains(mecanico2));
}

@Test

void se_agreaga_un_contrato_de_sponsor(){
    //no debe estar dos veces dos sponsor en la misma ubicacion
    Equipo equipo = new Equipo("Ferrari",  new Ingeniero("Bryan Bozzi", "Italiano"));


    LocalDate fechaInicial=LocalDate.of(2024, 10, 21);
    LocalDate fechahasta=LocalDate.of(2026, 10, 21);

    //primer contrato
    SponsorContrato contrato1 = new SponsorContrato(null,"Casco", (fechaInicial), (fechahasta));

    LocalDate fechaInicial2=LocalDate.of(2024, 10, 22);
  //segundo contrato

  LocalDate fechaInicial3=LocalDate.of(2024, 11, 22);
    SponsorContrato contrato2 = new SponsorContrato(null,"Casco", (fechaInicial2), (fechaInicial3));
    
    SponsorContrato contrato3 = new SponsorContrato(null,"Traje Piloto", (fechaInicial2), null);


assertTrue(equipo.agregar(contrato3)); 
assertTrue(equipo.agregar(contrato2));
assertFalse(equipo.agregar(contrato1));

}

@Test

void se_agrega_sponsor_a_contrato(){
    Ingeniero ingPrincipal = new Ingeniero("Bryan Bozzi", "Italiano");
    Equipo equipo = new Equipo("Ferrari", ingPrincipal);
    Sponsor sponsor = new Sponsor ("Shell");
    Sponsor sponsor2 = new Sponsor ("Santander");
    equipo.agregar(sponsor, "Casco", LocalDate.now());
    //no se agrega en la misma ubicacion
    assertFalse(equipo.agregar(sponsor2, "Casco", LocalDate.now()));

}
 
@Test
void se_elimina_sponsor(){
    Ingeniero ingPrincipal = new Ingeniero("Bryan Bozzi", "Italiano");
    Equipo equipo = new Equipo("Ferrari", ingPrincipal);
    Sponsor sponsor = new Sponsor ("Shell");
    Sponsor sponsor2 = new Sponsor ("Santander");
    equipo.agregar(sponsor, "Casco", LocalDate.now());
    equipo.agregar(sponsor2, "Traje del Piloto", LocalDate.now());
    equipo.remover(sponsor);
    assertEquals(1, equipo.getSponsors().size());
    assertEquals("Santander", equipo.getSponsors().get(0).getSponsor().getNombre());
}











}




