package bucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		int numPrimo = 0;
		
		int incremento = 2;
		
		boolean primo;
		
		System.out.println("Dime un número: ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			primo = true;
				if (i % incremento == 0) 
					primo = false;
					incremento++;
				if (primo == true) {
					numPrimo++;
				}
	
		}
System.out.println("Hay en total entre 1 y " + num + " un total de " + numPrimo + " números primos");
		
		sc.close();

	}

}
