package bucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
				
		// Variables donde guardaremos el número 1 y el número 2 que introduzca el usuario
		int num1, num2;
				
		// Le pedimos al usuario que introduzca dos números 
		System.out.println("Dime dos números:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
				
		// Comprobamos que los números introducidos sean correctos
		if(num1 > 0 && num2 > 0) {
					
			// Usamos el bucle for para ir recorriendo desde el número mayor hacia alante
			for(int i = Math.max(num1, num2); i >= Math.min(num1, num2); i++) {
				if(i % num1 == 0 && i % num2 == 0) { // Buscamos el número que al dividir el número que buscamos entre num1 y num2, de resto 0
					System.out.println("El MCM de los dos números es: " + i); // Mostramos el mensaje de cual es el MCM 
					break; // Usamos el break para salir del bucle ya que tenemos el número que buscabamos
				}
			}
		} else { // En caso de que los números no sean válidos mostramos un mensaje de error
			System.err.println("Error, números no válidos");
		}
				
		// Cerramos el scanner
		sc.close();

	}

}
