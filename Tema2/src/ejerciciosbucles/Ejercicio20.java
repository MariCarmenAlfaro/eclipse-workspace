package ejerciciosbucles;

/*/20.- Concurso. El programa preguntar� continuamente el n�mero secreto (que es 6, evidentemente).
 *  En el momento en que el usuario acierte, se escribir� el mensaje "Felicidades" y terminar� el programa
 *  Si el usuario agota sus 10 posibilidades, el mensaje que ver� es "Has perdido".

Utiliza la instrucci�n break.*/
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu numero secreto");

		int secreto = entrada.nextInt();

		for (int i = 1; i <= 10; i++) {

			if (secreto == 6) {

				System.out.println("Felicidades");
				break;

			} else if (i <= 9) {

				System.out.println("Vuelve a introducir el numero secreto");
				secreto = entrada.nextInt();

			} else {

				System.out.println("Has perdido");

			}

		}

	}
}


