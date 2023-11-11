package bucles;

import java.util.InputMismatchException; 
import java.util.Scanner;

		/**
		 * PRUEBAS
		 * 
		 * 1. Valor introducido: f
		 * Respuesta esperada: Error, valor no válido
		 *					   Dime un número entre 0 y 20:
		 * Respuesta final: Error, valor no válido
		 *					Dime un número entre 0 y 20:
		 * 
		 * 2. Valor introducido: 34
		 * Respuesta esperada: Dime un número entre 0 y 20:
		 * Respuesta final: Dime un número entre 0 y 20:
		 * 
		 * 3. Valor introducido: 5 
		 * Respuesta esperada: 1
		 *				   	   22
		 *					   333
		 *					   4444
		 *					   55555
		 * Respuesta final: 1
		 *					22
		 *					333
		 *					4444
		 *				    55555
		 * 
		 **/

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número que introduzca el usuario
		int num = -1;
		
		// Le pediremos siempre un número hasta que sea un número entre 0 y 20
		do {
			// Usamos el try-catch para mostrar un mensaje en caso de que el valor introducido no sea del tipo adecuado
			try {
				// Le pedimos al usuario un número comprendido entre 0 y 20
				System.out.println("Dime un número entre 0 y 20:");
				num = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error, valor no válido");
				sc.nextLine();
			}
		} while (num <= 0 || num >=20);
			
	    // Usamos el bucle for para calcular el número de filas que necesitaremos dependendiendo de "num"
		for(int i = 1; i <= num; i++) {
			// Usamos otro for para calcular el número de columnas, ya que aumentará 1 al ir añadiendo columnas
			for(int j = 1; j <= i; j++) { 
				System.out.print(i); 
			}
			// Salto de linea al final, para poder ponerlo de forma estructurada
			System.out.println();
		} 
		
		// Cerramos el scanner
		sc.close();

	}

}
