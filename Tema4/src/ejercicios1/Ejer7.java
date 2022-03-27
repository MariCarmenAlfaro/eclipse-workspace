package ejercicios1;

import java.util.Scanner;

//7.- Crea un método que tome un número decimal y devuelva su cubo.
public class Ejer7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime un número y te lo diré al cubo");
		
		float num = entrada.nextFloat();

		double resultado=cubo(num);
		System.out.println("Este es tu resultado "+resultado);

	}

	static double cubo(float num) {
		return Math.pow(num, 3);
	}

}
