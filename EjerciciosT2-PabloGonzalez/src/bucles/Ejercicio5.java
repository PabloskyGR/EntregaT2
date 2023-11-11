package bucles;

import java.util.InputMismatchException; 
import java.util.Scanner;

		/**
		 * PRUEBAS
		 * 
		 * 1. Valor introducido: num1 = f, num2 = 2
		 * Respuesta esperada: Error, valor no válido
		 *					   Dime un número:
		 * Respuesta final: Error, valor no válido
		 *					Dime un número:
		 * 
		 * 2. Valor introducido: num1 = 6, num2 = 8
		 * Respuesta esperada: El MCM de los dos números es: 24
		 * Respuesta final: El MCM de los dos números es: 24
		 * 
		 **/

public class Ejercicio5 {

	public static void main(String[] args) {
	
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
				
		// Variables donde guardaremos el número 1 y el número 2 que introduzca el usuario
		int num1 = -1, num2 = -1;
		
		// Pedimos el num1 hasta que se nos introduzca el valor del tipo deseado
		do {
			// Usamos el try-catch por si el usuario introduce un valor a num1 del tipo no deseado
			try {
				// Le pedimos al usuario que introduzca un número
				System.out.println("Dime un número:");
				num1 = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Error, valor no válido");
				sc.nextLine();
			}
		} while(num1 < 0);
		
		// Pedimos el num2 hasta que se nos introduzca el valor del tipo deseado
		do {
			// Usamos el try-catch por si el usuario introduce un valor a num2 del tipo no deseado
			try {
				// Le pedimos al usuario que introduzca otro número
				System.out.println("Dime otro número:");
				num2 = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Error, valor no válido");
				sc.nextLine();
			}
		} while(num2 < 0);
				
		// Usamos el bucle for para ir recorriendo desde el número mayor hacia alante
		for(int i = Math.max(num1, num2); i >= Math.min(num1, num2); i++) {
			if(i % num1 == 0 && i % num2 == 0) { // Buscamos el número que al dividir el número que buscamos entre num1 y num2, de resto 0
				System.out.println("El MCM de los dos números es: " + i); // Mostramos el mensaje de cual es el MCM 
				break; // Usamos el break para salir del bucle ya que tenemos el número que buscabamos
			}
		}
		// Cerramos el scanner
		sc.close();

	}

}
