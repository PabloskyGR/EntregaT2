package condicionales;

import java.util.Scanner;

		/**
		 * PRUEBAS
		 * 
		 * 1. Valores Introducidos: horas: 23, minutos: 59, segundos: 59
		 * Respuesta Esperada: Después de un segundo son las: 0:0:0
		 * Respuesta Final: Después de un segundo son las: 0:0:0
		 * 
		 * 2. Valores Introducidos: horas: 15, minutos: 59, segundos: 59
		 * Respuesta Esperada: Después de un segundo son las: 16:0:0
		 * Respuesta Final: Después de un segundo son las: 16:0:0
		 * 
		 * 3. Valores Introducidos: horas: 12, minutos: 45, segundos: 59
		 * Respuesta Esperada: Después de un segundo son las: 12:46:0
		 * Respuesta Final: Después de un segundo son las: 12:46:0
		 * 
		 * 4. Valores Introducidos: horas: 20, minutos: 32, segundos: 5
		 * Respuesta Esperada: Después de un segundo son las: 20:32:6
		 * Respuesta Final: Después de un segundo son las: 20:32:6
		 * 
		 * 5. Valores Introducidos: horas: -4, minutos: 23, segundos: 44
		 * Respuesta Esperada: Error al introducir los valores
		 * Respuesta Final: Error al introducir los valores
		 * 
		 **/

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardamos las horas que introduzca el usuario
		int hora;
		
		// Variable donde guardamos los minutos que introduzca el usuario
		int min;
		
		// Variable donde guardamos los segundos que introduzca el usuario
		int seg;
		
		// Le pedimos al usuario un número de horas
		System.out.println("Dime las horas:");
		hora = sc.nextInt();
		
		// Le pedimos al usuario un número de minutos
		System.out.println("Dime los minutos:");
		min = sc.nextInt();
		
		// Le pedimos al usuario un número de segundos
		System.out.println("Dime los segundos:");
		seg = sc.nextInt();
		
		// Comprobamos que el los valores introducidos sean correctos
		if(hora < 0 || hora > 23 || min < 0 || min > 59 || seg < 0 || seg > 59) {
			System.err.println("Error al introducir los valores");
		} else { // En caso de ser correctos hacemos las diferentes conversiones
			if(seg == 59 && min == 59 && hora == 23) {
				hora = 0;
				min = 0;
				seg = 0;
			} else if(seg == 59 && min == 59) {
				hora++;
				min = 0;
				seg = 0;
			} else if (seg == 59){
				min ++;
				seg = 0;
			} else {
				seg++;
			}
			
			// Mostramos un mensaje enseñando la hora depsues de incrementarle un segundo
			System.out.println("Después de un segundo son las: " + hora + ":" + min + ":" + seg);
		}
		
		// Cerramos el scanner
		sc.close();
	}

}
