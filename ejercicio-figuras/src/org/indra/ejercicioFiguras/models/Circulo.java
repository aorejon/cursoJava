package org.indra.ejercicioFiguras.models;

public class Circulo extends Figura{
	
	private double radio;

	public Circulo(double radio, int x, int y) {
		super(x, y);
		this.radio = radio;
	}
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2.0);
	}
	
	@Override
	public double calcularPerimetro() {
		return 2.0 * Math.PI * this.radio;
	}

}
