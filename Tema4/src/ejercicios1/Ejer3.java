package ejercicios1;

import java.util.Scanner;

//3.- Escribe un método que pida al usuario su nombre y devuelva la cadena introducida
public class Ejer3 {

	public static void main(String[] args) {
		
		
		System.out.println("Tu nombre es: "+nombres());
		
	}

	static String nombres() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime tu nombre y apellidos");
		String nombre = entrada.nextLine();
		return nombre;
	}

}
