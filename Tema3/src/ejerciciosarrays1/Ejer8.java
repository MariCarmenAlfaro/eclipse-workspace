package ejerciciosarrays1;

import java.util.Scanner;

/*8.- Modifica el programa anterior para que el programa pare de pedir notas si se le pasa un valor
negativo*/
public class Ejer8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double notas[] = new double[10];
		int i = 0;
		int j = 0;
		while (i < notas.length) {
			System.out.println("Dime tu " + (i+1) + " nota");
			notas[i] = entrada.nextDouble();
			if (notas[i] < 0) {
				break;
			}
			i++;

		}
		System.out.println("Tus notas: ");
		while (j < notas.length) {
			if (notas[i]>=0) {
			System.out.println((j+1) + ")" + notas[j]);
			}
			j++;
		}

	}

}
