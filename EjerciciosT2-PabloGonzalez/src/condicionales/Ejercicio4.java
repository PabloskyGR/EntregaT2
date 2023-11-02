package condicionales;

import java.util.Scanner;

		/**
		 * PRUEBAS
		 * 
		 * 1. Valor Introducido: 7
		 * Respuesta Esperada: El número es siete
		 * Respuesta Final: El número es siete
		 * 
		 * 2. Valor Introducido: 15
		 * Respuesta Esperada: El número es quince
		 * Respuesta Final: El número es quince
		 * 
		 * 3. Valor Introducido: 29
		 * Respuesta Esperada: El número es veintinueve
		 * Respuesta Final: El número es veintinueve
		 * 
		 * 4. Valor Introducido: 45
		 * Respuesta Esperada: El número es cuarenta y cinco
		 * Respuesta Final: El número es cuarenta y cinco
		 * 
		 * 5. Valor Introducido: 20
		 * Respuesta Esperada: El número es veinte
		 * Respuesta Final: El número es veinte
		 * 
		 * 6. Valor Introducido: 100
		 * Respuesta Esperada: Error, número no válido
		 * Respuesta Final: Error, número no válido
		 * 
		 **/

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in); 
		
		// Variable donde guardaremos el número del usuario
		int num;
		
		// Variable donde guardaremos los números del 0 al 9 en letras
		String sufijo;
		
		// Variable donde guadaremos en caso de ser mayor de 10, los prefijos
		String prefijo = null;

		// Le pedimos al usuario un número del 1 al 99
		System.out.println("Dime un número entre el 1 y 99:");
		num = sc.nextInt();

		// Comprobamos que el número sea válido
		if (num >= 100 || num < 1) {
			System.err.println("Error, número no válido");
		} else {
			switch (num % 10) { // Comprobamos el resto al dividirlo entre 10 para comprobar cual es el 2 dígito
			case 1 -> {
				sufijo = "uno";
			}
			case 2 -> {
				sufijo = "dos";
			}
			case 3 -> {
				sufijo = "tres";
			}
			case 4 -> {
				sufijo = "cuatro";
			}
			case 5 -> {
				sufijo = "cinco";
			}
			case 6 -> {
				sufijo = "seis";
			}
			case 7 -> {
				sufijo = "siete";
			}
			case 8 -> {
				sufijo = "ocho";
			}
			case 9 -> {
				sufijo = "nueve";
			}
			default -> {
				sufijo = "cero";
			}
			} 
			if (num < 10) { // En caso de que el número no sea mayor de 10 mostramos el número en letras
				System.out.println("El número es " + sufijo);
			} else { 
				switch (num / 10) { // Dividimos entre 10 para comprobar el primer dígito y saber el prefijo correcto
				case 1 -> {
					prefijo = "dieci";
				}
				case 2 -> {
					prefijo = "veinti";
				}
				case 3 -> {
					prefijo = "treinta";
				}
				case 4 -> {
					prefijo = "cuarenta";
				}
				case 5 -> {
					prefijo = "cincuenta";
				}
				case 6 -> {
					prefijo = "sesenta";
				}
				case 7 -> {
					prefijo = "setenta";
				}
				case 8 -> {
					prefijo = "ochenta";
				}
				case 9 -> {
					prefijo = "noventa";
				}
				}
				
				if (10 < num && num <= 15) { // Como del 11 al 15 no tienen un prefijo predeterminado ponemos el nombre del número en letras
					switch (num) {
					case 11 -> {
						prefijo = "once";
					}
					case 12 -> {
						prefijo = "doce";
					}
					case 13 -> {
						prefijo = "trece";
					}
					case 14 -> {
						prefijo = "catorce";
					}
					case 15 -> {
						prefijo = "quince";
					}
					}
					System.out.println("El número es " + prefijo); 
				}
				
				/**
				 * 
				 *  Para escribirlo gramaticalmente correcto comprobamos si es un número comprendido entre 16 y 29, ya que 
				 *  esos números no tienen  una 'y' en medio, exceptuando el Veinte
				 *  
				 **/
				
				if (num > 15 && num != 20 && num < 30) {
					System.out.println("El número es " + prefijo + sufijo);
				}
				
				/**
				 *
				 * Todos los números del 30 al 99 tienen 'y' en medio exceptuando los que acaban en 0,
				 * por lo que mostramos el prefijo y su sufijo final con 'y' en medio
				 * 
				 **/
				if (num > 30 && num % 10 != 0) {
					System.out.println("El número es " + prefijo + " y " + sufijo);
				}
			
				// Ya que los que acaben en 0 no necesitan de sufijo, solo pondremos su prefijo 
				if (num % 10 == 0) {
					
					// Excepto el 10 que tiene su propia forma
					if (num == 10) {
						prefijo = "diez";
					}
					// Y excepto el 20 que tiene su forma
					if (num == 20) {
						prefijo = "veinte";
					}
					System.out.println("El número es " + prefijo);
				}
			}
		}
		
		// Cerramos el scanner
		sc.close(); 
	}
}
