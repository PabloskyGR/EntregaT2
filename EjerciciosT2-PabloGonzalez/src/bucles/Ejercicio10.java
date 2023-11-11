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
		 * 2. Valor introducido: 12321
		 * Respuesta esperada: El número 12321 es capicúa --> 12321
		 * Respuesta final: El número 12321 es capicúa --> 12321
		 * 
		 * 3. Valor introducido: 12345
		 * Respuesta esperada: El número 12345 no es capicúa --> 54321
		 * Respuesta final: El número 12345 no es capicúa --> 54321
		 * 
		 **/

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número que introduzca el usuario
		int num = -1;
		
		// variable donde guardaremos la copia del número
		int numCopia = 0;
		
		// Variable donde iremos guardando el número pero invertido
		int numInver = 0;
		
		// Variable que nos servirá para ir cogiendo cada cifra del número introducido
		int cifra = 0;
		
		// Usamos el do-while para pedir el número hasta que nos diga uno positivo
		do {
			// Usamos el try-catch para en caso de que se introduzca un valor que no sea de tipo int salte un mensaje
			try {
				System.out.println("Dime un número mayor a 0");
				num = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Error, valor no válido");
				sc.nextLine();
			}
		} while (num < 0); // Se pedirá el número hasta que sea mayor de 0
		
		// Guardamos el número en la variable numCopia
		numCopia = num;
		
		// Mientras el número no sea 0 el bucle sacará todas las cifras del número y las invertira formando el número invertido
		while(numCopia != 0) {
			cifra = numCopia % 10;
			numInver = numInver * 10 + cifra;
			numCopia = numCopia / 10;
		}
		
		// Comprobamos si el número del principio y el número invertido son iguales
		if(num == numInver) {
			System.out.println("El número " + num + " es capicúa --> " + numInver);
		} else {
			System.out.println("El número " + num + " no es capicúa --> " + numInver);
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
