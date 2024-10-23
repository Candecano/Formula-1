package com.example;

import java.time.LocalDate;
import java.util.ArrayList;

public interface ISponsoreable {

 public  ArrayList<SponsorContrato> getSponsors();

 public boolean agregar (SponsorContrato contrato);

public boolean agregar (Sponsor sponsor, String ubicacion, LocalDate fechaHasta);

public void remover (Sponsor sponsor);
public void remover(Sponsor sponsor, String ubicacion);
public ArrayList<Sponsor> sponsorsHabilitados();

}
