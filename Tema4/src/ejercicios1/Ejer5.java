package ejercicios1;

import java.util.Arrays;

//5.- Modifica la actividad anterior para que el método devuelva el array ordenado.
public class Ejer5 {

	public static void main(String[] args) {

		int numeros[] = { 10, 4, 2, 7, 7, 8 };

		int resultado[] = ordenar(numeros);

		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}

		System.out.println(Arrays.toString(numeros));
	}

	static int[] ordenar(int[] edades) {

		int posMin = 0;
		int aux;
		for (int i = 0; i < edades.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < edades.length; j++) {
				if (edades[j] < edades[posMin]) {
					posMin = j;
				}

			}
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;
		}

		return edades;

	}
}
