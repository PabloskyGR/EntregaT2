package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número que introduzca el usuario
		int num = -1;
		
		// Pedimos el num hasta que se nos introduzca el valor del tipo deseado
		do {
			// Usamos el try-catch por si el usuario introduce un valor a num1 del tipo no deseado
			try {
				// Le pedimos al usuario que introduzca un número
				System.out.println("Dime un número:");
				num = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Error, valor no válido");
				sc.nextLine();
			}
		} while(num < 0);
		
		// Con el primer bucle for creamos las filas que va a tener el triángulo
		for (int i = 1; i <= num; i++) {
			
			// Con este bucle se crearan los espacios necesarios en los lugares correspondientes
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			// Con este bucle se pondrán los respectivos *
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			} 
			System.out.println("");
		}

		// Cerramos el scanner
		sc.close();
	}

}
