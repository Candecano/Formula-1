package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Circuito implements ISponsoreable {
    private String nombre;
    private double longitud;
    private int vueltasCantidad;
     private ArrayList<SponsorContrato> sponsors = new ArrayList<>();
    private SponsorContrato contrato;
    private Sponsor sponsor;

    public Circuito(String nombre, double longitud, int vueltasCantidad) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.vueltasCantidad = vueltasCantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public int getVueltas() {
        return vueltasCantidad;
    }
    public void setVueltas(int vueltas) {
        this.vueltasCantidad = vueltas;
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




}
