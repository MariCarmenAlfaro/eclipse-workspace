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
public class Act82 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		String respuesta;
		Boolean jugar = true;

		while (jugar) {
			System.out.println("JUGUEMOS!!\n===============");
			System.out.println("Elige:\n1)Piedra\n2)Papel\n3)Tijera");
			System.out.println("¡Inserte el número correspondiente a su respuesta!");
			numero = entrada.nextInt();

			int numAleatorio = (int) (Math.random() * 3 + 1);
			System.out.println(numAleatorio);
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

			if (numero == numAleatorio) {
				System.out.println("Uisshhh estais en empate");

			} else if (numero == 1 && numAleatorio == 2) {
				System.out.println("¡Enhorabuena!, has ganado");

			} else if (numero == 1 && numAleatorio == 3) {
				System.out.println("¡Enhorabuena!, has ganado");

			} else if (numero == 2 && numAleatorio == 1) {
				System.out.println("Oh no... ¡has perdido!");

			} else if (numero == 2 && numAleatorio == 3) {
				System.out.println("Oh no... ¡has perdido!");

			} else if (numero == 3 && numAleatorio == 2) {
				System.out.println("¡Enhorabuena!, has ganado");

			} else if (numero == 3 && numAleatorio == 1) {
				System.out.println("Oh no... ¡has perdido!");
			}
			
			System.out.println("Si desea seguir jugando escriba Continuar");
			entrada.nextLine();
			respuesta = entrada.nextLine();
			if (!respuesta.equals("Continuar") ) {
				jugar = false;
				System.out.println("Esperemos que se lo haya pasado bien");
			}
			
		}

	}
}
