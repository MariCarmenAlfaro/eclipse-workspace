package ejerciciosarrays2;

import java.util.Scanner;

/*6.- Escribe una aplicaci�n que vaya preguntando los votos de seis partidos pol�ticos en unas
elecciones y guard�ndolos en un array. Al acabar, dir� cu�l ha sido el menor n�mero de votos y cu�l
el mayor, as� como las posiciones del array que ocupan estos partidos.*/
public class Act6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double votos[] = new double[6];
		System.out.println("Dime los votos de tu partido");

		for (int i = 0; i < votos.length; i++) {
			System.out.println("Partido " + i);
			votos[i] = entrada.nextDouble();

		}

		int posiMin = 0;
		int posiMax = 0;

		for (int i = 1; i < votos.length; i++) {

			if (votos[i] < votos[posiMin]) {
				posiMin = i;
			}
			if (votos[i] > votos[posiMax]) {
				posiMax = i;
			}

		}
		System.out.println("El partido con menos votos ha sido el de la posición " + posiMin + "  con " + votos[posiMin]
				+ " votos.\n");
		System.out.println("El partido con más votos ha sido el de la posición " + posiMax + "  con " + votos[posiMax]
				+ " votos.");

	}

}
