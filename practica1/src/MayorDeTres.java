/**
 * MayorDeTres.java
 * Programa simple que compara tres numeros y dice cual es mayor.
 * ibp - 2018.10.4
 */

import java.util.Scanner; //Importa el paquete java.util.Scanner

public class MayorDeTres {
	public static void main(String[] args) {
		/* teclado es un canal de entrada por teclado a través de un Scanner.
		   Necesita importar el paquete java.util
		 */
		Scanner teclado = new Scanner(System.in); // Inicializa el metodo Scanner 
		
		// Introduccion del primer valor 
		System.out.println("Introduce el primer numero");
		String num1 = teclado.nextLine();
		
		// Comprobacion de que el valor introducido sea numerico
		for (int i = 0; i<num1.length(); i++) {
			char caracter = num1.charAt(i);
			
			if(!Character.isDigit(caracter)) {
				System.out.println("Valor erroneo, porfavor introduzca un valor numerico entero");
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
				System.out.println("Valor erroneo, porfavor introduzca un valor numerico entero");
				num2=teclado.nextLine();
				i=0;
			}
		
		}
		
		long numero2 = Long.parseLong(num2); // Conversion a Integer del numero introducido
		
		// Introduccion del tercer valor
		System.out.println("Introduce el tercer numero");
		String num3 = teclado.nextLine();
		
		// Comprobacion de que el valor introducido sea numerico
		for (int i = 0 ;i<num3.length();i++) {
			char caracter3 = num3.charAt(i);
			
			if(!Character.isDigit(caracter3)) {
				System.out.println("Valor erroneo, porfavor introduzca un valor numerico entero");
				num3=teclado.nextLine();
				i=0;
			}
		
		}
		
		long numero3 = Long.parseLong(num3); // Conversion a Integer del numero introducido
		teclado.close(); // Cierre del objeto 
		
		// Comprobacion de que numero es mayor
		if (numero1 == numero2 && numero1 == numero3) {
			System.out.println("Los tres numero son iguales");
		} else if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println(numero1+" es el numero mayor");
		} else if(numero2 >= numero1 && numero2 >= numero3) {
			System.out.println(numero2+" es el numero mayor");
		} else {
			System.out.println(numero3+" es el numero mayor");
		}
		
	}
}