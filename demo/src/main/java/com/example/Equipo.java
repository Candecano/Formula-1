package com.example;
import java.util.ArrayList;
public class Equipo implements ISponsoreable {
    private String scuderia;
    private Ingeniero ingenieroPrincipal;
    private ArrayList<Piloto> pilotos = new ArrayList<>();
    private ArrayList<Mecanico> mecanicos = new ArrayList<>();
    private ArrayList<SponsorContrato> sponsors = new ArrayList<>();
    private SponsorContrato contrato;
    private Sponsor sponsor;
    public Equipo(String scuderia, Ingeniero ingenieroPrincipal) {
        this.scuderia = scuderia;
        this.ingenieroPrincipal = ingenieroPrincipal;
    }
   

    //añadir piloto y mecanico
   
    public void añadirPiloto(Piloto piloto) {
        pilotos.add(piloto);
    }
    public void añadirMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }
   
    public String getNombre() {
        return scuderia;

    }

    public void setNombre(String scuderia) {
        this.scuderia = scuderia;
    }


    public Ingeniero getIngenieroPrincipal() {
        return ingenieroPrincipal;
    }


    public void setIngenieroPrincipal(Ingeniero ingenieroPrincipal) {
        this.ingenieroPrincipal = ingenieroPrincipal;
    }
    public ArrayList<Piloto> getPilotos() {
        return pilotos;
    }
    public ArrayList<Mecanico> getMecanicos() {
        return mecanicos;
    }


public ArrayList<Piloto> setPilotos() {
        return pilotos;
    }
    public ArrayList<Mecanico> setMecanicos() {
        return mecanicos;
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



    public void sacarPiloto(Piloto piloto) {
        pilotos.remove(piloto);
    }
    public void sacarMecanico(Mecanico mecanico) {
        mecanicos.remove(mecanico);
    }
   



//sacar pilotos, mecanicos
   
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






}