package ejerciciosarrays1;

import java.util.Scanner;

/*7.- Crea un array de 10 elementos de tipo double llamado notas. Ve leyendo las diez notas desde la
consola, mediante un bucle while, y guard�ndolas en el array. A continuaci�n, muestra las diez
notas.*/

public class Ejer7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double notas[] = new double[10];
		int i = 0;
		int j=0;
		while(i<notas.length) {
			System.out.println("Dime tu " + i+ " nota");
			notas[i] =entrada.nextDouble();
			i++;
		}System.out.println("Tus notas: ");
		while(j<notas.length) {
			System.out.println(j+")"+notas[j]);
			j++;
		}

	}

}
