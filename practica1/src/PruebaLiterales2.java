/**
 * PruebaLiterales.java
 * Programa para utilizar envoltorios (Wapper).
 * ibp - 2018.10.04
 */

public class PruebaLiterales2 {
	public static void main(String[] args) {	
		Double a = -11.1;
		String b = "cañón";
		Double c = +521.6; 
		Integer d = 0b101010;
		//String e = \xFE; 		// Valor invalido 
		//String f = XGA;		// Valor invalido
		//String g = 'a'; 		// Valor invalido
		//String h = ab"c;"		// Valor invalido
		String i = "abc;"; 	
		String j = "true"; 
		Double k = -88.28;
		Integer l = 0377;
		Double m = 1.26;
		Double n = (double)1.26f;
		Integer ñ = 1234;
		String o = "a";
		//String p = xF2E; 		// Valor invalido
		//String q = "abc;
		//String r = "abc'; 	// Valor invalido
		//boolean s = True;		// Valor invalido
		Double t = .3e27;
		Integer u = 9999;
		Double v = 5E-002;
		//String w = ‘\n’ ; 	// Valor invalido 
		Double x  = .567;
		//String y = 'abc'; 	// Valor invalido
		Integer z = 0xf; 
		//String aa =	"abc';	// Valor invalido
		//String ab = "abc"";	// Valor invalido
		Boolean ac = false;
		//double ad = 23e2.3;	// Valor invalido
		//long ae = 099;		// Valor invalido
		Integer af = 0xFE;
		//String ag = while;	// Valor invalido
		Integer ah = 0xFFFE;
		Double ai = 02.45;
		//String aj = abc;		// Valor invalido 
		//String ak  = a'; 		// Valor invalido
		//String al = ""abc"";  // Valor invalido
		//String am = '\\'; 	// Valor invalido
		
		//Muestra los envoltorios validos en pantalla
		System.out.println(a+", "+b+", "+c+", "+d+", "+i+", "+j+", "+k+", "+l+", "+n+", "+m+", "+ñ+", "+o+", "+t+
							", "+u+", "+v+", "+x+", "+z+", "+ac+", "+ah+", "+af+", "+", "+ah+", "+ai);   
		
	}
}