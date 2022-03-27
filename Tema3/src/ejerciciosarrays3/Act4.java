package ejerciciosarrays3;

/*4.- Diseña un programa que a partir de la siguiente tabla de temperaturas, proveniente del registro
de un termostato, indique la posición de la primera medida menor que cero. En caso de que no
hubiera ninguna temperatura negativa, se indicaría un valor de -1.
*/
public class Act4 {

	public static void main(String[] args) {
		double temp[] = { 3.2, 3.5, 7.2, 0.1, 1, -2.3, -5, 3.4, 4, 4, 4, 1.4, 2.5, -0.4, -3.6 };

		boolean positivo = true;

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] < 0) {
				System.out.println("Está en la posición " + i);
				positivo = false;

				break;
			}
		}
		if (positivo) {
			System.out.println("Resultado: -1");
		}
	}

}
