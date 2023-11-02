package condicionales;

import java.util.Scanner;

		/**
		 * PRUEBAS
		 * 
		 * 1. Valores Introducidos: Distancia: 500, Días: 5
		 * Respuesta Esperada: El precio del billete es de: 1250.0€
		 * Respuesta Final: El precio del billete es de: 1250.0€
		 * 
		 * 2. Valores introducidos: Distancia: 1000, Días: 10
		 * Respuesta Esperada: ¡Tienes un descuento del 30%!, Tu precio final es de: 1750.0€
		 * Respuesta Final: ¡Tienes un descuento del 30%!, Tu precio final es de: 1750.0€
		 * 
		 **/

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardamos el descuento final
		final double descuento = 0.3;
				
		// Variable donde iremos guardando el precio del billete
		double precio = 2.5;
		
		// Variable donde guaredaremos el precio final post descuento
		double precioF;
		
		// Variable donde gaurdaremos la distancia que va a recorrer el usuario
		int distancia;
		
		// Variale donde guardaremos los dias que va a estar el usuario
		int dias;
		
		// Le pedimos al usuaris cuanta distancia va a recorrer
		System.out.println("Dime cuantos km vas a recorrer:");
		distancia = sc.nextInt();
		
		// Le pedimos al usuario los dias que va a estar
		System.out.println("Dime cuantos dias de estancia vas a estar:");
		dias = sc.nextInt();
		
		// Comprobamos los dias y la distancia que va a recorrer para ver si tiene descuento o no
		if(distancia > 800 && dias > 7) { // En caso de que sea superior a 7 dias y 800 km 
			precio *= distancia;
			precioF = precio - (precio * descuento); // Le hacemos el descuento del 30%
			System.out.println("¡Tienes un descuento del 30%!, Tu precio final es de: " + precioF + "€");
		} else {
			precio *= distancia; // En caso que no tenga descuento calculamos el precio normal
			System.out.println("El precio del billete es de: " + precio + "€");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
