    package practica1;

import java.util.Scanner;

/*2.- Escribe una aplicación que tenga guardados en un array los pesos en quilogramos de doce
personas. La aplicación examinará el array y dirá cuál es la diferencia (resta) entre el mayor y el
menor peso.*/
public class Ejer2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float pesos[] = new float[12];
		System.out.println("¡Dime cuánto pesas, anda!");
		
		for (int i = 0; i < pesos.length; i++) {
			System.out.println("Peso de la " + (i + 1) + " persona: ");
			pesos[i] = entrada.nextFloat();
		}
		float totalMax = pesos[0];
		float totalMin = pesos[0];
		for (int i = 1; i < pesos.length; i++) {
			if (pesos[i] < totalMin) {
				totalMin = pesos[i];
			}
			if (pesos[i] > totalMax) {
				totalMax = pesos[i];
			}
		}
		System.out.println("La diferencia de peso entre la persona más pesada y la de menos es de: " + (totalMax - totalMin)+" quilogramos");

	}

}
