package ejerciciosarrays1;

import java.util.Scanner;

/*11.- Crea un programa que almacene las �rdenes que debe seguir un robot en un array de 1000
elementos. Las �rdenes son palabras escritas por el usuario en la consola como:
� izquierda
� derecha
� arriba
� abajo
� matar
El programa parar� de pedir �rdenes cuando el usuario escriba "ejecutar". Entonces mostrar� la lista
de comandos que debe seguir el robot*/
public class Ejer11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		String instrucciones[] = new String[1000];
		System.out.println("Dime las instrucciones que quieras");

		while (i < instrucciones.length) {
			System.out.println("Instruccion: " + i);
			instrucciones[i] = entrada.nextLine();

			if (instrucciones[i].equals("ejecutar")) {
				break;
			}
			i++;
		}

		System.out.println("\nProcesos a realizar.\n=====================\n");
		for (i = 0; i < instrucciones.length; i++) {

			if (instrucciones[i].equals("ejecutar")) {
				System.out.println("\nProceso realizado.");
				break;
			} else {
				System.out.println("Instrucción " + (i + 1) + ": " + instrucciones[i] + ".");
			}

		}

	}

}