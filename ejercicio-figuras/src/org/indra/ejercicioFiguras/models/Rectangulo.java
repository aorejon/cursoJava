package org.indra.ejercicioFiguras.models;

public class Rectangulo extends Figura{
	
	private double ladoA;
	private double ladoB;
	
	public Rectangulo(double ladoA, double ladoB, int x, int y) {
		super(x, y);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	public Rectangulo(double ladoA, double ladoB) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public double getLadoA() {
		return ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}
	
	@Override
	public double calcularArea() {
		return this.ladoA * this.ladoB;
	}
	
	@Override
	public double calcularPerimetro() {
		return (this.ladoA*2) + (this.ladoB*2);
	}

}
