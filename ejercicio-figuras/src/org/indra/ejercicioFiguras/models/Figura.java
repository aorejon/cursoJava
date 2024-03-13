package org.indra.ejercicioFiguras.models;

public abstract class Figura implements AreaCalculable{
	
	protected int x;
	protected int y;
	
	
	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	public Figura() {
		
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
}
