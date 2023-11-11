package bucles;

import java.util.InputMismatchException; 
import java.util.Scanner;

		/**
		 * PRUEBAS
		 * 
		 * 1. Valor introducido: f
		 * Respuesta esperada: Error, valor no válido
		 *					   Dime un número mayor a 0
		 * Respuesta final: Error, valor no válido
		 *					Dime un número mayor a 0
		 * 
		 * 2. Valor introducido: 5453
		 * Respuesta esperada: El número 5453 tiene 4 dígitos
		 * Respuesta final: El número 5453 tiene 4 dígitos
		 * 
		 **/

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardamos el número que introduzca el usuario
		int num = -1;
		
		// Variable donde se guardará el número de cifras que tiene el número
		int cont = 0;
		
		// Pedimos un número hasta que el número sea mayor a 0
		do {
			// Usamos el try-catch para mostrar un mensaje en el caso de que el valor introducido no sea correcto
			try {
				// Le pedimos al usuario un número mayor a 0
				System.out.println("Dime un número mayor a 0");
				num = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error, valor no válido");
				sc.nextLine();
			}
		} while(num < 0);
	
		// Con el bucle vamos mirando dígito a dígito hasta que i sea mayor que num y ya sabremos cuantos dígitos tiene mediante el cont
		for(int i = 1; i <= num; i *= 10) {
			cont++;
		}
			
		// Mostramos un mensaje con el número de dígitos
		System.out.println("El número " + num + " tiene " + cont + " dígitos");
		
		// Cerramos el scanner
		sc.close();

	}

}
