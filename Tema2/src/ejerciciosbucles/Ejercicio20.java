package ejerciciosbucles;

/*/20.- Concurso. El programa preguntará continuamente el número secreto (que es 6, evidentemente).
 *  En el momento en que el usuario acierte, se escribirá el mensaje "Felicidades" y terminará el programa
 *  Si el usuario agota sus 10 posibilidades, el mensaje que verá es "Has perdido".

Utiliza la instrucción break.*/
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


