package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Piloto extends Persona  {
private ArrayList<SponsorContrato> sponsors = new ArrayList<>();
    private SponsorContrato contrato;
    private Sponsor sponsor;
    private Equipo equipo;
    private Carrera carrera;
    public Piloto(String nombre, String nacionalidad) {
        super(nombre, nacionalidad);    
    }

 public SponsorContrato getContrato() {
        return contrato;
    }

    public void setContrato(SponsorContrato contrato) {
        this.contrato = contrato;
    }


    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public Equipo getEquipo() {

        return equipo;

    }



    public Carrera getCarrera() {

        return carrera;

    }





@Override
public boolean agregar(SponsorContrato contrato) {
    for (SponsorContrato existeSponsorMismaUbicacion : sponsors) {
        if (existeSponsorMismaUbicacion.getUbicacion().equals(contrato.getUbicacion())) {
            return false;
        }
    }
    sponsors.add(contrato);

    return true;
}

 @Override
    public boolean agregar(Sponsor sponsor, String ubicacion, LocalDate fechaDesde) {
        SponsorContrato nuevoContrato = new SponsorContrato(sponsor, ubicacion, fechaDesde, null);
        return agregar(nuevoContrato);
    }


 @Override
    public ArrayList<SponsorContrato> getSponsors() {
        return sponsors;
    }

 @Override
    public void remover(Sponsor sponsor) {
        sponsors.removeIf(contrato -> contrato.getSponsor() != null && contrato.getSponsor().getNombre().equals(sponsor.getNombre()));
    }

@Override
    public void remover(Sponsor sponsor, String ubicacion) {
        sponsors.removeIf(contrato -> contrato.getSponsor() != null && contrato.getSponsor().getNombre().equals(sponsor.getNombre()) && contrato.getUbicacion().equals(ubicacion));
    }

@Override
public ArrayList<Sponsor> sponsorsHabilitados() {
    
    List<Sponsor> habilitados = sponsors.stream()
        .filter(contrato -> contrato.getFechaHasta() == null)
        .map(SponsorContrato::getSponsor)  
        .collect(Collectors.toList());      

    return new ArrayList<>(habilitados);
}

public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    
}

public Piloto(String nombre) {
    super(nombre, nombre);
}

@Override
public String getNombreParaLED() {
    return "Piloto: " + super.getNombreParaLED();
}

}