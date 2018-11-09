/**
 * ParImpar.java
 * Programa simple que muestra si un numero es par o impar.
 * ibp - 2018.10.4
 */

import java.util.Scanner; //Importa el paquete java.util.Scanner

public class ParImpar {
	public static void main(String[] args) {
		/* teclado es un canal de entrada por teclado a través de un Scanner.
		   Necesita importar el paquete java.util
		 */
		Scanner teclado = new Scanner(System.in); // Inicializa el metodo Scanner 

		System.out.println("Introduce un número");
		String num = teclado.nextLine();
		
		// Comprobacion de que el valor es numerico
		for (int i = 0 ;i<num.length();i++) {		// El bucle se ejecuta una vez por cada caracter introducido
			char caracter = num.charAt(i);		// Se almacena un caracter 
			
			if (!Character.isDigit(caracter)) {		// Si el caracter no es numerico 	
				System.out.print("Valor erroneo, porfavor introduzca un valor numerico entero");	
				num = teclado.nextLine();		// vuelve a pedir que introduzcas un numero	
				i=0;		// se reinicia el bucle y empieza a analizar el nuevo numero
			}
			
		}
		
		teclado.close();		// Se cierra el objeto
		int numero = Integer.parseInt(num);		// Conversion del numero introducido a Integer
		int residuo = numero%2;		// Almacenamiento del resto de la division del numero entre dos
		
		// Comprobacion de si es un numero par o impar
		if (residuo == 0) {
			System.out.println(numero+" es un número par");
		}else {
			System.out.println(numero+" es un número impar");
		}
	}
}