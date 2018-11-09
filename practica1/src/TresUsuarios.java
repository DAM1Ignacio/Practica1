/**
 * TresUsuarios.java
 * Programa simple que almaena datos de tres personas y luego los muestra por pantalla en orden inverso.
 * ibp - 2018.10.4
 */

import java.util.Scanner; //Importa el paquete java.util.Scanner

public class TresUsuarios {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); // Inicializa el metodo Scanner 

		//Persona numero 1
		System.out.println("Introduce el nombre de la persona 1");
		String nom1 = teclado.nextLine();		// Nombre
		System.out.println("Introduce los apellidos de la persona 1");
		String ape1 = teclado.nextLine();		// Apellidos
		System.out.println("Introduce el nif de la persona 1");
		String nif1 = teclado.nextLine();		// NIF
		System.out.println("Introduce la direccion postal de la persona 1");
		String direc1 = teclado.nextLine();		// Direccion
		
		// Persona numero 2
		System.out.println("Introduce el nombre de la persona 2");
		String nom2 = teclado.nextLine();		// Nombre
		System.out.println("Introduce los apellidos de la persona 2");
		String ape2 = teclado.nextLine();		// Apellidos
		System.out.println("Introduce el nif de la persona 2");
		String nif2 = teclado.nextLine();		// NIF
		System.out.println("Introduce la direccion postal de la persona 2");
		String direc2 = teclado.nextLine();		// Direccion
		
		// Persona numero 3
		System.out.println("Introduce el nombre de la persona 3");
		String nom3 = teclado.nextLine();		// Nombre
		System.out.println("Introduce los apellidos de la persona 3");
		String ape3 = teclado.nextLine();		// Apellidos
		System.out.println("Introduce el nif de la persona 3");
		String nif3 = teclado.nextLine();		// NIF
		System.out.println("Introduce la direccion postal de la persona 3");
		String direc3 = teclado.nextLine();		// Direccion
		
		teclado.close(); 		// Cierre del objeto
		
		// Muestra los datos de la persona 3
		System.out.println("Persona 3 : \n");;
		System.out.println("Nombre de la persona 3 : "+nom3);
		System.out.println("Apellidos de la persona 3 : "+ape3);
		System.out.println("Nif de la persona 3 : "+nif3);
		System.out.println("Direccion postal de la persona 3 : "+direc3+"\n");
		
		// Muestra los datos de la persona 2
		System.out.println("Persona 2 : \n");;
		System.out.println("Nombre de la persona 2 : "+nom2);
		System.out.println("Apellidos de la persona 3 : "+ape2);
		System.out.println("Nif de la persona 2 : "+nif2);
		System.out.println("Direccion postal de la persona 2 : "+direc2+"\n");
	
		// Muestra los datos de la persona 1
		System.out.println("Persona 1 : \n");;
		System.out.println("Nombre de la persona 1 : "+nom1);
		System.out.println("Apellidos de la persona 1 : "+ape1);
		System.out.println("Nif de la persona 1 : "+nif1);
		System.out.println("Direccion postal de la persona 1 : "+direc1);
	}
}