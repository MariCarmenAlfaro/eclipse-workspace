[package ejerciciosarrays2;

import java.util.Scanner;

/*2.- Crea una aplicaci�n que vaya leyendo y guardando en un array las estaturas de 10 personas. A
continuaci�n, recorrer� el array y nos informar� de si alguna de estas estaturas es mayor de 1'90 m*/
public class Act2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double alturas[] = new double[10];
		
System.out.println("--Decidme vuestras alturas--");

		boolean alto = false;
		
		for (int i = 0; i < alturas.length; i++) {
			System.out.println("Altura " + i);
			alturas[i] = entrada.nextDouble();

		}
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] > 1.90) {
				alto = true;
				break;
			}
		}
		if (alto) {
			System.out.println("Se han encontrado alguien con m�s de 1'90m  ");
		}else {
			System.out.println("No se ha encontrado persona");
		}

	}

}
