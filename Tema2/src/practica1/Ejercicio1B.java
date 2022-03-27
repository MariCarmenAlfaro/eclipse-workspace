package practica1;

import java.util.Scanner;

public class Ejercicio1B {

	public static void main(String[] args) {
	

//		Una vez hecho lo anterior, modifica el programa para mejorar la salida. Cuando el usuario no
//		escriba ninguna palabra, deberá mostrar el siguiente mensaje: "No has escrito ninguna palabra.". Si
//		escribe una palabra, deberá mostrar "Has escrito una palabra.". 
		
		Scanner entrada = new Scanner (System.in);
		
		int totalPalabras = 0;
		
		for (int i = 1; i > 0; i++) {
			System.out.println("Dime una palabra. Cuando quieras parar di \"Basta\".");
			
			String palabra = entrada.nextLine();
			
			if(palabra.equals("Basta") ) {
				System.out.println("Has dicho " + totalPalabras + " palabras.");
				break;
			}
			else if (palabra.equals("")){
				System.out.println("No has escrito ninguna palabra. \n");
			}
			
			else {
				System.out.println("Has escrito una palabra \n");
				totalPalabras++;
			}
		}

				
    		
	}

}
