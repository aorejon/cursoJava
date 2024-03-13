package org.indra.ejercicioFiguras.main;

import java.awt.Rectangle;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import org.indra.ejercicioFiguras.models.*;

public class Program {

	public static void main(String[] args) {

		/*
		 * List<Figura> figuras = new ArrayList<Figura>() {{ add(new Circulo(4.0, 0,
		 * 0)); add(new Rectangulo(2.0, 3.0, 1, 1)); add(new Triangulo(5.0, 3.0, 2, 2));
		 * }};
		 * 
		 * Circulo cir = new Circulo(4.0, 0, 0); Rectangulo rec = new Rectangulo(2.0,
		 * 3.0, 1, 1); Triangulo tri = new Triangulo(5.0, 3.0, 2, 2);
		 * 
		 * System.out.println("El área del círculo es: " + cir.calcularArea() +
		 * " y el perímetro es: " + cir.calcularPerimetro());
		 * System.out.println("El área del rectángulo es: " + rec.calcularArea() +
		 * " y el perímetro es: " + rec.calcularPerimetro());
		 * System.out.println("El área del triángulo es: " + tri.calcularArea() +
		 * " y el perímetro es: " + tri.calcularPerimetro());
		 */

		List<Figura> dibujo = new ArrayList<Figura>();
		int contador = 20;
		Random random = new Random();
		int numAzar = random.nextInt(1, 4);
		double valorAzar = random.nextDouble(1, 100);

		while (contador != 0) {
			switch (numAzar) {
			case 1: {
				dibujo.add(new Circulo(valorAzar));
				contador--;
				break;
			}
			case 2: {
				dibujo.add(new Rectangulo(valorAzar, valorAzar));
				contador--;
				break;
			}
			case 3: {
				dibujo.add(new Triangulo(valorAzar, valorAzar));
				contador--;
				break;
			}
			}
		}
		
		//Figura con mayor area
		Figura mayorArea = dibujo.stream().max(Comparator.comparingDouble(f -> f.calcularArea())).orElse(null);
		System.out.println(MessageFormat.format("{0} de area {1}", mayorArea.getClass().getSimpleName(), mayorArea.calcularArea()));
		
		//Figura con menor perimetro
		Figura menorPerimetro = dibujo.stream().min(Comparator.comparingDouble(f -> f.calcularPerimetro())).orElse(null);
		System.out.println(MessageFormat.format("{0} de perimetro {1}", menorPerimetro.getClass().getSimpleName(), menorPerimetro.calcularPerimetro()));
		
		//Referencia a una interfaz puede apuntar a cualquier objeto de las clases que la implementan
		AreaCalculable a = new Rectangulo(10, 10);
		a = new Terreno(122, 200);
	}

}
