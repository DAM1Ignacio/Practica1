/**
 * Nombre1.java
 * Programa que pide 2 nombre y 2 edades y las muestra por pantalla
 * ibp - 2018.10.05
 */

import java.util.Scanner; //Importa el paquete java.util.Scanner

public class Nombre1 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); // Inicializa el metodo Scanner 
		
		System.out.println("Introduce el nombre de la primera persona");
		String Nombre1 = teclado.nextLine();		// Nos pide por consola en nombre de la primera persona
		
		// Bucle para comprobar que el nombre introducido no lleve numeros 
		for (int i=0;i<Nombre1.length();i++) {
			char charLetra = Nombre1.charAt(i);
			
			if (Character.isDigit(charLetra)) {
				System.out.println("Un nombre no lleva numeros");
				Nombre1 = teclado.nextLine();
				i = 0;
			}
			
		}
		
		System.out.println("Introduce la edad de la primera persona");
		String Edad1 = teclado.nextLine();		// Nos pide por consola la edad de la primera persona
		
		// Bucle para comprobar que la edad introducida sea un numero
		for (int i=0;i<Edad1.length();i++) {
			char charLetra = Edad1.charAt(i);
			
			if (!Character.isDigit(charLetra)) {
				System.out.println("Vuelve a introducir la edad");
				Edad1 = teclado.nextLine();
				i = 0;
			}
			
		}
		
		System.out.println("Introduce el nombre de la segunda persona");
		String Nombre2 = teclado.nextLine();		// Nos pide por consola en nombre de la segunda persona
		
		// Bucle para comprobar que el nombre introducido no lleve numeros 
		for (int i=0;i<Nombre2.length();i++) {
			char charLetra = Nombre2.charAt(i);
			
			if (Character.isDigit(charLetra)) {
				System.out.println("Un nombre no lleva numeros");
				Nombre2 = teclado.nextLine();
				i = 0;
			}
			
		}
		
		System.out.println("Introduce la edad de la segunda persona");
		String Edad2 = teclado.nextLine();		// Nos pide por consola la edad de la segunda persona
		
		// Bucle para comprobar que la edad introducida sea un numero 
		for (int i=0;i<Edad2.length();i++) { 		// El bucle se ejecuta una vez por cada caracter almacenado en Edad2
			char charLetra = Edad2.charAt(i);		// Se extrae un caracter 
			
			if (!Character.isDigit(charLetra)) {		//Se compara si el caracter es un numero 
				System.out.println("Vuelve a introducir la edad");		//Si el caracter no es numero se vuelve a pedir
				Edad2 = teclado.nextLine();
				i = 0;		//Se reinicia el bucle
			}
			
		}
		
		teclado.close();		// Se cierra el objeto teclado
		System.out.println("La edad de "+Nombre1+" es "+Edad1+" años y la edad de "+Nombre2+" es "+Edad2+" años");

	}
}