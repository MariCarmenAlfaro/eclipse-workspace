package practica1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		

//		2.- Escribe una aplicación que pregunte al usuario el año en que se inventó el transistor. Este año
//		estará codificado como una constante dentro del programa. Si el usuario escribe un dato que no es
//		un número entero, se le informará de ello y se le repetirá la pregunta, las veces que haga falta.
//		Una vez que el usuario haya dado un valor entero, el programa le informará de si se ha quedado
//		corto, se ha pasado, o ha acertado.
		
		Scanner entrada = new Scanner (System.in);
		
	
		int yearTransistor = 1947;
		
		
		System.out.println("------------------JUEGO------------------\n¿Sabes en que año se inventó el transistor?");
		for (int i = 1; i > 0; i++) {
			
			
			if(entrada.hasNextInt()) {
				int year = entrada.nextInt();
				
				
				if(year == yearTransistor) {
					System.out.println("¡¡Enhorabuena!! Has acertado.");
					break;
				} else if (year < yearTransistor) {
					System.out.println("¡Casi!, te has quedado corto.");
				} else {
					System.out.println("¡Te has pasado de largo!.");
					}
				} else {
					System.out.println("No, no, debes introducir un número entero");
					entrada.nextLine();
				}
			
	
			

		}

	}

}
