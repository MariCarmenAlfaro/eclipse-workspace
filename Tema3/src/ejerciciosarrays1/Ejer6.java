package ejerciciosarrays1;

import java.util.Scanner;

/*6.- Escribe un programa que pida por consola los precios de diez productos y los guarde en un array.
Haz que despu�s se muestren todos los valores mediante un bucle for.*/

public class Ejer6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i ;
		int j ;
		float precios[] = new float[10];
	for(i=0; i < precios.length;i++) {
			System.out.println("Dime el precio del " + (i+1) + " producto");
			precios[i] = entrada.nextFloat();
			
		}
		System.out.println("\nAqui esta la lista de los precios de tus productos");

		for (j=0;j < precios.length;j++) {
			System.out.println(precios[j] + "euros");
			
		}

	}

}
