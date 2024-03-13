package org.indra.ejercicioFiguras.models;

public class Triangulo extends Figura{

	private double base;
	private double altura;
	
	public Triangulo(double base, double altura, int x, int y) {
		super(x, y);
		this.base = base;
		this.altura = altura;
	}
	
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}
	
	public double calcularHipotenusa() {
		return Math.sqrt(Math.pow(altura, 2.0) + Math.pow(base, 2.0));
	}
	
	@Override
	public double calcularArea() {
		return (this.base * this.altura)/2;
	}
	
	@Override
	public double calcularPerimetro() {
		return calcularHipotenusa() + this.altura + this.base;
	}
}
