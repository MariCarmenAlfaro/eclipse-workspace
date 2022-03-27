package practica2;

import java.util.Arrays;
import java.util.Scanner;

//Ordenar los números de menor a mayor.
public class Act2 {

	public static void main(String[] args) {
		// Ponemos una clase entrada para poder recibir los datos de la consola.
		Scanner entrada = new Scanner(System.in);
		
		// Tenemos una variable auxiliar para poder hacer el intercambio numérico
		int aux = 0;
		
		// Por aqui ponemos nuestro array de 10 números.
		int numeros[] = new int[10];
		
		System.out.println("Dime diez números y te los ordenare de menor a mayor");
		
		// Ponemos un bucle para preguntar a consola todos los datos necesarios
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i + 1) + ":");
			numeros[i] = entrada.nextInt();
		}
		// Iniciamos un primer bucle para leer todos los números introducidos en cada
		// posición, desde 0 hasta el penúltimo para evitar una vuelta innecesaria
		for (int i = 0; i < numeros.length - 1; i++) {
			
			// Con otro bucle, leera los datos restantes, desde donde lo dejó el bucle
			// anterior, hasta el final. La J siempre estara después de la I
			for (int j = i + 1; j < numeros.length; j++) {
				
				// Con éste condicional, decimos que si el número primero leído, es mayor que el
				// segundo leido,
				// éste, el número mayor, se guarde en nuestra variable auxiliar,
				// el número menor, que seria el segundo leído, se intercambia a la posición
				// dónde estaba el mayor y
				// el número mayor se mueve del auxiliar a la posicion segunda leída, que es
				// doónde estaba el menor

				if (numeros[i] > numeros[j]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
		// Con ésto, mostramos en pantalla, nuestra lista de números enteros ordenados
		// de menor a mayor.
		System.out.println(Arrays.toString(numeros));

	}
}