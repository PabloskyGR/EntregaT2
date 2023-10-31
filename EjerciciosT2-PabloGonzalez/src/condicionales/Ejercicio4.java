package condicionales;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		// Creamos la variable donde guardaremos los datos introduccidos
		int num;
		// Creamos la variable donde guardaremos los numeros escritos
		String unid;
		String numletra = null;

		Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

		// Se le pide al usuario que introduzca un numero entre 1 y 99
		System.out.println("Escriba un numero entre 1 y 99");
		num = sc.nextInt();// El valor es guardado en la variable

		// Mediante una condicional comprobamos que este en el rango definido.
		if (num >= 100 || num < 1) {
			System.out.println("El numero no esta comprendido entre 1 y 99");
			// Cuando se esta en el rango, continua el programa
		} else {
			// Con este switch averiguamos las unidades
			switch (num % 10) {
			case 1 -> {
				unid = "uno";
			}
			case 2 -> {
				unid = "dos";
			}
			case 3 -> {
				unid = "tres";
			}
			case 4 -> {
				unid = "cuatro";
			}
			case 5 -> {
				unid = "cinco";
			}
			case 6 -> {
				unid = "seis";
			}
			case 7 -> {
				unid = "siete";
			}
			case 8 -> {
				unid = "ocho";
			}
			case 9 -> {
				unid = "nueve";
			}
			default -> {
				unid = "cero";
			}
			} // Si el numero es menor a 10, se devuelve como valor escrito del numero las
			// unidades
			if (num < 10) {
				System.out.println("El numero es " + unid);
			} else { // Si el numero es mayor a 10, el programa continua
				// Con este switch sacamos las decenas del numero
				switch (num / 10) {
				case 1 -> {
					numletra = "dieci";
				}
				case 2 -> {
					numletra = "veinti";
				}
				case 3 -> {
					numletra = "treinta";
				}
				case 4 -> {
					numletra = "cuarenta";
				}
				case 5 -> {
					numletra = "cincuenta";
				}
				case 6 -> {
					numletra = "sesenta";
				}
				case 7 -> {
					numletra = "setenta";
				}
				case 8 -> {
					numletra = "ochenta";
				}
				case 9 -> {
					numletra = "noventa";
				}
				}
				/*
				 * con una condicional y un switch ofrecemos como resultado del 11 al 15
				 */
				if (10 < num && num <= 15) {
					switch (num) {
					case 11 -> {
						numletra = "once";
					}
					case 12 -> {
						numletra = "doce";
					}
					case 13 -> {
						numletra = "trece";
					}
					case 14 -> {
						numletra = "catorce";
					}
					case 15 -> {
						numletra = "quince";
					}
					}
					System.out.println("El numero es " + numletra);
				}
				/*
				 * una vez descartados los numeros anteriores, para los numeros inferiores a 30
				 * se muestra el resultado sin "y"
				 */
				if (num > 15 && num != 20 && num < 30) {
					System.out.println("El numero es " + numletra + unid);
				}
				// Para el resto se añade el "y"
				if (num > 30 && num % 10 != 0) {
					System.out.println("El numero es " + numletra + " y " + unid);
				}
				/*
				 * En caso que el numero sea multiplo de 10, se varia algunos valores en caso
				 * del 10 y el 20 y se ofrece el resultado
				 */
				if (num % 10 == 0) {
					if (num == 10) {
						numletra = "diez";
					}
					if (num == 20) {
						numletra = "veinte";
					}
					System.out.println("El numero es " + numletra);
				}
			}
		}
		sc.close(); // Cerramos el objeto Scanner
	}
}
