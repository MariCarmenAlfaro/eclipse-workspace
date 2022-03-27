package practica1;

import java.util.Scanner;

public class Ejercicio1A {

	public static void main(String[] args) {
		
//		1.- Escribe un programa en Java que pregunte al usuario una serie de palabras. Hará esto hasta que
//		el usuario escriba "basta". Entonces mostrará en pantalla un mensaje indicando cuántas palabras ha
//		introducido (sin contar la de "basta").
		
		Scanner entrada = new Scanner (System.in);
		
		int totalPalabras = 0;
		
		for (int i = 1; i > 0; i++) {
			System.out.println("Dime una palabra. Cuando quieras parar di \"Basta\".");
			
			String palabra = entrada.nextLine();
			
			if(palabra.equals("Basta") ) {
				System.out.println("Has dicho " + totalPalabras + " palabras.");
				break;
			} else {
				totalPalabras++;
			}
		}

				
    		
	}

}
