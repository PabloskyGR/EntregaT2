package condicionales;

import java.util.Scanner;

		/**
		 * PRUEBAS
		 * 
		 * 1. Valor Introducido: -5
		 * Respuesta Esperada: El valor absoluto de -5 es: 5
		 * Respuesta Final: El valor absoluto de -5 es: 5
		 * 
		 * 2. Valor Introducido: 0
		 * Respuesta Esperada: El valor absoluto de 0 es: 0
		 * Respuesta Final: El valor absoluto de 0 es: 0
		 * 
		 * 3. Valor Introducido: 5
		 * Respuesta Esperada: El valor absoluto de 5 es: 5
		 * Respuesta Final: El valor absoluto de 5 es: 5
		 * 
		 **/

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número que nos introduzca el usuario	
		int num;
		// Variable donde guardaremos el número pero en valor absoluto
		int valorAbsoluto;
		
		// Le pedimos al usuario que nos diga un número
		System.out.println("Dime un número");
		num = sc.nextInt();
		
		// Usando el operador ternario mostramos el número introducido en positivo
		valorAbsoluto = num < 0 ? num * (-1) : num;
		
		// Mostramos un mensaje donde se muestre el número intruducido y su valor absoluto
		System.out.println("El valor absoluto de " + num + " es: " + valorAbsoluto);
		
		// Cerramos el scanner
		sc.close();

	}

}
