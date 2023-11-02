package condicionales;

import java.util.Scanner;

		/**
		 * PRUEBAS
		 * 
		 * 1. Valores Introducidos: Animales: 5, Comida total: 20.0, Comida comprada: 25.0
		 * Respuesta Esperada: Cada animal consume 4.0 KG cada uno
		 *					   Hay comida suficiente para cada animal
		 * Respuesta Final: Cada animal consume 4.0 KG cada uno
		 *					Hay comida suficiente para cada animal
		 *
		 * 2. Valores Introducidos: Animales: 3, Comida total: 15.0, Comida comprada: 10.0
		 * Respuesta Esperada: Cada animal consume 5.0 KG cada uno
		 *					   No hay comida suficiente, faltaría 1.6 KG para cada animal
		 * Respuesta Final: Cada animal consume 5.0 KG cada uno
		 *					No hay comida suficiente, faltaría 1.6 KG para cada animal
		 *
		 * 3. Valores Introducidos: Animales: 0, Comida total: 0, Comida comprada: 0
		 * Respuesta Esperada: No hay animales en la granja
		 * Respuesta Final: No hay animales en la granja
		 * 
		 * 4. Valores Introducidos: Animales: -2, Comida total: 30.0, Comida comprada: 15.0
		 * Respuesta Esperada: No hay animales en la granja
		 * Respuesta Final: No hay animales en la granja
		 * 
		 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número de animales
		int animales;
		
		// Variable donde guardaremos la comida total que comen los animales
		double comida;
		
		// Variable donde guardaremos la comida comprada
		double comidaComprada;
		
		// Le pedimos al usuario que nos diga cuantos animales hay
		System.out.println("Dime cuantos animales tienes:");
		animales = sc.nextInt();
		
		// Le pedimos al usuario que nos diga cuando comen en total los animales
		System.out.println("Dime cuanto comen en total los animales:");
		comida = sc.nextDouble();
		
		// Le pedimos al usuario que nos diga cuantos kg de comida ha comprado
		System.out.println("Dime cuanta comida has comprado");
		comidaComprada = sc.nextDouble();
		
		// Comprobamos que haya al menos 1 animal
		if (animales > 0) {
			comida /= animales;
			comidaComprada /= animales;
			System.out.println("Cada animal consume " + comida + " KG cada uno"); // Mostramos cuando consume cada animal
			if (comidaComprada >= comida) { // Comprobamos si hay mas comida en total que la que comen
				System.out.println("Hay comida suficiente para cada animal");
			} else { // en caso de que haya menos mostramos cuando faltaria en kg por cada animal
				System.out.println("No hay comida suficiente, faltaría " + (comida - comidaComprada) + " KG para cada animal");
			}
		} else { // En caso de que no haya animales mostramos un mensaje
			System.out.println("No hay animales en la granja");
		}
		
		// Cerramos el scanner
		sc.close();
	

	}

}
