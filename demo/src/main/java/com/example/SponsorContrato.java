package com.example;
import java.time.*;
public class SponsorContrato {
    private String ubicacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private Sponsor sponsor;

    public SponsorContrato(Sponsor sponsor, String ubicacion, LocalDate fechaDesde, LocalDate fechaHasta) {
        if (fechaHasta != null && (fechaHasta.isEqual(fechaDesde) || fechaHasta.isBefore(fechaDesde))) {
            throw new IllegalArgumentException("La fecha hasta debe ser distinta y posterior a la fecha desde.");
        }
        this.sponsor = sponsor;
        this.ubicacion = ubicacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        if (fechaHasta != null && (fechaHasta.isEqual(fechaDesde) || fechaHasta.isBefore(fechaDesde))) {
            throw new IllegalArgumentException("La fecha hasta debe ser distinta y posterior a la fecha desde.");
        }
        this.fechaHasta = fechaHasta;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }
}

