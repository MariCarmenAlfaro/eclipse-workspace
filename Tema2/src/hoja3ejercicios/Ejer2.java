
/*2.- Añade al final del programa anterior el código necesario para que indique la puntuación obtenida
por el jugador:
• Si ha acertado en un intento → Recibe 10 puntos.
• Si ha acertado en dos intentos → Recibe 5 puntos.
• Si ha acertado en tres intentos → Recibe 2 puntos.*/
package hoja3ejercicios;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		int aleatorio = (int) (Math.random() * 10 + 1);

		Scanner entrada = new Scanner(System.in);

		System.out.println(aleatorio);

		System.out.println("Adivina el número entre 1 y 10.");
		int numero = 0;
		int i = 0;

		while (i < 3) {
			
			System.out.println("Escribe el número:");
			numero = entrada.nextInt();
			i++;
			if (numero == aleatorio) {
				System.out.println("¡Has acertado!");
				break;
			}else if (numero != aleatorio && i < 3) {
				System.out.println("No, vuelve a intentarlo:");
			}
			
		}

		System.out.println("Has hecho " + i + " intentos. "
				+ "El número era " + aleatorio + ".");

		System.out.println("Puntuación obtenida:");

		if (i == 1) {
			System.out.println("10 puntos.");
		} else if (i == 2) {

			System.out.println("5 puntos.");
		} else if (i == 3 && numero == aleatorio) {
			System.out.println("2 puntos.");
		} else {
			System.out.println("0 puntos.");
		}
	}

}
