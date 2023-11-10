package bucles;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variables donde guardaremos los valores
		int hora = -1, // Variable donde guardaremos la hora que se introduzca
			min = -1, // Variable donde guardaremos los minutos que se introduzca
			seg = -1, // Variable donde guardaremos los segundos que se introduzca
			incremento = -1;// Variable donde guardaremos el incremento que se introduzca
		
		// Pedimos la hora siempre y cuando el valor sea menor a 0 o mayor de 23
		do {
			// Usamos un try-catch para en caso de no introducir un int mostrar un mensaje
			try {
				// Le pedimos al usario la cantidad de horas
				System.out.println("Dime la cantidad de horas:");
				hora = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (hora < 0 || hora > 23);
		
		// Pedimos la hora siempre y cuando el valor sea menor a 0 o mayor de 59
		do {
			// Usamos un try-catch para en caso de no introducir un int mostrar un mensaje
			try {
				// Le pedimos al usuario la cantidad de minutos
				System.out.println("Dime la cantidad de minutos:");
				min = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (min < 0 || min > 59);
		
		// Pedimos la hora siempre y cuando el valor sea menor a 0 o mayor de 59
		do {
			// Usamos un try-catch para en caso de no introducir un int mostrar un mensaje
			try {
				// Le pedimos al usuario la cantidad de segundos
				System.out.println("Dime la cantidad de segundos:");
				seg = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (seg < 0 || seg > 59);
		
		// Pedimos la hora siempre y cuando el valor sea menor a 0 o mayor de 59
		do {
			// Usamos un try-catch para en caso de no introducir un int mostrar un mensaje
			try {
				// Le pedimos al usuario la cantidad que quiere incrementar de segundos
				System.out.println("Dime la cantidad de segundos que quieres incrementar:");
				incremento = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (incremento < 0);
		
		// Usamos el bucle for para ir incrementado 1 a 1 los segundos que se quiera incrementar
		for (int i = 0; i < incremento; i++) { 
			seg++; // Incrementamos 1 a los segundos
			if(seg > 59) { // Si segundos es mas de 59 se añade 1 a minutos y se pone a 0 los segundos
				seg = 0;
				min++;
				if(min > 59) { // Si los minutos son mas de 59. se incrementa 1 a la hora y los minutos se guarda a 0
					min = 0;
					hora++;
					if(hora > 23) { // Si la hora es más de 23, se igual a 0 
						hora = 0;
					}
				}
			}
		}
		
		// Mostramos la hora despues de haber incrementado los segundos que haya puesto el usuario
		System.out.println(LocalTime.of(hora, min, seg)); 
		
		// Cerramos el scanner
		sc.close();
	}

}
