package ejerciciosarrays2;

import java.util.Arrays;
import java.util.Scanner;

/*11.- Crea una aplicación que ordene de menor a mayor la lista de edades de los diez alumnos de un
curso de Desarrollo de Aplicaciones Web. Estas edades se pedirán por consola*/
public class Act11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edades[] = new int[10];
		int aux;
		int edadMin;
		System.out.println("Decidme vuestras edades!");

		for (int i = 0; i < edades.length; i++) {
			System.out.println("Alumno " + (i+1));
			edades[i]= entrada.nextInt();
		}

		for (int i = 0; i < edades.length - 1; i++) {
			edadMin = i;
			for (int j = i + 1; j < edades.length; j++) {
				if (edades[j] < edades[edadMin]) {
					edadMin = j;
				}
			}
			aux = edades[edadMin];
			edades[edadMin] = edades[i];
			edades[i] = aux;
		}
		System.out.println(Arrays.toString(edades));
	}

}
