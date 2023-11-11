package bucles;

import java.util.Scanner;

		/**
		 * PRUEBAS
		 * 
		 * 1. Valor introducido: 4, 5, 6, 5, 4, 0
		 * Respuesta esperada: Total de números introducidos: 5
		 *					   Números fallados: 2
		 * Respuesta final: Total de números introducidos: 5
		 *					Números fallados: 2
		 *
		 **/

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Abrimos el scanner 
		Scanner sc = new Scanner(System.in);
		
		// Variable donde gaurdaremos el número que vaua introduciendo el usuario
		int num;
		
		// Variable donde iremos guardando el número que vayamos pidiendo para ver si es mayor
		int numMayor;
		
		// Variable donde se guardará la cantidad de números totales que se vayan introduciendo
		int numTotal = 1;
		
		// Variable donde se guardará la cantidad de veces que se ponga un número menor al anterior
		int fallo = 0;
		
		// Le pedimos al usuario un número inicial para empezar el programa
		System.out.println("Dime un número inicial: (Pulsa 0 para salir del programa)");
		num = sc.nextInt();
		
		// Hacemos un do-while para pedir números hasta que se introduzca 0
		do {
			System.out.println("Dime un número mayor al anterior:"); // Le pedimos un número mayor al usuario
			numMayor = sc.nextInt();
			
			// Comprobamos si el número es 0 para salir
			if(numMayor == 0) {
				System.out.println("Saliendo...");
				break;
			}
			
			// Comprobamos si el número es menor para incrementar 1 a fallos
			if(numMayor < num) {
				System.out.println("Fallo, es menor");
				fallo++;
			}
			
			// Sumamos 1 al número total, para teber un registro de cuantos números se han escrito
			numTotal++;
			
			// La variable "num" coge el valor de "numMayor" para poder seguir comprobando números
			num = numMayor;
			
		} while (num != 0); // Mientras no sea 0, seguirá continuando ejecutando
		
		// Mostramos el número total de números introducidos
		System.out.println("Total de números introducidos: " + numTotal);
		
		// Mostramos el número total de fallos que ha cometido el usuario
		System.out.println("Números fallados: " + fallo);
		
		// Cerramos el scanner 
		sc.close();

	}

}
