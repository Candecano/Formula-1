package com.example;

public class PantallaLED {
    private INombreParaLED nombreParaLED;

    public PantallaLED(INombreParaLED nombreParaLED) {
        this.nombreParaLED = nombreParaLED;
    }

    public String getTexto() {
        return nombreParaLED.getNombreParaLED();
    }
}
