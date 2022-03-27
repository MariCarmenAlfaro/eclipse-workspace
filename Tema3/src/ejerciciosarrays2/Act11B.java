package ejerciciosarrays2;

import java.util.Arrays;
import java.util.Scanner;

/*11.- Crea una aplicación que ordene de menor a mayor la lista de edades de los diez alumnos de un
curso de Desarrollo de Aplicaciones Web. Estas edades se pedirán por consola*/
/*Ejerecicio colocando de mayor a menos*/
public class Act11B {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edades[] = {20, 21, 25, 30, 18, 19, 27, 24, 23, 22 };
		int aux;
		int edadMax;
		

		for (int i = 0; i <edades.length-1 ; i++) {
			edadMax = i;
			for (int j = i + 1; j <edades.length; j++) {
				if (edades[j] >edades[edadMax]) {
					edadMax = j;
				}
			}
			aux = edades[edadMax];
			edades[edadMax] = edades[i];
			edades[i] = aux;
		}
		System.out.println(Arrays.toString(edades));
	}

}
