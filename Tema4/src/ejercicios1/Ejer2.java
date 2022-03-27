package ejercicios1;

import java.util.Scanner;

//2.- Modifica el programa anterior para que en lugar de escribir nada en pantalla, devuelva el String
//"Hola, nombre, no parece que tengas edad años"
public class Ejer2 {

	
		/*public static void main(String[] args) {
		
		frase();
		}
		static void frase() {
			System.out.println("Hola, nombre, no parece que tengas edad años");
		}

}*/

public static void main(String[] args) {
	
	 String saludo=frase("Mari", 22);
	 System.out.println(saludo);
	
	}
	static String frase(String nombre, int edad) {
		return "Hola, "+ nombre+", no parece que tengas "+ edad +" años";
	}

}
