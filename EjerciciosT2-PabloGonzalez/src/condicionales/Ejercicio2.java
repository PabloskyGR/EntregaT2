package condicionales;

import java.util.Scanner;

		/**
		 * PRUEBAS
		 * 
		 * 1. Valor Introducido: 12345678
		 * Respuesta Esperada: La letra es la Z.
		 * Respuesta Final: La letra es la Z.
		 * 
		 * 2. Valor Introducido: 98765432
		 * Respuesta Esperada: La letra es la M.
		 * Respuesta Final: La letra es la M.
		 * 
		 * 3. Valor Introducido: 1234
		 * Respuesta Esperada: DNI introducido no válido
		 * Respuesta Final: DNI introducido no válido
		 * 
		 * 4. Valor Introducido: 100000000
		 * Respuesta Esperada: DNI introducido no válido
		 * Respuesta Final: DNI introducido no válido
		 *  
		 **/

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el DNI que intriduzca el usuario
        int dni;
        
        // Le pedimos al usuario un DNI
        System.out.println("Dime un dni: ");
        dni = sc.nextInt();
        
        // Comprobamos que el dni contenga 8 cifras
        if (dni >= 10000000 && dni <= 99999999){
        	
        	 // Mostramos la letra dependiendo del resto al dividir el DNI entre 23
        	 switch (dni % 23){
             case 0-> System.out.println("La letra es la T.");
             case 1-> System.out.println("La letra es la R.");
             case 2-> System.out.println("La letra es la W.");
             case 3-> System.out.println("La letra es la A.");
             case 4-> System.out.println("La letra es la G.");
             case 5-> System.out.println("La letra es la M.");
             case 6-> System.out.println("La letra es la Y.");
             case 7-> System.out.println("La letra es la F.");
             case 8-> System.out.println("La letra es la P.");
             case 9-> System.out.println("La letra es la D.");
             case 10-> System.out.println("La letra es la X.");
             case 11-> System.out.println("La letra es la B.");
             case 12-> System.out.println("La letra es la N.");
             case 13-> System.out.println("La letra es la J.");
             case 14-> System.out.println("La letra es la Z.");
             case 15-> System.out.println("La letra es la S.");
             case 16-> System.out.println("La letra es la Q.");
             case 17-> System.out.println("La letra es la V.");
             case 18-> System.out.println("La letra es la H.");
             case 19-> System.out.println("La letra es la L.");
             case 20-> System.out.println("La letra es la C.");
             case 21-> System.out.println("La letra es la K.");
             case 22-> System.out.println("La letra es la E.");
        	 }
        } else {
        	System.err.println("DNI introducido no válido"); // Mensaje de error en caso de que el DNI no contenga 8 cifras
        }
        
        // Cerramos el scanner
        sc.close();
        
    }
}

