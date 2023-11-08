package bucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número que introduzca el usuario
		int num;
		
		// Le pedimos al usuario un número comprendido entre 0 y 20
		System.out.println("Dime un número entre 0 y 20:");
		num = sc.nextInt();
		
		// Comprobamos si el número esta comprendido entre 0 y 20
		if(num >= 0 && num <=20) {
			
	    // Usamos el bucle for para calcular el número de filas que necesitaremos dependendiendo de "num"
		for(int i = 1; i <= num; i++) {
			// Usamos otro for para calcular el número de columnas, ya que aumentará 1 al ir añadiendo columnas
			for(int j = 1; j <= i; j++) { 
				System.out.print(i); 
			}
			// Salto de linea al final, para poder ponerlo de forma estructurada
			System.out.println();
		} 
		} else {
			// En caso de que "num" no sea válido, mostramos un mensaje de error
			System.err.println("Error, número no válido"); 
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
