
/*9.- Escribe un programa que calcule el resto de una división entre enteros con el procedimiento de ir 
 * restando repetidamente el divisor del dividendo hasta que el resultado es menor que el divisor.

Ejemplo de esta operación:	20 % 6

20 - 6 = 14
14 – 6 = 8
8 – 6 = 2	Ahí paramos, ya que la resta da un número menor que 6. El resto vale 2*/
package ejerciciosbucles;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame un número:");
		int resto = entrada.nextInt();

		System.out.println("Dame otro número:");
		int num2 = entrada.nextInt();

		while (resto >= num2) {
			System.out.println(resto + " - " + num2 + " = " + (resto - num2));
			resto = resto - num2;
		}

		System.out.println("\nEl resto vale " + resto);

	}

}
