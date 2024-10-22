package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
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







}




