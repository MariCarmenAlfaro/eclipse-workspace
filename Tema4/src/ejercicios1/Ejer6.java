package ejercicios1;

import java.util.Scanner;

//6.- Crea un método que tome un número decimal y devuelva su cuadrado.
public class Ejer6 {

	public static void main(String[] args) {
		System.out.println("Dime un numero y te lo diré al cuadrado");
		Scanner entrada = new Scanner(System.in);
		float numeroD = entrada.nextFloat();
		double resultado = cuadrado(numeroD);
		System.out.println("Tu número al cuadrado es " + resultado);

	}

	static double cuadrado(float numeroD) {

		return Math.pow(numeroD, 2);
	}

}
