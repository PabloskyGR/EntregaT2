package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número del usuario
		int num = -1;
		
		// Variable donde guardaremos la cantidad de primos que hay entre 1 y el numero introducido
		int cont = 0;
		
		// Variable de tipo booleano inicializado a false
		boolean primo = false;
		
		// Le pedimos que nos introduzca un número hasta que sea del tipo válido
		do {
			// Con el try-catch mostramos un mensaje cada vez que el usuario introduzca un valor de un tipo diferente al deseado
			try {
				System.out.println("Dime un número: ");
				num = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Error, valor no válido");
				sc.nextLine();
			}
			
		} while(num < 0);

		// Con un for vamos sumando números hasta num
		for (int i = 2; i <= num; i++) {
			// En caso de que "i" sea 2 le sumamos 1 al contador ya que es primo.
			if (i == 2) {
				cont++;
			}
			// Con otro for comprobamos si "i" es par o no  
			for (int j = 2; j < i; j++) {
				// Se divide entre todos los numeros hasta el mismo
				if (i % j == 0) {
					// En caso de que nosea primo se sale del bucle
					primo = false;
					break;
				} // Cuando sea primo se pone a true 
				primo = true;
				// Si primo esta a true y "j" es igual a "i" - 1, se suma uno al contador
				if (primo == true && j == i - 1) {
					cont++;
				}
			}
		}
		
		// Mostramos un mensaje de los números primos que hay entre 1 y "num"
		System.out.println("Hay entre 1 y " + num + " un total de " + cont + " números primos");
		
		// Cerramso el scanner
		sc.close();

	}

}
