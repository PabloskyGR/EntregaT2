package condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		 
		// Variable donde guardaremos el número que introduzca el usuario
		int num;
		
		// Variable donde iremos guardando el último dígito del número
		int digito;
		
		// Variable donde se guardará el número al revés al original
		int reverso = 0;
		
		// Variable donde guardaremos una copia del número que introduzdca el usuario
		int numOriginal;
		  
		// Le pedimos al usuario un número
		System.out.println("Dime un número comprendido entre 0 y 99999:");
	  	num = sc.nextInt();
		 
	  	// Hacemos una copia del número introducido en la variable numOriginal
	  	numOriginal = num;
		  
	  	// Comprobamos que el número introducido sea válido
	  	if (num >= 0 && num <= 99999) {
		  	while(num != 0) { // Bucle donde iremos dandole la vuelta al número
			  	digito = num % 10; // Para coger el último dígito del número cogemos el resto de dividir el numero entre 10
			  	reverso = reverso * 10 + digito; // Para poder crear el número invertido, vamos multiplicando por 10 para no sumar los dígitos entre si
			  	num = num / 10; // Le vamos quitando la ultima cifra al número hasta que se quede a 0 y salga del bucle
		  	}
		  	// Comprobamos si el número al reves es igual que la copia del original ya que el número ha sido modificado
		  	if(reverso == numOriginal) {
			  	System.out.println("El número " + numOriginal + " = " + reverso + " --> Es capicúa"); // Mensaje en caso de que le número sea capicúa
		  	} else {
			  	System.out.println("El número " + numOriginal + " != " + reverso + " --> No es capicúa"); // Mensaje en caso de que el mensaje no sea capicúa
		  	}
	  	} else {
		  	System.err.println("El número introducido no es válido"); // Mensaje de error en caso de no haber introducido el número correctamente
	  	}
		  
	  	// Cerramos el scanner
	  	sc.close();

	}

}
