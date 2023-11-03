package bucles;

import java.time.LocalTime;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variables donde guardaremos los valores
		int hora, // Variable donde guardaremos la hora que se introduzca
			min, // Variable donde guardaremos los minutos que se introduzca
			seg, // Variable donde guardaremos los segundos que se introduzca
			incremento;// Variable donde guardaremos el incremento que se introduzca
		
		// Le pedimos al usario la cantidad de horas
		System.out.println("Dime la cantidad de horas:");
		hora = sc.nextInt();
		
		// Le pedimos al usuario la cantidad de minutos
		System.out.println("Dime la cantidad de minutos:");
		min = sc.nextInt();
		
		// Le pedimos al usuario la cantidad de segundos
		System.out.println("Dime la cantidad de segundos:");
		seg = sc.nextInt();
		
		// Le pedimos al usuario la cantidad que quiere incrementar de segundos
		System.out.println("Dime la cantidad de segundos que quieres incrementar:");
		incremento = sc.nextInt();
		
		// Comprobamos que los valores introducidos sean correctos
		if (hora < 0 || hora > 23 || min < 0 || min > 59 || seg < 0 || seg > 59) {
			System.err.println("Error al introducir los valores");
		} else {
			for (int i = 0; i < incremento; i++) { // Usamos el bucle for para ir incrementado 1 a 1 los segundos que se quiera incrementar
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
			System.out.println(LocalTime.of(hora, min, seg)); // Mostramos la hora despues de haber incrementado los segundos que haya puesto el usuario
		}
		
		// Cerramos el scanner
		sc.close();
	}

}
