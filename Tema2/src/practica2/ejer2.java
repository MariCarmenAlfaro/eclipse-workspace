package practica2;

import java.util.Scanner;

/*2.- Escribe un programa que pregunte al usuario un número entero y le indique después si es primo
o no.
Concretamente, deberá:
a) Pedir un número al usuario, y repetir la pregunta las veces que sean necesarias hasta que
escriba un número entero.
b) Probar a dividir el número por todos los números entre 1 y él mismo. Cada vez que una de
estas divisiones dé resto cero, se actualizará un contador de divisores. Ten en cuenta que
también contará el 1 y el propio número como divisores.
c) Finalmente, si el número de divisores es 2, le diremos al usuario que su número es primo. Y
si es distinto de 2, le diremos que es compuesto, y le indicaremos cuántos divisores tiene.*/
public class ejer2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
System.out.println("++++++LOS NÚMEROS PRIMOS++++++\n");
		int num;
		int dividendos;

		for (int i = 1; i > 0; i++) {
			int numeroDeDivisores = 0;
			System.out.println("¡Dime un número entero y te dire si es primo!\n");
			if (entrada.hasNextInt()) {

				num = entrada.nextInt();

				for (dividendos = 1; dividendos <= num; dividendos++) {
					
					if (num % dividendos == 0) {
						numeroDeDivisores++;
					}
				}
				if (numeroDeDivisores == 2) {
					System.out.println(num + " es un número primo.");
					break;
				} else {
					System.out.println(num +" es un número compuesto y su número de divisores son " + numeroDeDivisores + ".");
					break;
				}

			} else {
				entrada.nextLine();
				System.out.println("¡Solamente sirven los números enteros, lelo!\n");
		

			}

		}

	}

}
