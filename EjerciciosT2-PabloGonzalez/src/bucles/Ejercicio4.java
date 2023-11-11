package bucles;

import java.util.InputMismatchException; 
import java.util.Scanner;

		/**
		 * PRUEBAS
		 * 
		 * 1. Valor introducido: num1 = f, num2 = 3
		 * Respuesta esperada: Error, valor no válido
		 *					   Dime un número:
		 * Respuesta final: Error, valor no válido
		 *					Dime un número:
		 * 
		 * 2. Valor introducido: num1 = 3, num2 = 3
		 * Respuesta esperada: El MCD de los dos números es: 3
		 * Respuesta final: El MCD de los dos números es: 3
		 *  
		 **/

public class Ejercicio4 {

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
		
		// Usamos el bucle for para ir recorriendo desde el número mayor hacia atras
		for(int i = Math.max(num1, num2); i >= 1; i--) {
			if(num1 % i == 0 && num2 % i == 0) { // En caso de que uno de los números de, de resto 0 al dividirlo entre los dos números
				System.out.println("El MCD de los dos números es: " + i); // Mostramos el mensaje de cual es el MCD 
				break; // Usamos el break para salir del bucle ya que tenemos el número que buscabamos
			}
		}
	
		// Cerramos el scanner
		sc.close();

	}

}
