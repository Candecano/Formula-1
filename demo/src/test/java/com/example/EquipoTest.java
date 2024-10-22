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












}




