
/*9.- Escribe un programa que calcule el resto de una divisi�n entre enteros con el procedimiento de ir 
 * restando repetidamente el divisor del dividendo hasta que el resultado es menor que el divisor.

Ejemplo de esta operaci�n:	20 % 6

20 - 6 = 14
14 � 6 = 8
8 � 6 = 2	Ah� paramos, ya que la resta da un n�mero menor que 6. El resto vale 2*/
package ejerciciosbucles;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame un n�mero:");
		int resto = entrada.nextInt();

		System.out.println("Dame otro n�mero:");
		int num2 = entrada.nextInt();

		while (resto >= num2) {
			System.out.println(resto + " - " + num2 + " = " + (resto - num2));
			resto = resto - num2;
		}

		System.out.println("\nEl resto vale " + resto);

	}

}
