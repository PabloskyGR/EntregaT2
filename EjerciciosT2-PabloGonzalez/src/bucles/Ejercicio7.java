package bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número que introduzca el usuario
		int num;
		
		// Le pedimos al usuario un número para poder hacer la piramide
		System.out.println("Dime un número:");
		num = sc.nextInt();
	
		// Usamos un bucle for para estructurar el número de filas de la pirámide dependiendo de "num"
		for(int i = 1; i <= num; i++) {
			// Usamos otro bucle para poner los espacios necesarios para hacer la pirámide
			for(int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			// Usamos otro bucle para poner los números del 1 a "num" por cada columna hasta la mitad
			for(int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			// Usamos otro bucle para la otra mitad poniendolo desde "num" a 1
			for(int z = i - 1; z >= 1; z--) {
				System.out.print(z);
			}
			// Ponemos un salto de linea para que quede bien estructurado
			System.out.println("");
		}

		// Cerramos el scanner
		sc.close();
	}

}
