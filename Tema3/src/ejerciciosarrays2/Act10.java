package ejerciciosarrays2;

import java.util.Arrays;
import java.util.Scanner;

/*10.- Escribe un programa que pregunte las temperaturas de las últimas ocho horas y las muestre
ordenadas de menor a mayor, usando el método de selección. Al final también indicará la
temperatura menor y la mayor.*/
public class Act10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float temp[] = new float[8];
		float aux;
		int tempMin = 0;

		System.out.println("Dime las úlitmas ocho temperaturas de hoy!");
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Temperatura " + (i + 1));
			temp[i] = entrada.nextFloat();
		}

		for (int i = 0; i < temp.length - 1; i++) {
			tempMin = i;
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[j] < temp[tempMin]) {
					tempMin = j;
				}
			}
			aux = temp[tempMin];
			temp[tempMin] = temp[i];
			temp[i] = aux;
		}

		System.out.println("Las temperaturas de menor a mayor: ");
		System.out.println(Arrays.toString(temp));

		// Mostramos el contenido del array usando la clase
		System.out.println("\nTemperatura minima: " + temp[0] + " y la tempratura maxima: " + temp[temp.length - 1]);

	}

}
