package bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número que introduzca el usuario
		int num;
		
		// Le pedimos al usuario un número
		System.out.println("Dime un número:");
		num = sc.nextInt();
		
		// 
		for (int i = 1; i <= num; i++) {
			
			// Primer bucle fpr que controla las filas del triángulo
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			
			//
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			} 
			System.out.println("");
		}

		// Cerramos el scanner
		sc.close();
	}

}
