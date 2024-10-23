package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MecanicoTest {
    @Test
	void pantalla_led_mecanico() {

     

    	INombreParaLED  mecanico = new Mecanico("Mecanico 1", null);
    	var pantallaLED = new PantallaLED(mecanico);
    	assertEquals("Mecanico: Mecanico 1", pantallaLED.getTexto());
	}

}
