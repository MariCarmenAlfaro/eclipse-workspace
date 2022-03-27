package ejercicios1;

//4.- Desarrolla un método que tome un array de números enteros y lo muestre ordenado.
import java.util.Arrays;

public class Ejer4 {

	public static void main(String[] args) {

		int array[] = { 10, 20, 5, 12, 3, 2, 1 };

		colocarArray(array);


	}

	static void colocarArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			int posMin = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[posMin])
					posMin = j;
			}
			int aux = array[i];
			array[i] = array[posMin];
			array[posMin] = aux;

		}

		System.out.println("Array ordenado:");
		System.out.println(Arrays.toString(array));

	}
}
