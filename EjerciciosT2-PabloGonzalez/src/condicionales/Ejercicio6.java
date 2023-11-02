package condicionales;

import java.util.Scanner;

		/**
		 * PRUEBAS
		 * 
		 * 1. Números Generados: 23 y 54
		 * Respuesta: 77
		 * Respuesta Esperada: ¡Felicidades!, hiciste bien la suma
		 * Respuesta Final: ¡Felicidades!, hiciste bien la suma
		 * 
		 * 2. Números Generados: 45 y 12
		 * Respuesta: 88
		 * Respuesta Esperada: Fallaste la suma
		 * Respuesta Final: Fallaste la suma
		 * 
		 **/

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variables donde guardaremos los dos números aleatorios que generemos
		int num1, num2;
		
		// Variable donde guardaremos la respuesta que introduzca el usuario
		int respuesta;
		
		// Generamos los dos números aleatorios y se lo asignamos a las dos variables
		num1 = (int) ((Math.random() * 99) + 1);
		num2 = (int) ((Math.random() * 99) + 1);
		
		// Le mostramos los números al usuario y le pedimos que resuelva la suma
		System.out.println("Dime el resultado de la siguiente suma:\n" 
							+ num1 + " + " + num2);
		respuesta = sc.nextInt();
		
		// Comprobamos si el usuario ha introducido el resultado correcto
		if(respuesta == num1 + num2) {
			System.out.println("¡Felicidades!, hiciste bien la suma");
		} else {
			System.out.println("Fallaste la suma");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
