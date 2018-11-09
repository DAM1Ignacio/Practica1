/**
 * MayorDeDos.java
 * Programa simple que compara dos numeros.
 * ibp - 2018.10.4
 */

import java.util.Scanner; //Importa el paquete java.util.Scanner

public class MayorDeDos {
	public static void main(String[] args) {
		/* teclado es un canal de entrada por teclado a través de un Scanner.
		   Necesita importar el paquete java.util
		 */
		Scanner teclado = new Scanner(System.in); // Inicializa el metodo Scanner 
		
		// Introduccion del primer valor 
		System.out.println("Introduce el primer numero");
		String num1 = teclado.nextLine();
		
		// Comprobacion de que el valor introducido sea numerico
		for (int i = 0 ;i<num1.length();i++) {
			char caracter = num1.charAt(i);
			
			if(!Character.isDigit(caracter)) {
				System.out.println("Valor erroneo, porfavor introduzca un valor numerico");
				num1=teclado.nextLine();
				i=0;
			}
		
		}
		
		long numero1 = Long.parseLong(num1); // Conversion a Integer del numero introducido
		
		// Introduccion del segundo valor
		System.out.println("Introduce el segundo numero");
		String num2 = teclado.nextLine();
		
		// Comprobacion de que el valor introducido sea numerico
		for (int i = 0 ;i<num2.length();i++) {
			char caracter2 = num2.charAt(i);
			
			if(!Character.isDigit(caracter2)) {
				System.out.println("Valor erroneo, porfavor introduzca un valor numerico");
				num2=teclado.nextLine();
				i=0;
			}
		
		}
		
		long numero2 = Long.parseLong(num2); // Conversion a Integer del numero introducido
		teclado.close(); // Cierre del objeto 
		
		// Comprobacion de que numero es mayor
		if (numero1 == numero2) {
			System.out.println(numero1+" y "+numero2+" son iguales");		// Mensaje que se mostrara si son iguales los numeros
		}else {
			if(numero1 > numero2) {
				System.out.println(numero1+" es mayor que "+numero2);		// Mensaje que se mostrara si el primer numero es mayor
			}else {
				System.out.println(numero2+" es mayor que "+numero1);		// Mensaje que se mostrara si el segundo numero es mayor
			}
		}
		
	}
}