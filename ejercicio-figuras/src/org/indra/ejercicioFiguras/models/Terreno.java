package org.indra.ejercicioFiguras.models;

public class Terreno implements AreaCalculable{
	
	private double largo;
	private double ancho;
	
	public Terreno(double largo, double ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public double getAncho() {
		return ancho;
	}

	@Override
	public double calcularArea() {
		return this.ancho * this.largo;
	}

}
