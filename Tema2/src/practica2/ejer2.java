package practica2;

import java.util.Scanner;

/*2.- Escribe un programa que pregunte al usuario un n�mero entero y le indique despu�s si es primo
o no.
Concretamente, deber�:
a) Pedir un n�mero al usuario, y repetir la pregunta las veces que sean necesarias hasta que
escriba un n�mero entero.
b) Probar a dividir el n�mero por todos los n�meros entre 1 y �l mismo. Cada vez que una de
estas divisiones d� resto cero, se actualizar� un contador de divisores. Ten en cuenta que
tambi�n contar� el 1 y el propio n�mero como divisores.
c) Finalmente, si el n�mero de divisores es 2, le diremos al usuario que su n�mero es primo. Y
si es distinto de 2, le diremos que es compuesto, y le indicaremos cu�ntos divisores tiene.*/
public class ejer2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
System.out.println("++++++LOS N�MEROS PRIMOS++++++\n");
		int num;
		int dividendos;

		for (int i = 1; i > 0; i++) {
			int numeroDeDivisores = 0;
			System.out.println("�Dime un n�mero entero y te dire si es primo!\n");
			if (entrada.hasNextInt()) {

				num = entrada.nextInt();

				for (dividendos = 1; dividendos <= num; dividendos++) {
					
					if (num % dividendos == 0) {
						numeroDeDivisores++;
					}
				}
				if (numeroDeDivisores == 2) {
					System.out.println(num + " es un n�mero primo.");
					break;
				} else {
					System.out.println(num +" es un n�mero compuesto y su n�mero de divisores son " + numeroDeDivisores + ".");
					break;
				}

			} else {
				entrada.nextLine();
				System.out.println("�Solamente sirven los n�meros enteros, lelo!\n");
		

			}

		}

	}

}
