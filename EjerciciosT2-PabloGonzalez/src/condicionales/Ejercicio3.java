package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int animales;
		
		double comida;
		
		double comidaComprada;
		
		System.out.println("Dime cuantos animales tienes:");
		animales = sc.nextInt();
		
		System.out.println("Dime cuanto comen en total los animales:");
		comida = sc.nextDouble();
		
		System.out.println("Dime cuanta comida has comprado");
		comidaComprada = sc.nextDouble();
		
		if (animales > 0) {
			comida /= animales;
			comidaComprada /= animales;
			System.out.println("Cada animal consume " + comida + " KG cada uno");
			if (comidaComprada >= comida) {
				System.out.println("Hay comida suficiente para cada animal");
			} else {
				System.out.println("No hay comida suficiente, faltaría " + (comida - comidaComprada) + " KG para cada animal");
			}
		} else {
			System.out.println("No hay animales en la granja");
		}
		
		sc.close();
	

	}

}
