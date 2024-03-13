package org.indra.ejercicioFiguras.test;

import static org.junit.jupiter.api.Assertions.*;
import org.indra.ejercicioFiguras.models.*;
import org.junit.jupiter.api.Test;

class FiguraTest {

	@Test
	void testRectangulo() {
		Rectangulo rec = new Rectangulo(2.0, 2.0);
		assertEquals(4, rec.calcularArea());
		assertEquals(8, rec.calcularPerimetro());
	}
	
	@Test
	void testTriangulo() {
		Triangulo tri = new Triangulo(5.0, 3.0);
		assertEquals(7.5,tri.calcularArea());
		assertEquals(13.83, tri.calcularPerimetro(), 0.01);
	}
	
	@Test
	void testCirculo() {
		Circulo cir = new Circulo(5.0);
		assertEquals(78.5, cir.calcularArea(), 0.1);
		assertEquals(31.4, cir.calcularPerimetro(), 0.1);
	}

}
