package com.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Persona implements ISponsoreable {
    
   private String nombre;
   private String nacionalidad;

   public Persona(String nombre, String nacionalidad) {
       this.nombre = nombre;
       this.nacionalidad = nacionalidad;
   }

public String getNombre() {
    return nombre;

    }

public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 public String getNacionalidad() {
        return nacionalidad;
    }

public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

//para heredarle los metodos de Isponsoreable a piloto
@Override
public boolean agregar(SponsorContrato contrato) {
    return false;

}

@Override
public void agregar(Sponsor sponsor, String ubicacion, LocalDate fechaHasta) {


}

@Override
public void remover(Sponsor sponsor) {

}

@Override
public void remover(String nombre) {

}
@Override
public void remover(Sponsor sponsor, String ubicacion) {

}
@Override
public ArrayList<Sponsor> sponsorsHabilitados() {
    return null;
}
@Override
public ArrayList<SponsorContrato> getSponsors() {
    return null;
}

}
