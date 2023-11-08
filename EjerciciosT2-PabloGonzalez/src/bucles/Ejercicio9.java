package bucles;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardamos el número que introduzca el usuario
		int num;
		
		// Variable donde se guardará el número de cifras que tiene el número
		int cont = 0;
		
		// Le pedimos al usuario un número mayor a 0
		System.out.println("Dime un número mayor a 0");
		num = sc.nextInt();
		
		// Comprobamos que el número sea mayor a 0
		if(num > 0) {
			// Con el bucle vamos mirando dígito a dígito hasta que i sea mayor que num y ya sabremos cuantos dígitos tiene mediante el cont
			for(int i = 1; i <= num; i *= 10) {
				cont++;
			}
			
			// Mostramos un mensaje con el número de dígitos
			System.out.println("El número " + num + " tiene " + cont + " dígitos");
		} else {
			// En caso de ser 0 o menor mostramos un mensaje de error
			System.err.println("Error, número no válido");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
