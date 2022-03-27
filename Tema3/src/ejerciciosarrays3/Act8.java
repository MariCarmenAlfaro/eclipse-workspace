package ejerciciosarrays3;

import java.util.Scanner;

/*8.- [Este ejercicio no es de arrays] Juego de Piedra, papel o tijera. Escribe un programa que dé al
usuario la opción de elegir entre las siguientes opciones:
1) Piedra
2) Papel
3) Tijera
Una vez el usuario ha elegido, escribiendo el número de opción, el programa obtendrá un número al
azar entre 1 y 3 y resolverá quién ha ganado siguiendo las típicas reglas:
• La piedra aplasta la tijera (gana la piedra).
• La tijera corta el papel (gana la tijera).
• El papel envuelve la piedra (gana el papel).
*/
public class Act8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		String respuesta;

		for (int i = 0; i < 1000; i++) {
			System.out.println("JUGUEMOS!!\n===============");
			System.out.println("Elige:\n1)Piedra\n2)Papel\n3)Tijera");
			System.out.println("¡Inserte el número correspondiente a su respuesta!");
			numero = entrada.nextInt();

			int numAleatorio = (int) (Math.random() * 3 + 1);
			//System.out.println(numAleatorio);
			switch (numAleatorio) {
			case 1:
				System.out.println("La maquina ha sacado...Piedra!");
				break;
			case 2:
				System.out.println("La maquina ha sacado...Papel!");
				break;
			case 3:
				System.out.println("La maquina ha sacado...Tijera!");
				break;
			}

			// empate
			if (numero == numAleatorio) {
				System.out.println("Uisshhh estais en empate");
			}
			// ganar
			if (numero == 2 && numAleatorio == 1 || numero == 1 && numAleatorio == 3
					|| numero == 3 && numAleatorio == 2) {
				System.out.println("¡Enhorabuena!, has ganado");
			}
			//perder
			if (numero == 1 && numAleatorio == 2 || numero == 2 && numAleatorio == 3
					|| numero == 3 && numAleatorio == 1) {
				System.out.println("Oh no... ¡has perdido!");
			}

			System.out.println(
					"\n\n¿Desea seguir jugando?\nConteste con un \"Sí\" si desea continuar o con un \"No\" si desea parar");
			entrada.nextLine();
			respuesta = entrada.nextLine();
			if (respuesta.equals("Sí") || respuesta.equals("sí") || respuesta.equals("Si") || respuesta.equals("si")) {
				continue;
			} else {
				break;
			}

		}

	}
}
